package fr.inria.diverse.pdedependencies2dot

import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter
import fr.inria.diverse.pdedependencies2dot.model.PDEGraph
import fr.inria.diverse.pdedependencies2dot.model.Plugin
import java.util.Random
import fr.inria.diverse.pdedependencies2dot.Main.Orientation
import org.eclipse.xtend.lib.annotations.Accessors

class Model2dot {

	private File outputFile;

	// Input
	private val PDEGraph graph;
	
	@Accessors(PUBLIC_SETTER,PRIVATE_GETTER)
	boolean alwaysPrint;
	
	@Accessors(PUBLIC_SETTER,PRIVATE_GETTER)
	Orientation orientation

	public def void setOutputFile(File file) {
		outputFile = file;
	}

	new(PDEGraph graph) {
		this.graph = graph
	}

	private static def String clusterName(String featureName) {
		return "cluster_" + featureName
	}

	private def static String featureColor(float hue) {
		return hue + "," + 0.2 + "," + 1
	}

	private def static String pluginColor(float hue) {
		return hue + "," + 0.5 + "," + 1
	}

	private def static String edgeColor(float hue) {
		return hue + "," + 1.0 + "," + 0.5
	}

	private def String generateDot() {
		return '''
digraph «graph.name» {
	compound=true;
	node [shape=box, color=black,style=filled,fillcolor="«pluginColor(graph.hue)»"];
	«IF orientation.equals(Orientation.horizontal)»
		rankdir=TB;
	«ELSEIF orientation.equals(Orientation.vertical)»
		rankdir=LR;
	«ENDIF»
	

	«FOR feature : graph.features» 
		subgraph "«clusterName(feature.name)»" {
			node [shape=box, color=black,style=filled,fillcolor="«pluginColor(feature.hue)»"];
			style=filled;
			color="«featureColor(feature.hue)»";
			label="«feature.name»";
			«FOR plugin : feature.plugins»
			"«plugin.name»";
			«ENDFOR»
		}
	«ENDFOR»
	
	«FOR Plugin plugin : graph.eAllContents.filter(Plugin).toSet»
		«FOR dep : plugin.dependencies»
			"«plugin.name»" -> "«dep.name»" [color="«edgeColor(plugin.containingElement.hue)»"];
		«ENDFOR» 
	«ENDFOR»
	
	«FOR plugin : graph.plugins»
		"«plugin.name»";
	«ENDFOR»
	
	«FOR feature : graph.features»
		«FOR req : feature.requiredFeatures»
		«IF !feature.plugins.empty && !req.plugins.empty»
		"«feature.plugins.get(0).name»"-> "«req.plugins.get(0).name»" [ltail="«clusterName(feature.name)»",lhead="«clusterName(
			req.name)»", style="setlinewidth(8)", color="«edgeColor(feature.hue)»"];
		«ENDIF»
		«ENDFOR»

		«FOR req : feature.additionnalPlugins» 
		«IF feature.plugins.empty»
		«val n = randomNodeName»
		"«n»"[style=invis];
		"«n»"«ELSE»"«feature.plugins.get(0).name»"«ENDIF»	-> "«req.name»" [ltail="«clusterName(
			feature.name)»", style="setlinewidth(8)", color="«edgeColor(feature.hue)»"];
		«ENDFOR»
		
	«ENDFOR»
}
		'''
	}

	def String randomNodeName() {
		return Math.abs(new Random().nextInt()).toString
	}

	public def void generate() {

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

		}

		if(outputFile == null || alwaysPrint) {
			println(result)
		}
	}

	

}
