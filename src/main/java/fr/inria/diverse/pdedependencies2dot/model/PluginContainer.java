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
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getHue <em>Hue</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPluginContainer()
 * @model
 * @generated
 */
public interface PluginContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.Plugin}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getContainingElement <em>Containing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Hue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // PluginContainer
