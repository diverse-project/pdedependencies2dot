package osgi2dot

import java.util.Set
import java.util.HashSet

class DependencyGraph {

	Set<FeatureCluster> features = new HashSet
	Set<PluginNode> plugins = new HashSet

	def Set<FeatureCluster> getFeatures() {
		return features.immutableCopy
	}

	def FeatureCluster getFeature(String name) {
		var feature = features.findFirst[f|f.name.equals(name)]
		if(feature == null)
			feature = new FeatureCluster(name, this)
		features.add(feature)
		return feature;
	}
	
	def PluginNode getPlugin(String name, boolean create) {
		var PluginNode plugin = allPlugins.findFirst[p|p.name.equals(name)]
		if(plugin == null && create) {
			plugin = new PluginNode(name)
			plugins.add(plugin)
		}
		return plugin
	}

	def PluginNode getPlugin(String name) {
		return getPlugin(name, true)
	}
	
	def Set<PluginNode> getAllPlugins() {
		val allPlugins = plugins.clone.toSet
		allPlugins.addAll(features.map[f|f.plugins].flatten)
		return allPlugins
	}
	
	def Set<PluginNode> getRootPlugins() {
		return plugins.immutableCopy
	}

}
