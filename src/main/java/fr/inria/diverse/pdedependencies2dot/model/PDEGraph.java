/**
 */
package fr.inria.diverse.pdedependencies2dot.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDE Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getFeatures <em>Features</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getProducts <em>Products</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getBundleSymbolicName <em>Bundle Symbolic Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPDEGraph()
 * @model
 * @generated
 */
public interface PDEGraph extends PluginContainer {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.Feature}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.pdedependencies2dot.model.Feature#getContainingGraph <em>Containing Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPDEGraph_Features()
	 * @see fr.inria.diverse.pdedependencies2dot.model.Feature#getContainingGraph
	 * @model opposite="containingGraph" containment="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.Product}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.pdedependencies2dot.model.Product#getContainingGraph <em>Containing Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPDEGraph_Products()
	 * @see fr.inria.diverse.pdedependencies2dot.model.Product#getContainingGraph
	 * @model opposite="containingGraph" containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Bundle Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Symbolic Name</em>' attribute.
	 * @see #setBundleSymbolicName(String)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPDEGraph_BundleSymbolicName()
	 * @model
	 * @generated
	 */
	String getBundleSymbolicName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getBundleSymbolicName <em>Bundle Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Symbolic Name</em>' attribute.
	 * @see #getBundleSymbolicName()
	 * @generated
	 */
	void setBundleSymbolicName(String value);

} // PDEGraph
