package osgi2dot

import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter
import java.nio.file.FileSystems
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.PathMatcher
import java.nio.file.SimpleFileVisitor
import java.nio.file.StandardOpenOption
import java.nio.file.attribute.BasicFileAttributes
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import java.util.jar.Attributes
import java.util.jar.Manifest
import javax.xml.parsers.SAXParser
import javax.xml.parsers.SAXParserFactory
import org.xml.sax.SAXException
import org.xml.sax.helpers.DefaultHandler

import static java.nio.file.FileVisitResult.*

class Osgi2dot {

	static val String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName"
	static val String REQUIRE_BUNDLE = "Require-Bundle"

	// Mandatory inputs
	private List<File> folders = new ArrayList<File>();

	// Optional inputs
	private List<String> allowedPrefixes;
	private List<String> filteredPrefixes;
	private File outputFile;

	// Transient
	private val DependencyGraph graph = new DependencyGraph;

	new(List<File> folders) {
		this.folders.addAll(folders)
	}

	public def void addAllowedPrefixes(String... prefixes) {
		if(allowedPrefixes == null)
			this.allowedPrefixes = new ArrayList
		this.allowedPrefixes.addAll(prefixes)
	}

	public def void addFilteredPrefixes(String... prefixes) {
		if(filteredPrefixes == null)
			this.filteredPrefixes = new ArrayList
		this.filteredPrefixes.addAll(prefixes)
	}

	public def void setOutputFile(File file) {
		outputFile = file;
	}

	private static def String parseManifestValue(String value) {
		var String result = value
		result = result.replaceAll(" ", "");
		val indexColon = result.indexOf(";");
		if(indexColon != -1) {
			result = result.substring(0, indexColon)
		}
		return result;
	}

	private def boolean okPrefix(String n) {
		val boolean hasAllowedPrefixes = allowedPrefixes != null && !allowedPrefixes.isEmpty
		val boolean hasFilteredPrefixes = filteredPrefixes != null && !filteredPrefixes.isEmpty
		return (!hasAllowedPrefixes || allowedPrefixes.exists[p|n.startsWith(p)]) &&
			(!hasFilteredPrefixes || !filteredPrefixes.exists[p|n.startsWith(p)])
	}

	private def void addDep(String name, String dep) {
		if(okPrefix(name) && okPrefix(dep)) {
			graph.getPlugin(name).addDependency(graph.getPlugin(dep))
		}
	}

	private def void processManifest(Path manifestPath) {
		val inputStream = Files.newInputStream(manifestPath,
			{
				StandardOpenOption.READ
			})
		var Manifest manifest = new Manifest(inputStream)

		val Attributes attributes = manifest.getMainAttributes();

		val bundleName = attributes.keySet.findFirst[a|
			(a as Attributes.Name).equals(new Attributes.Name(BUNDLE_SYMBOLIC_NAME))]
		val requireName = attributes.keySet.findFirst[a|
			(a as Attributes.Name).equals(new Attributes.Name(REQUIRE_BUNDLE))]

		val name = parseManifestValue(attributes.get(bundleName) as String)
		val allRequired = if (attributes.get(requireName) != null) attributes.get(requireName) as String else null
		
		

		if(allRequired != null && !allRequired.equals("")) {
			for (r : allRequired.split(",")) {
				addDep(name, parseManifestValue(r))
			}
		} else {
			graph.getPlugin(name) // will create the plugin in the graph
		}
	}

	public def void processFeatureXML(Path featurePath) {
		val SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setValidating(true);

		val SAXParser saxParser = factory.newSAXParser();
		val handler = new FeatureXMLHandler()
		saxParser.parse(featurePath.toFile, handler)

		if(okPrefix(handler.featureName) && !handler.containedPlugins.empty) {
			val featureCluster = graph.getFeature(handler.featureName)
			for (p : handler.containedPlugins) {
				if(okPrefix(p)) {
					featureCluster.addPlugin(p)
				}
			}

			for (r : handler.requiredFeatures) {
				if(okPrefix(r)) {
					featureCluster.addRequiredFeature(graph.getFeature(r))
				}
			}
		}

	}

	private static def String clusterName(String featureName) {
		return "cluster_" + featureName
	}

	private def String generateDot() {
		return '''
digraph awesomeGraph {
	compound=true;
	node [shape=box, color=black,style=filled,fillcolor="«FeatureCluster.getRootNodeColor»"];
	

	«FOR featureCluster : graph.features» 
		subgraph "«clusterName(featureCluster.name)»" {
			node [shape=box, color=black,style=filled,fillcolor="«featureCluster.nodeColor»"];
			style=filled;
			color="«featureCluster.featureColor»";
			label="«featureCluster.name»";
			«FOR plugin : featureCluster.plugins»
			"«plugin.name»";
			«ENDFOR»
		}
	«ENDFOR»
	
	«FOR plugin : graph.allPlugins»
		«FOR dep : plugin.dependencies»
			"«plugin.name»" -> "«dep.name»" [color="«plugin.color»"];
		«ENDFOR» 
	«ENDFOR»
	
	«FOR plugin : graph.rootPlugins»
		"«plugin.name»";
	«ENDFOR»
	
	«FOR featureCluster : graph.features»
		«FOR req : featureCluster.requiredFeatures»
		«IF !featureCluster.plugins.empty && !req.plugins.empty»
		"«featureCluster.plugins.get(0).name»"-> "«req.plugins.get(0).name»" [ltail="«clusterName(featureCluster.name)»",lhead="«clusterName(
			req.name)»", style="setlinewidth(8)", color="«featureCluster.edgeColor»"];
		«ENDIF»
		«ENDFOR»
	«ENDFOR»
}
		'''
	}

	public def void generate() {

		val Finder finder = new Finder();
		for (p : folders)
			Files.walkFileTree(p.toPath, finder);

		for (p : finder.featureResults) {
			processFeatureXML(p)
		}

		for (p : finder.manifestResults) {
			processManifest(p)
		}

		val String result = generateDot

		if(outputFile != null) {
			var PrintWriter out;
			try {
				out = new PrintWriter(outputFile)
				out.print(result);
			} catch(FileNotFoundException exc) {
				System.err.println("An error occured when trying to write " + outputFile + ": " + exc.message)
			} finally {
				out?.close
			}

		} else {
			println(result)
		}
	}

	private static class FeatureXMLHandler extends DefaultHandler {
		String featureName
		Set<String> containedPlugins = new HashSet
		Set<String> requiredFeatures = new HashSet

		override startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws SAXException {
			if(qName.equals("feature"))
				featureName = attributes.getValue("id")
			else if(qName.equals("plugin"))
				containedPlugins.add(attributes.getValue("id"))
			else if(qName.equals("import")) {
				requiredFeatures.add(attributes.getValue("feature"))
			}

		}
	}

	/**
	 * From https://docs.oracle.com/javase/tutorial/essential/io/find.html
	 */
	private static class Finder extends SimpleFileVisitor<Path> {

		private final PathMatcher manifestMatcher;
		private final PathMatcher featureMatcher;

		new() {
			manifestMatcher = FileSystems.getDefault().getPathMatcher("glob:MANIFEST.MF");
			featureMatcher = FileSystems.getDefault().getPathMatcher("glob:feature.xml");
		}

		Set<Path> manifestResults = new HashSet<Path>;
		Set<Path> featureResults = new HashSet<Path>;

		// Compares the glob pattern against
		// the file or directory name.
		def void find(Path file) {
			val Path name = file.getFileName();
			if(name != null) {
				if(manifestMatcher.matches(name)) {
					manifestResults.add(file);
				} else if(featureMatcher.matches(name)) {
					featureResults.add(file)
				}
			}
		}

		// Invoke the patternmatching
		// method on each file.
		@Override
		public override FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			find(file);
			return CONTINUE;
		}
	}

}
