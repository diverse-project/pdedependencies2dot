/**
 */
package fr.inria.diverse.pdedependencies2dot.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getContainingElement <em>Containing Element</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getClassPath <em>Class Path</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getExportedBundles <em>Exported Bundles</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getRequiredBundles <em>Required Bundles</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPlugin()
 * @model
 * @generated
 */
public interface Plugin extends NamedElement, Processeable {
	/**
	 * Returns the value of the '<em><b>Containing Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Element</em>' container reference.
	 * @see #setContainingElement(PluginContainer)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPlugin_ContainingElement()
	 * @see fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getPlugins
	 * @model opposite="plugins" transient="false"
	 * @generated
	 */
	PluginContainer getContainingElement();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getContainingElement <em>Containing Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Element</em>' container reference.
	 * @see #getContainingElement()
	 * @generated
	 */
	void setContainingElement(PluginContainer value);

	/**
	 * Returns the value of the '<em><b>Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Path</em>' attribute.
	 * @see #setClassPath(String)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPlugin_ClassPath()
	 * @model
	 * @generated
	 */
	String getClassPath();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getClassPath <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Path</em>' attribute.
	 * @see #getClassPath()
	 * @generated
	 */
	void setClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Exported Bundles</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.Bundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported Bundles</em>' reference list.
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPlugin_ExportedBundles()
	 * @model
	 * @generated
	 */
	EList<Bundle> getExportedBundles();

	/**
	 * Returns the value of the '<em><b>Required Bundles</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.Bundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Bundles</em>' reference list.
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPlugin_RequiredBundles()
	 * @model
	 * @generated
	 */
	EList<Bundle> getRequiredBundles();

	/**
	 * Returns the value of the '<em><b>Imported Packages</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.pdedependencies2dot.model.Plugin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Packages</em>' reference list.
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPlugin_ImportedPackages()
	 * @model
	 * @generated
	 */
	EList<Plugin> getImportedPackages();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getPlugin_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

} // Plugin
