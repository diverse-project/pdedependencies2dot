package fr.inria.diverse.pdedependencies2dot

import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter
import fr.inria.diverse.pdedependencies2dot.model.PDEGraph
import fr.inria.diverse.pdedependencies2dot.model.Plugin
import java.util.Random
import fr.inria.diverse.pdedependencies2dot.Main.Orientation
import org.eclipse.xtend.lib.annotations.Accessors
import fr.inria.diverse.pdedependencies2dot.model.Feature
import java.util.Map
import java.util.HashMap
import fr.inria.diverse.pdedependencies2dot.model.Processeable

class Model2dot {

	private File outputFile;

	// Input
	private val PDEGraph graph;

	@Accessors(PUBLIC_SETTER, PRIVATE_GETTER)
	boolean alwaysPrint;

	@Accessors(PUBLIC_SETTER, PRIVATE_GETTER)
	Orientation orientation

	@Accessors(PUBLIC_SETTER, PRIVATE_GETTER)
	boolean hideExternal

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

	val Map<Feature, String> fakePlugins = new HashMap

	private def String getFeatureFirstPlugin(Feature f) {
		if(!f.plugins.empty)
			return f.plugins.get(0).name
		else {
			if(!fakePlugins.containsKey(f)) {
				fakePlugins.put(f, randomNodeName)
			}
			return fakePlugins.get(f)
		}

	}

	private def boolean shouldDisplay(Processeable p) {
		return (!hideExternal || (p.processed))
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
	
	«FOR plugin : graph.plugins.filter[p|p.shouldDisplay]»
		"«plugin.name»"«IF !plugin.processed»[fillcolor=lightgray]«ENDIF»;
	«ENDFOR»
	
	«FOR feature : graph.features.filter[p|p.shouldDisplay]» 
		subgraph "«clusterName(feature.name)»" {
			node [shape=box, color=black,style=filled,fillcolor="«pluginColor(feature.hue)»"];
			style=filled;
				
			label="«feature.name»";
			
			«IF !feature.processed»
			color=lightgray;	
			«ELSE»
			color="«featureColor(feature.hue)»";
			«ENDIF»
			
			«IF feature.plugins.empty»
			"«getFeatureFirstPlugin(feature)»"[style=invis];
			«ENDIF»
			

			«FOR plugin : feature.plugins.filter[p|p.shouldDisplay]»
			"«plugin.name»"«IF !plugin.processed»[fillcolor=lightgray]«ENDIF»;
			«ENDFOR»

				
			«FOR req : feature.additionnalPlugins.filter[p|p.shouldDisplay]» 
			"«getFeatureFirstPlugin(feature)»" -> "«req.name»" [ltail="«clusterName(feature.name)»", style="dotted",penwidth=5, color="«edgeColor(
			feature.hue)»"];
			«ENDFOR»
			
			«FOR req : feature.requiredPlugins.filter[p|p.shouldDisplay]» 
			"«getFeatureFirstPlugin(feature)»" -> "«req.name»" [ltail="«clusterName(feature.name)»", style="dotted",penwidth=5, color="«edgeColor(
			feature.hue)»"];
			«ENDFOR»
				
		}
	«ENDFOR»
	
	«FOR Plugin plugin : graph.eAllContents.filter(Plugin).toSet.filter[p|p.shouldDisplay]»
		«FOR dep : plugin.dependencies.filter[p|p.shouldDisplay]»
			"«plugin.name»" -> "«dep.name»" [color="«edgeColor(plugin.containingElement.hue)»"];
		«ENDFOR» 
	«ENDFOR»
	
	«FOR feature : graph.features.filter[p|p.shouldDisplay]»
		«FOR req : feature.requiredFeatures.filter[p|p.shouldDisplay]»
		"«getFeatureFirstPlugin(feature)»"-> "«getFeatureFirstPlugin(req)»" [ltail="«clusterName(feature.name)»",lhead="«clusterName(
			req.name)»", penwidth=5, color="«edgeColor(feature.hue)»"];
		«ENDFOR»
	«ENDFOR»
}
		'''
	}

	private def String randomNodeName() {
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
