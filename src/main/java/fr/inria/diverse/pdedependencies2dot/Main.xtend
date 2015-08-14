package fr.inria.diverse.pdedependencies2dot;

import java.io.File
import java.util.ArrayList
import java.util.List
import org.kohsuke.args4j.Argument
import org.kohsuke.args4j.CmdLineException
import org.kohsuke.args4j.CmdLineParser
import org.kohsuke.args4j.Option

public class Main {
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

	@Option(name="--alwaysPrint", usage="If set, the output is printed even if an output fule is given.")
	public Boolean alwaysPrint

	@Option(name="--orientation", usage="Sets the overall shape of the graph.")
	public Orientation orientation = Orientation.horizontal

	@Option(name="--excludedFilePatterns", usage="List of glob patterns (e.g **/badfolder/**). If given, a found plugin/feature is not taken into account if its file path matches one of these patterns", metaVar="STRING")
	public List<String> excludedFilePatterns

	@Option(name="--colorSeed", usage="Seed for the color randomizer. Each seed is a completely different color set.")
	public int colorSeed = 12
	
	@Argument
	public List<File> folders = new ArrayList<File>();

	public def static void main(String[] args) {
		new Main().doMain(args)
	}

	public def void doMain(String[] args) {
		val CmdLineParser parser = new CmdLineParser(this);
		parser.properties.withUsageWidth(80).withOptionValueDelimiter("=");

		try {

			// parse the arguments.
			parser.parseArgument(args);

			// checking if enough arguments are given.
			if(folders.isEmpty())
				throw new CmdLineException(parser, "No folders given.");

			// setting args for step one
			val stepone = new Pdedependencies2model(folders, colorSeed)

			// setting options
			if(allowedPrefixes != null && !allowedPrefixes.isEmpty)
				stepone.addAllowedPrefixes(allowedPrefixes)
			if(filteredPrefixes != null && !filteredPrefixes.isEmpty)
				stepone.addFilteredPrefixes(filteredPrefixes)
			if(excludedFilePatterns != null)
				stepone.addExcludedFilePatterns(excludedFilePatterns)

			// starting step one	
			stepone.generate

			// setting parameter for step two
			val steptwo = new Model2dot(stepone.graph)

			if(outputFile != null)
				steptwo.outputFile = outputFile

			if(alwaysPrint != null)
				steptwo.alwaysPrint = alwaysPrint

			if(orientation != null)
				steptwo.orientation = orientation

			// starting step two
			steptwo.generate

		} catch(CmdLineException e) {

			System.err.println(e.getMessage());
			System.err.println("Usage: java -jar pdedependencies2dot.jar [options...] <folder1,folder2,...>");
			println()
			parser.printUsage(System.err);
			System.err.println();

			return;
		}
	}

}
