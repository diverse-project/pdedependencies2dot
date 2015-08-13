package osgi2dot

import java.io.PrintWriter
import java.nio.file.FileSystems
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.PathMatcher
import java.nio.file.Paths
import java.nio.file.SimpleFileVisitor
import java.nio.file.StandardOpenOption
import java.nio.file.attribute.BasicFileAttributes
import java.util.HashSet
import java.util.Set
import java.util.jar.Attributes
import java.util.jar.Manifest
import javax.xml.parsers.SAXParser
import javax.xml.parsers.SAXParserFactory
import org.xml.sax.SAXException
import org.xml.sax.helpers.DefaultHandler

import static java.nio.file.FileVisitResult.*

class Osgi2dot {

	public static final Set<String> PATHS = #{
		"/home/ebousse/Dev/gemoc-dev/org/gemoc/execution",
		"/home/ebousse/Dev/gemoc-dev/org/gemoc/gemoc_commons",
		"/home/ebousse/Dev/gemoc-dev/org/gemoc/gemoc_language_workbench",
		"/home/ebousse/Dev/gemoc-dev/org/gemoc/gemoc_modeling_workbench",
		"/home/ebousse/Dev/gemoc-dev/org/gemoc/gemoc_studio",
		//"/home/ebousse/Dev/gemoc-dev/org/gemoc/MoCC",
		"/home/ebousse/Dev/gemoc-dev/fr"
	}

	public static final Set<String> PREFIXES = #{
		"org.gemoc"
	//"fr.inria",
	//"fr.obeo"
	}

	public static final Set<String> PREFIXESNOT = #{
		"org.gemoc.gemoc_language_workbench.documentation",
		"org.gemoc.gemoc_language_workbench.guideline",
		"org.gemoc.gemoc_language_workbench.process",
		"org.gemoc.gemoc_language_workbench.dashboard",
		"org.gemoc.commons",
		"org.gemoc.execution.engine.trace.model.edit",
		"org.gemoc.gemoc_language_workbench.conf.model.edit",
		"org.gemoc.execution.engine.commons",
		"org.gemoc.gemoc_language_workbench.sample",
		"org.gemoc.gemoc_language_workbench.utils"
	}

	/**
	 * From https://docs.oracle.com/javase/tutorial/essential/io/find.html
	 */
	public static class Finder extends SimpleFileVisitor<Path> {

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

	//	public static val Map<String, Set<String>> pluginsGraph = new HashMap
	//	public static val Map<String, Set<String>> featureClusters = new HashMap
	//	public static val Map<String, Set<String>> featureRequire = new HashMap
	static val DependencyGraph graph = new DependencyGraph;

	private static def String parseManifestValue(String value) {
		var String result = value
		result = result.replaceAll(" ", "");
		val indexColon = result.indexOf(";");
		if(indexColon != -1) {
			result = result.substring(0, indexColon)
		}
		return result;
	}

	private static def boolean okPrefix(String n) {
		return PREFIXES.exists[p|n.startsWith(p)] && !PREFIXESNOT.exists[p|n.startsWith(p)]
	}

	private static def void addDep(String name, String dep) {
		if(okPrefix(name) && okPrefix(dep)) {
			graph.getPlugin(name).addDependency(graph.getPlugin(dep))
		}
	}

	static val String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName"
	static val String REQUIRE_BUNDLE = "Require-Bundle"

	public static def void processManifest(Path manifestPath) {
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
		val allRequired = attributes.get(requireName) as String

		if(allRequired != null && !allRequired.equals("")) {
			for (r : allRequired.split(",")) {
				addDep(name, parseManifestValue(r))
			}
		}
	}

	static class FeatureXMLHandler extends DefaultHandler {
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


	public static def void processFeatureXML(Path featurePath) {
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

	public static def String clusterName(String featureName) {
		return "cluster_" + featureName
	}


	public static def String toDot() {
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

	public static def void main(String[] args) {

		val Finder finder = new Finder();
		for (p : PATHS)
			Files.walkFileTree(Paths.get(p), finder);

		for (p : finder.featureResults) {
			processFeatureXML(p)
		}

		for (p : finder.manifestResults) {
			processManifest(p)
		}
	

		val PrintWriter out = new PrintWriter("/tmp/yay.dot");

		println(toDot)
		out.print(toDot);

		out.close

	}

}
