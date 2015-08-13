package osgi2dot

import java.util.HashSet
import java.util.Random
import java.util.Set

class FeatureCluster {
	
	private static Random random = new Random(12)
	private static float rootPluginHueColor = random.nextFloat
	
	private DependencyGraph graph
	private Set<PluginNode> containedPlugins = new HashSet
	private Set<FeatureCluster> requiredFeatures = new HashSet
	private String name = "UNNAMED"

	private float hueColor = random.nextFloat

	new(String name, DependencyGraph g) {
		this.name = name
		this.graph = g
	}

	public def PluginNode addPlugin(String s) {
		var plugin = containedPlugins.findFirst[p|p.name.equals(s)]
		if(plugin == null) {
			plugin = new PluginNode(s)
			containedPlugins.add(plugin)
			plugin.containerFeature = this
		}
		return plugin
	}

	public def void addRequiredFeature(FeatureCluster f) {
		requiredFeatures.add(f)
	}

	public def String getName() {
		return name;
	}

	public def Set<PluginNode> getPlugins() {
		return containedPlugins.immutableCopy
	}

	public def Set<FeatureCluster> getRequiredFeatures() {
		return requiredFeatures.immutableCopy
	}

	/**
	 *  {color, strongness, lightness (0=black, 1=white)}
	 */
	def String getFeatureColor() {
		return this.hueColor + "," + 0.2 + "," + 1
	}

	def String getNodeColor() {
		return this.hueColor + "," + 0.5 + "," + 1
	}

	def String getEdgeColor() {
		return this.hueColor + "," + 1.0 + "," + 0.5
	}

	def static String getRootNodeColor() {
		return rootPluginHueColor + "," + 0.5 + "," + 1
	}
	
	def static String getRootEdgeColor() {
		return rootPluginHueColor + "," + 1.0 + "," + 0.5
	}
}
