/**
 */
package osgi2dot.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link osgi2dot.model.Plugin#getContainingElement <em>Containing Element</em>}</li>
 *   <li>{@link osgi2dot.model.Plugin#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see osgi2dot.model.ModelPackage#getPlugin()
 * @model
 * @generated
 */
public interface Plugin extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Containing Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link osgi2dot.model.PluginContainer#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Element</em>' container reference.
	 * @see #setContainingElement(PluginContainer)
	 * @see osgi2dot.model.ModelPackage#getPlugin_ContainingElement()
	 * @see osgi2dot.model.PluginContainer#getPlugins
	 * @model opposite="plugins" transient="false"
	 * @generated
	 */
	PluginContainer getContainingElement();

	/**
	 * Sets the value of the '{@link osgi2dot.model.Plugin#getContainingElement <em>Containing Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Element</em>' container reference.
	 * @see #getContainingElement()
	 * @generated
	 */
	void setContainingElement(PluginContainer value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link osgi2dot.model.Plugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see osgi2dot.model.ModelPackage#getPlugin_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Plugin> getDependencies();

} // Plugin
