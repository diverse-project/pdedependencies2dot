/**
 */
package fr.inria.diverse.pdedependencies2dot.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getHue <em>Hue</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getBundles <em>Bundles</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPluginContainer()
 * @model abstract="true"
 * @generated
 */
public interface PluginContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.Plugin}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getContainingElement <em>Containing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference list.
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPluginContainer_Plugins()
	 * @see fr.inria.diverse.pdedependencies2dot.model.Plugin#getContainingElement
	 * @model opposite="containingElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<Plugin> getPlugins();

	/**
	 * Returns the value of the '<em><b>Hue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hue</em>' attribute.
	 * @see #setHue(float)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPluginContainer_Hue()
	 * @model
	 * @generated
	 */
	float getHue();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getHue <em>Hue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hue</em>' attribute.
	 * @see #getHue()
	 * @generated
	 */
	void setHue(float value);

	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.Bundle}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.pdedependencies2dot.model.Bundle#getContainingElement <em>Containing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' containment reference list.
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPluginContainer_Bundles()
	 * @see fr.inria.diverse.pdedependencies2dot.model.Bundle#getContainingElement
	 * @model opposite="containingElement" containment="true"
	 * @generated
	 */
	EList<Bundle> getBundles();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPluginContainer_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // PluginContainer
