package osgi2dot

import java.io.IOException
import java.io.PrintWriter
import java.nio.file.FileSystems
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.PathMatcher
import java.nio.file.Paths
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set

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
		"org.gemoc",
	"fr.inria",
	 "fr.obeo"
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

		private final PathMatcher matcher;

		new() {
			matcher = FileSystems.getDefault().getPathMatcher("glob:MANIFEST.MF");
		}

		Set<Path> results = new HashSet<Path>;

		// Compares the glob pattern against
		// the file or directory name.
		def void find(Path file) {
			val Path name = file.getFileName();
			if(name != null && matcher.matches(name)) {
				results.add(file);
			}
		}

		// Invoke the pattern matching
		// method on each file.
		@Override
		public override FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
			find(file);
			return CONTINUE;
		}

		@Override
		public override FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
			return CONTINUE;
		}

		@Override
		public override FileVisitResult visitFileFailed(Path file, IOException exc) {
			System.err.println(exc);
			return CONTINUE;
		}
	}

	public static val Map<String, Set<String>> graph = new HashMap

	private static def String parseName(String line) {
		var String result = line
		result = result.replace("Bundle-SymbolicName:", "")
		result = result.replaceAll(" ", "");
		val indexColon = result.indexOf(";");
		if(indexColon != -1) {
			result = result.substring(0, indexColon)
		}
		return result;
	}

	private static def String parseDep(String line) {
		var result = line.replaceAll(" ", "")
		result = result.replace("Require-Bundle:", "")

		val index = result.indexOf(";")
		if(index != -1) {
			result = result.substring(0, index)
		} else {
			val indexComma = result.indexOf(",")
			if(indexComma != -1) {
				result = result.substring(0, indexComma)
			}
		}

		return result
	}

	private static def boolean okPrefix(String n) {
		return PREFIXES.exists[p|n.startsWith(p)] && !PREFIXESNOT.exists[p|n.startsWith(p)]
	}

	private static def void addDep(String name, String dep) {
		if(okPrefix(name) && okPrefix(dep)) {
			if(!graph.containsKey(name)) {
				graph.put(name, new HashSet)
			}
			graph.get(name).add(dep)
		}
	}

	public static def processManifest(Path manifest) {
		val lines = Files.readAllLines(manifest)

		var boolean isParsingDep = false;
		var name = ""
		val Set<String> deps = new HashSet<String>
		for (String l : lines) {

			// Parsing bundle name
			if(l.startsWith("Bundle-SymbolicName:")) {
				name = parseName(l)
			}

			// Parsing dependencies
			if(l.startsWith("Require-Bundle:")) {
				isParsingDep = true;
			}

			if(!(l.startsWith(" ") || l.startsWith("Require"))) {
				isParsingDep = false
			}

			if(isParsingDep) {
				deps.add(parseDep(l))
			}

		}

		for (d : deps) {
			addDep(name, d)
		}

	}

	public static def String toDot() {
		return '''
digraph awesomeGraph {
	«FOR name : graph.keySet»
		«FOR dep : graph.get(name)»
			"«name»" -> "«dep»";
		«ENDFOR»
	«ENDFOR»
}
		'''
	}

	public static def void main(String[] args) {

		val Finder finder = new Finder();
		for (p : PATHS)
			Files.walkFileTree(Paths.get(p), finder);

		for (p : finder.results) {
			processManifest(p)
		}

		val PrintWriter out = new PrintWriter("/tmp/yay.dot");

		out.print(toDot);

		out.close

	}

}
