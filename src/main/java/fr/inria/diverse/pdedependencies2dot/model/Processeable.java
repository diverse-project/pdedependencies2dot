/**
 */
package fr.inria.diverse.pdedependencies2dot.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processeable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.Processeable#isProcessed <em>Processed</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getProcesseable()
 * @model abstract="true"
 * @generated
 */
public interface Processeable extends EObject {
	/**
	 * Returns the value of the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed</em>' attribute.
	 * @see #setProcessed(boolean)
	 * @see fr.inria.diverse.pdedependencies2dot.model.ModelPackage#getProcesseable_Processed()
	 * @model
	 * @generated
	 */
	boolean isProcessed();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.pdedependencies2dot.model.Processeable#isProcessed <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processed</em>' attribute.
	 * @see #isProcessed()
	 * @generated
	 */
	void setProcessed(boolean value);

} // Processeable
