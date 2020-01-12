package fr.inria.diverse.pdedependencies2dot

import fr.inria.diverse.pdedependencies2dot.model.Bundle
import fr.inria.diverse.pdedependencies2dot.model.Feature
import fr.inria.diverse.pdedependencies2dot.model.ModelFactory
import fr.inria.diverse.pdedependencies2dot.model.PDEGraph
import fr.inria.diverse.pdedependencies2dot.model.Plugin
import fr.inria.diverse.pdedependencies2dot.model.Product
import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter
import java.io.StringWriter
import java.nio.file.FileSystems
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.PathMatcher
import java.nio.file.SimpleFileVisitor
import java.nio.file.StandardOpenOption
import java.nio.file.attribute.BasicFileAttributes
import java.util.ArrayList
import java.util.Arrays
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Random
import java.util.Set
import java.util.jar.Attributes
import java.util.jar.Manifest
import javax.xml.parsers.SAXParser
import javax.xml.parsers.SAXParserFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.URIConverter
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtend.lib.annotations.Accessors
import org.xml.sax.SAXException
import org.xml.sax.helpers.DefaultHandler

class Pdedependencies2model {

	// Mandatory inputs
	List<File> folders = new ArrayList<File>();
	int seed

	// Optional inputs
	List<String> allowedPrefixes;
	List<String> filteredPrefixes;
	List<String> excludedFilePatterns;

	// Manifest values to fetch
	static val String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName"
	static val String REQUIRE_BUNDLE = "Require-Bundle"
	static val String IMPORT_PACKAGE = "Import-package"
	static val String EXPORT_PACKAGE = "Export-package"
	static val String BUNDLE_CLASSPATH = "Bundle-ClassPath"
	static val String BUNDLE_VERSION = "Bundle-Version"
	static val String EXPORT_BUNDLE_TYPE = "ExportBundle"
	static val String BUNDLE_TYPE = "Bundle"
	static val String PLUGIN_TYPE = "Plugin"


	// Output
	
	val Random random
	static val ModelFactory factory = ModelFactory.eINSTANCE
	
	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER)
	val PDEGraph graph = factory.createPDEGraph

	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER)
	File outputFile;

	@Accessors(PUBLIC_SETTER, PRIVATE_GETTER)
	boolean hideExternal

	ResourceSetImpl resourceSet;
	Resource resource;
	StringWriter stringWriter;
	URIConverter.WriteableOutputStream outputStream;
	Map<String, String> options;

	/**
	 * Constructor
	 */
	new(List<File> folders, int colorSeed) {
		
		this.folders.addAll(folders)
		graph.name = rootProjectName
		graph.description = rootProjectComment
		random = new Random(colorSeed)
		random.nextFloat
		graph.hue = random.nextFloat
		seed = colorSeed
		allowedPrefixes = new ArrayList
		filteredPrefixes = new ArrayList
		excludedFilePatterns = new ArrayList
	}
	
	// CMD RESULT FILTERS ------------------------------------- 
	
	def void addAllowedPrefixes(String... prefixes) {
		this.allowedPrefixes.addAll(prefixes)
	}

	def void addFilteredPrefixes(String... prefixes) {
		this.filteredPrefixes.addAll(prefixes)
	}

	def void addExcludedFilePatterns(String... patterns) {
		this.excludedFilePatterns.addAll(patterns)
	}

	/**
	 * Generate tree containing results from processed files
	 */
	def void generate() {
		val Finder finder = new Finder(excludedFilePatterns);
		for (p : folders)
			Files.walkFileTree(p.toPath, finder);
		for (p : finder.productResults)
			processProductFile(p)
		for (p : finder.featureResults)
			processFeatureXML(p)
		for (p : finder.manifestResults)
			processManifest(p)
	}

	/**
	 * Output EMF model to XMI file
	 */
	def void saveModelToFile() {
		
		if(outputFile === null) {
			return
		}
		
		var PrintWriter out;

		// Save EMF resource
		Resource.Factory.Registry.INSTANCE
		.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());

		resourceSet = new ResourceSetImpl();
		resource = resourceSet.createResource(URI.createFileURI("pdegraph.ecore"));
		resource.getContents().add(graph);

		stringWriter = new StringWriter();
		outputStream = new URIConverter.WriteableOutputStream(stringWriter, "UTF-8");
		options = new HashMap();
		resource.save(outputStream, options);

		var graphEcoreOutput = stringWriter.toString();

		try {
			out = new PrintWriter(outputFile)
			out.print(graphEcoreOutput);
		} catch(FileNotFoundException exc) {
			System.err.println("An error occured when trying to write " + outputFile + ": " + exc.message)
		} finally {
			out?.close
		}
	}

	// UTILITY METHODS ----------------------

	/**
	 * Returns true if given prefix n is allowed by cmd parameters
	 */
	private def boolean okPrefix(String n) {
		val boolean hasAllowedPrefixes = (allowedPrefixes !== null && !allowedPrefixes.isEmpty)
		val boolean hasFilteredPrefixes = (filteredPrefixes !== null && !filteredPrefixes.isEmpty)
		val boolean beginsWithChar = Character.isLetter(n.charAt(0))
		return beginsWithChar
			&& (!hasAllowedPrefixes || allowedPrefixes.exists[p|n.startsWith(p)])
			&& (!hasFilteredPrefixes || !filteredPrefixes.exists[p|n.startsWith(p)])
	}
	
	// EMF model construction helpers

	/**
	 * Find the plugin where name is equal to 'name' else create a new one
	 */
	private def Plugin findPluginOrCreate(String name, String params) {
		var plugin = graph.eAllContents.filter(Plugin).findFirst[p|p.name.equals(name)]
		if(plugin === null) {
			plugin = factory.createPlugin
			plugin.name = name
			if (params !== null && !params.isEmpty())
				plugin.parameters = params.replaceAll("\"","");
			plugin.processed = false
			plugin.containingElement = graph
		}
		return plugin
	}
	
	/**
	 * Find the bundle where name is equal to 'name' else create a new one
	 */
	private def Bundle findBundleOrCreate(String name, String params) {
		var bundle = graph.eAllContents.filter(Bundle).findFirst[p|p.name.equals(name)]
		if(bundle === null) {
			bundle = factory.createBundle
			bundle.name = name
			if (params !== null && !params.isEmpty())
				bundle.parameters = params.replaceAll("\"","");
			bundle.processed = false
			bundle.containingElement = graph
		}
		return bundle
	}

	/**
	 * Find feature named 'name', if doesn't exist create a new one
	 */
	private def Feature findFeatureOrCreate(String name) {
		var feature = graph.eAllContents.filter(Feature).findFirst[f|f.name.equals(name)]
		if(feature === null) {
			feature = factory.createFeature
			feature.name = name
			feature.hue = random.nextFloat
			feature.processed = false
			feature.containingGraph = graph
		}
		return feature
	}
	
	/**
	 * Find product named 'name', if doesn't exist create a new one
	 */
	private def Product findProductOrCreate(String name) {
		var product = graph.eAllContents.filter(Product).findFirst[f|f.name.equals(name)]
		if(product === null) {
			product = factory.createProduct
			product.name = name
			product.hue = random.nextFloat
			product.processed = false
			product.containingGraph = graph
		}
		return product
	}
	
	/**
	 * Adds the dependency oneRequired to the plugin
	 */
	private def void addOneDependency(Plugin plugin, String oneRequired, String type) {
		val rname = parseManifestValueName(oneRequired)
		val rparams = parseManifestValueParameters(oneRequired)
		// TODO : get plugin version
		
		if(okPrefix(rname)) {
			
			if (type.equals(PLUGIN_TYPE)) {
				val reqPlugin = findPluginOrCreate(rname, rparams)
				plugin.importedPackages.add(reqPlugin)
			}
				
			else if (type.equals(BUNDLE_TYPE)) {
				val reqBundle = findBundleOrCreate(rname,rparams)
				plugin.requiredBundles.add(reqBundle)
			} 
			
			else if (type.equals(EXPORT_BUNDLE_TYPE)) {
				val provBundle = findBundleOrCreate(rname, rparams)
				plugin.exportedBundles.add(provBundle)
			}
				
		}
	}

	/**
	 * Adds a list of dependencies allRequired to the plugin
	 */
	private def void addDependencies(Plugin plugin, String allRequired, String type) {
		
		// Split the string containing the dependencies separated by a comma
		// The regex avoids splitting the string inside an array of parameters which is also separated by a comma
		val arrayRequired = allRequired.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)")
		
		// Add each dependency in the array to the plugin
		var String full_str = ""
		for (r : arrayRequired) {
			if (Character.isDigit(r.charAt(0))) {
				full_str = full_str + "," + r
			} else {
				if (full_str !== "") {
					addOneDependency(plugin, full_str, type)
				}
				full_str = r
			}
		}
		if (full_str !== "") {
			addOneDependency(plugin, full_str, type)
		}
	}
	
	// FILE PARSING METHOD -------------------

	/**
	 * Process the the feature XML
	 */
	private def void processFeatureXML(Path featurePath) {
		val SAXParserFactory saxfactory = SAXParserFactory.newInstance();
		saxfactory.setValidating(true);

		val SAXParser saxParser = saxfactory.newSAXParser();
		val handler = new FeatureXMLHandler()
		saxParser.parse(featurePath.toFile, handler)
		
		// If featureName deos not belong to desired prefix, stop here
		if(!okPrefix(handler.featureName)) {
			return
		}

		// Find or create the feature
		val feature = findFeatureOrCreate(handler.featureName)
		feature.processed = true
		
		// Add plugins to PluginContainer
		for (p : handler.containedPlugins) {
			if(okPrefix(p)) {
				val plugin = findPluginOrCreate(p, null)
				if(plugin.containingElement !== null && plugin.containingElement instanceof Feature)
					feature.additionnalPlugins.add(plugin)
				else
					feature.plugins.add(plugin)
			}
		}

		// Add to the feature, other features that it depends on
		for (r : handler.requiredFeatures) {
			if(okPrefix(r)) {
				val reqfeature = findFeatureOrCreate(r)
				feature.requiredFeatures.add(reqfeature)
			}
		}

		// Add the plugins this feature depends on
		for (rp : handler.requiredPlugins) {
			if(okPrefix(rp)) {
				val reqplugin = findPluginOrCreate(rp, null)
				feature.requiredPlugins.add(reqplugin)
			}
		}

	}
	
	/**
	 * Process .product file
	 */
	private def void processProductFile(Path productPath) {
		
		val SAXParserFactory saxfactory = SAXParserFactory.newInstance();
		saxfactory.setValidating(true);

		val SAXParser saxParser = saxfactory.newSAXParser();
		val handler = new ProductFileHandler()
		saxParser.parse(productPath.toFile, handler)
		
		// If productName does not belong to desired prefix, stop here
		if(!okPrefix(handler.productName)) {
			return
		}

		// Find or create the product
		val product = findProductOrCreate(handler.productName)
		product.processed = true
		
		// Add plugins to PluginContainer
		for (p : handler.features) {
			if(okPrefix(p)) {
				val feature = findFeatureOrCreate(p)
				product.features.add(feature)
			}
		}
	}

	/**
	 * Process manifest.mf
	 */
	private def void processManifest(Path manifestPath) {
		val inputStream = Files.newInputStream(manifestPath, {StandardOpenOption.READ})
		var Manifest manifest = new Manifest(inputStream)
		val Attributes attributes = manifest.getMainAttributes();

		val bundleSymbolicName = attributes.keySet.findFirst[a|
			(a as Attributes.Name).equals(new Attributes.Name(BUNDLE_SYMBOLIC_NAME))]
			
		val requireBundle = attributes.keySet.findFirst[a|
			(a as Attributes.Name).equals(new Attributes.Name(REQUIRE_BUNDLE))]
			
		val importPackage = attributes.keySet.findFirst[a|
			(a as Attributes.Name).equals(new Attributes.Name(IMPORT_PACKAGE))]
			
		val exportPackage = attributes.keySet.findFirst[a|
			(a as Attributes.Name).equals(new Attributes.Name(EXPORT_PACKAGE))]
			
		// TODO : add bundleVersion
		
		val pluginName = parseManifestValueName(attributes.get(bundleSymbolicName) as String)
		val pluginParameters = null

		if(!okPrefix(pluginName)) {
			return;
		}
		val plugin = findPluginOrCreate(pluginName, pluginParameters)
		plugin.processed = true

		// Add to plugin list of required bundles
		val requiredBundles = if (attributes.get(requireBundle) !== null) {
				attributes.get(requireBundle) as String
			} else {
				null
			}
	
		if(requiredBundles !== null && !requiredBundles.equals("")) {
			addDependencies(plugin, requiredBundles, "Bundle")
		}
		
		// Add to plugin, list of export packages (bundles)
		val providedBundles = if (attributes.get(exportPackage) !== null) {
				attributes.get(exportPackage) as String
			} else {
				null
			}
	
		if(providedBundles !== null && !providedBundles.equals("")) {
			addDependencies(plugin, providedBundles, "ExportBundle")
		}
		
		// Add to plugin list of required packages (plugins)
		val requiredPackages = if (attributes.get(importPackage) !== null) {
				attributes.get(importPackage) as String
			} else {
				null
			}
	
		if(requiredPackages !== null && !requiredPackages.equals("")) {
			addDependencies(plugin, requiredPackages, "Plugin")
		}
		
	}
	
	/**
	 * Return only the name of the dependency
	 */
	private static def String parseManifestValueName(String value) {
		var String result = value
		result = result.replaceAll(" ", "");
		val indexColon = result.indexOf(";");
		if(indexColon != -1) {
			result = result.substring(0, indexColon)
		}
		return result;
	}
	
	/**
	 * Return only the paramters of the dependency
	 */
	private static def String parseManifestValueParameters(String value) {
		
		var String params = null
		var String result = value
		var  valueList = result.split(";")
		
		if (valueList.length > 0) {
			var paramList = Arrays.copyOfRange(valueList, 1, valueList.length);
			params = String.join(";", paramList)
		}
		
		return params
	}
	
	/**
	 * Returns the name of the root project from the .project file 
	 */
	private def String rootProjectName() {
		
		var projectName = ""
		
		val Finder finder = new Finder(excludedFilePatterns);
		Files.walkFileTree(folders.get(0).toPath, finder);
	
		val SAXParserFactory saxfactory = SAXParserFactory.newInstance();
		saxfactory.setValidating(true);

		val SAXParser saxParser = saxfactory.newSAXParser();
		val handler = new ProjectFileHandler()
		saxParser.parse(new File(folders.get(0).getAbsoluteFile().getParent()+ File.separator +".project"), handler)
		
		projectName = handler.projectName
		
		return projectName
		
	}
	
	/**
	 * Returns the comment of the root project from the .project file 
	 */
	private def String rootProjectComment() {
		
		var projectComment = ""
		
		val Finder finder = new Finder(excludedFilePatterns);
		Files.walkFileTree(folders.get(0).toPath, finder);
	
		val SAXParserFactory saxfactory = SAXParserFactory.newInstance();
		saxfactory.setValidating(true);

		val SAXParser saxParser = saxfactory.newSAXParser();
		val handler = new ProjectFileHandler()
		saxParser.parse(new File(folders.get(0).getAbsoluteFile().getParent()+ File.separator +".project"), handler)
		
		projectComment = handler.projectComment
		
		return projectComment
	}
	
	// File handlers ------------------------------
	

	/**
	 * Extracts content from feature.xml files
	 */
	private static class FeatureXMLHandler extends DefaultHandler {
		String featureName
		Set<String> containedPlugins = new HashSet
		Set<String> requiredFeatures = new HashSet
		Set<String> requiredPlugins = new HashSet

		override startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws SAXException {
			if(qName.equals("feature"))
				featureName = attributes.getValue("id")
			else if(qName.equals("plugin"))
				containedPlugins.add(attributes.getValue("id"))
			else if(qName.equals("import")) {
				val featureName = attributes.getValue("feature")
				if (featureName !== null)
					requiredFeatures.add(featureName)
				else {
					val pluginName = attributes.getValue("plugin")
					requiredPlugins.add(pluginName)
				}
			}

		}
	}
	
	/**
	 * Extracts content from from *.product files
	 */
	private static class ProductFileHandler extends DefaultHandler {
		String productName
		Set<String> features = new HashSet

		override startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws SAXException {
			if(qName.equals("product"))
				productName = attributes.getValue("uid")
			else if(qName.equals("plugin"))
				features.add(attributes.getValue("id"))
		}
	}
	
	/**
	 * Extracts content from .project file
	 */
	private static class ProjectFileHandler extends DefaultHandler {
		String projectName = ""
		String projectComment = ""
		StringBuilder data = null;
	
		boolean foundNameOpenningTag = false;
		boolean foundCommentOpenningTag = false;
		
		boolean nameFound = false;
		boolean commentFound = false;
	
		override startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws SAXException {
	
			if (qName.equalsIgnoreCase("name")) {
				foundNameOpenningTag = true;
			} else if (qName.equalsIgnoreCase("comment")) {
				foundCommentOpenningTag = true;
			} 
			
			// Create the data container
			data = new StringBuilder();
		}
	
		override endElement(String uri, String localName, String qName) throws SAXException {
			// if found openning tag for 'name' then we add the content to projectName and indiciate that we have found it
			if (foundNameOpenningTag && !nameFound) {
				projectName = data.toString();
				foundNameOpenningTag = false;
				nameFound = true
			} 
			// if found openning tag for 'comment' then we add the content to projectComment and indiciate that we have found it
			else if (foundCommentOpenningTag && !commentFound) {
				projectComment = data.toString();
				foundCommentOpenningTag = false;
				commentFound = true;
			}
		}
		
		override characters(char[] ch, int start, int length) throws SAXException {
			data.append(new String(ch, start, length));
		}
	}

	/**
	 * From https://docs.oracle.com/javase/tutorial/essential/io/find.html
	 */
	private static class Finder extends SimpleFileVisitor<Path> {

		final PathMatcher manifestMatcher;
		final PathMatcher featureMatcher;
		final PathMatcher productMatcher;
		final PathMatcher projectMatcher;
		final List<PathMatcher> excludeFilesPatternMatcher = new ArrayList;

		new(List<String> excludeFilesPatterns) {
			manifestMatcher = FileSystems.getDefault().getPathMatcher("glob:MANIFEST.MF");
			featureMatcher = FileSystems.getDefault().getPathMatcher("glob:feature.xml");
			productMatcher = FileSystems.getDefault().getPathMatcher("glob:*.product");
			projectMatcher = FileSystems.getDefault().getPathMatcher("glob:.project");

			if(excludeFilesPatterns !== null) {
				for (p : excludeFilesPatterns)
					excludeFilesPatternMatcher.add(FileSystems.getDefault().getPathMatcher("glob:" + p))
			}
		}

		Set<Path> manifestResults = new HashSet<Path>;
		Set<Path> featureResults = new HashSet<Path>;
		Set<Path> productResults = new HashSet<Path>;
		Set<Path> projectResults = new HashSet<Path>;

		// Compares the glob pattern against the file or directory name.
		def void find(Path file) {
			val Path name = file.getFileName();
			if(!excludeFilesPatternMatcher.exists[pm|pm.matches(file)]) {
				if(name !== null) {
					if(manifestMatcher.matches(name)) {
						manifestResults.add(file);
					} else if(featureMatcher.matches(name)) {
						featureResults.add(file);
					} else if (productMatcher.matches(name)) {
						productResults.add(file);	
					} else if (projectMatcher.matches(name)) {
						projectResults.add(file);	
					}
				}
			}
		}
 
		/**
		 * Invoke the patternmatching method on each file.
		 */
		override FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			find(file);
			return FileVisitResult.CONTINUE;
		}
		
	}
}
