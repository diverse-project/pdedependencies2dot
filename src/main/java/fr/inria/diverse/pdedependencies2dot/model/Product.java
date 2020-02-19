/**
 */
package fr.inria.diverse.pdedependencies2dot.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Product#getContainingGraph <em>Containing Graph</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Product#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends PluginContainer, Processeable {
	/**
	 * Returns the value of the '<em><b>Containing Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Graph</em>' container reference.
	 * @see #setContainingGraph(PDEGraph)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getProduct_ContainingGraph()
	 * @see fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getProducts
	 * @model opposite="products" transient="false"
	 * @generated
	 */
	PDEGraph getContainingGraph();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.Product#getContainingGraph <em>Containing Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Graph</em>' container reference.
	 * @see #getContainingGraph()
	 * @generated
	 */
	void setContainingGraph(PDEGraph value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getProduct_Features()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Product
