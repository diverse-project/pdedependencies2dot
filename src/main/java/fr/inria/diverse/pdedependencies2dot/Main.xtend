package fr.inria.diverse.pdedependencies2dot;

import java.io.File
import java.nio.file.Paths
import java.util.ArrayList
import java.util.List
import org.kohsuke.args4j.Argument
import org.kohsuke.args4j.CmdLineException
import org.kohsuke.args4j.CmdLineParser
import org.kohsuke.args4j.Option

class Main {
	enum Orientation {
		horizontal,
		vertical
	}

	@Option(name="--allowedPrefixes", usage="List of allowed prefixes. If given, a found plugin/feature is not taken into account if its id doesn't match one of these prefixes.", metaVar="STRING")
	public List<String> allowedPrefixes;

	@Option(name="--filteredPrefixes", usage="List of forbidden prefixes. If given, a found plugin/feature is not taken into account if its id matches one of these prefixes.", metaVar="STRING")
	public List<String> filteredPrefixes;

	@Option(name="--outputFile", usage="Path to the output file. If given, will write into this file instead of printing to the console.")
	public File outputFile;
	
	@Option(name="--outputXMIFile", usage="Path to the XMI output file. If given, will write into this file instead of printing to the console.")
	public File outputXMIFile;

	@Option(name="--alwaysPrint", usage="If set, the output is printed even if an output file is given.")
	public Boolean alwaysPrint

	@Option(name="--orientation", usage="Sets the overall shape of the graph.")
	public Orientation orientation = Orientation.horizontal

	@Option(name="--excludedFilePatterns", usage="List of glob patterns (e.g **/badfolder/**). If given, a found plugin/feature is not taken into account if its file path matches one of these patterns", metaVar="STRING")
	public List<String> excludedFilePatterns

	@Option(name="--colorSeed", usage="Seed for the color randomizer. Each seed is a completely different color set.")
	public int colorSeed = 12

	@Option(name="--hideExternal", usage="If set, external dependencies/references for which no MANIFEST.MF/plugin.xml was found are not displayed.")
	public Boolean hideExternal;

	static val String foldersDisplayedString = "folder1,folder2,..."
	@Argument(required=true, usage="List of folders recursively containing plugins and features.", metaVar=foldersDisplayedString)
	public List<File> folders = new ArrayList<File>();

	def static void main(String[] args) {
		new Main().doMain(args)
	}

	def void doMain(String[] args) {
		val CmdLineParser parser = new CmdLineParser(this);
		parser.properties.withUsageWidth(80).withOptionValueDelimiter("=");

		try {

			// parse the arguments.
			parser.parseArgument(args);

			// setting args for step one
			val stepone = new Pdedependencies2model(folders, colorSeed)

			// setting options
			if (allowedPrefixes !== null && !allowedPrefixes.isEmpty)
				stepone.addAllowedPrefixes(allowedPrefixes)
			if (filteredPrefixes !== null && !filteredPrefixes.isEmpty)
				stepone.addFilteredPrefixes(filteredPrefixes)
			if (excludedFilePatterns !== null)
				stepone.addExcludedFilePatterns(excludedFilePatterns)

			// starting step one	
			stepone.generate
			if (outputXMIFile !== null) {
				stepone.outputFile = outputXMIFile
				stepone.saveModelToFile
			}

			// setting parameter for step two
			val steptwo = new Model2dot(stepone.graph)

			if (outputFile !== null)
				steptwo.outputFile = outputFile

			if (alwaysPrint !== null || (outputFile === null && outputXMIFile === null))
				steptwo.alwaysPrint = alwaysPrint

			if (orientation !== null)
				steptwo.orientation = orientation

			if (hideExternal !== null)
				steptwo.hideExternal = true

			// starting step two
			steptwo.generate

		} catch (CmdLineException e) {

			val potentialJar = Paths.get(Main.getProtectionDomain().getCodeSource().getLocation().getPath())
			val jarName = if (potentialJar.toString.endsWith("jar")) {
					val currentDir = Paths.get(".").toAbsolutePath.parent
					currentDir.relativize(potentialJar)
				} else {
					"pdedependencies2dot.jar"
				}

			System.err.println(e.getMessage());
			System.err.println('''Usage: java -jar «jarName» [options...] «foldersDisplayedString»''');
			System.err.println()
			System.err.println("Arguments and options:")
			parser.printUsage(System.err)

			return;
		}
	}

}
