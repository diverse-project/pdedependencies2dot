/**
 */
package fr.inria.diverse.pdedependencies2dot.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Bundle#getContainingElement <em>Containing Element</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Bundle#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends NamedElement, Processeable {
	/**
	 * Returns the value of the '<em><b>Containing Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Element</em>' container reference.
	 * @see #setContainingElement(PluginContainer)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getBundle_ContainingElement()
	 * @see fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getBundles
	 * @model opposite="bundles" transient="false"
	 * @generated
	 */
	PluginContainer getContainingElement();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.Bundle#getContainingElement <em>Containing Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Element</em>' container reference.
	 * @see #getContainingElement()
	 * @generated
	 */
	void setContainingElement(PluginContainer value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getBundle_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.Bundle#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

} // Bundle
