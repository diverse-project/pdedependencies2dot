package osgi2dot

import java.util.Set
import java.util.HashSet

class PluginNode {

	FeatureCluster containerFeature
	Set<PluginNode> dependencies = new HashSet
	String name

	new(String name) {
		this.name = name
	}

	def String getColor() {
		if(containerFeature != null)
			return containerFeature.getEdgeColor
		else
			return FeatureCluster.getRootEdgeColor
	}

	public def String getName() {
		return name
	}

	public def void addDependency(PluginNode d) {
		dependencies.add(d)
	}

	public def Set<PluginNode> getDependencies() {
		return dependencies.immutableCopy
	}

	public def void setContainerFeature(FeatureCluster f) {
		this.containerFeature = f
	}
}
