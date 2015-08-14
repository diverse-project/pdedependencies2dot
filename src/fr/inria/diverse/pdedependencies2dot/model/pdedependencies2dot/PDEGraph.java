/**
 */
package fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDE Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PDEGraph#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Pdedependencies2dotPackage#getPDEGraph()
 * @model
 * @generated
 */
public interface PDEGraph extends PluginContainer {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature#getContainingGraph <em>Containing Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Pdedependencies2dotPackage#getPDEGraph_Features()
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature#getContainingGraph
	 * @model opposite="containingGraph" containment="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // PDEGraph
