package osgi2dot

import java.io.File
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
import org.eclipse.xtend.lib.annotations.Accessors
import org.xml.sax.SAXException
import org.xml.sax.helpers.DefaultHandler
import osgi2dot.model.Feature
import osgi2dot.model.ModelFactory
import osgi2dot.model.PDEGraph
import osgi2dot.model.Plugin
import java.util.Random

class Pdedependencies2model {

	// Mandatory inputs
	private List<File> folders = new ArrayList<File>();

	// Optional inputs
	private List<String> allowedPrefixes;
	private List<String> filteredPrefixes;

	static val String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName"
	static val String REQUIRE_BUNDLE = "Require-Bundle"
	static val ModelFactory factory = ModelFactory.eINSTANCE
	private static Random random = new Random(12)
	// Output 
	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER)
	private val PDEGraph graph = factory.createPDEGraph

	
	
	new(List<File> folders) {
		this.folders.addAll(folders)
		graph.name = "awesomeGraph"
		graph.hue = random.nextFloat
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

	private def void addDep(String name, String dep) {
		if(okPrefix(name) && okPrefix(dep)) {
			findPluginOrCreate(name).dependencies.add(findPluginOrCreate(dep))
		}
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
	}

	private def boolean okPrefix(String n) {
		val boolean hasAllowedPrefixes = allowedPrefixes != null && !allowedPrefixes.isEmpty
		val boolean hasFilteredPrefixes = filteredPrefixes != null && !filteredPrefixes.isEmpty
		return (!hasAllowedPrefixes || allowedPrefixes.exists[p|n.startsWith(p)]) &&
			(!hasFilteredPrefixes || !filteredPrefixes.exists[p|n.startsWith(p)])
	}

	private def Plugin findPluginOrCreate(String name) {
		var plugin = graph.eAllContents.filter(Plugin).findFirst[p|p.name.equals(name)]
		if(plugin == null) {
			plugin = factory.createPlugin
			plugin.name = name
		}
		return plugin
	}
	
	private def Feature findFeatureOrCreate(String name) {
		var feature = graph.eAllContents.filter(Feature).findFirst[f|f.name.equals(name)]
		if(feature == null) {
			feature = factory.createFeature
			feature.name = name
			feature.hue = random.nextFloat
		}
		return feature
	}

	private def void processFeatureXML(Path featurePath) {
		val SAXParserFactory saxfactory = SAXParserFactory.newInstance();
		saxfactory.setValidating(true);

		val SAXParser saxParser = saxfactory.newSAXParser();
		val handler = new FeatureXMLHandler()
		saxParser.parse(featurePath.toFile, handler)

		if(okPrefix(handler.featureName)) {
			val featureCluster = findFeatureOrCreate(handler.featureName)
			featureCluster.containingGraph = graph
			for (p : handler.containedPlugins) {
				if(okPrefix(p)) {
					val plugin = findPluginOrCreate(p)
					if(plugin.containingElement != null && plugin.containingElement instanceof Feature)
						featureCluster.additionnalPlugins.add(plugin)
					else
						featureCluster.plugins.add(plugin)
				}
			}

			for (r : handler.requiredFeatures) {
				if(okPrefix(r)) {
					val feature = findFeatureOrCreate(r)
					feature.containingGraph = graph
					featureCluster.requiredFeatures.add(feature)
				}
			}
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
		val allRequired = if(attributes.get(requireName) != null) attributes.get(requireName) as String else null

		if(allRequired != null && !allRequired.equals("")) {
			for (r : allRequired.split(",")) {
				addDep(name, parseManifestValue(r))
			}
		} else {
			val plugin = findPluginOrCreate(name)
			if (plugin.containingElement == null)
				graph.plugins.add(plugin)
		}
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
			return FileVisitResult.CONTINUE;
		}
	}
}