/**
 */
package fr.inria.diverse.pdedependencies2dot.model.impl;

import fr.inria.diverse.pdedependencies2dot.model.ModelPackage;
import fr.inria.diverse.pdedependencies2dot.model.Plugin;
import fr.inria.diverse.pdedependencies2dot.model.PluginContainer;
import fr.inria.diverse.pdedependencies2dot.model.Processeable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginImpl#isProcessed <em>Processed</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginImpl#getContainingElement <em>Containing Element</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginImpl extends NamedElementImpl implements Plugin {
	/**
	 * The default value of the '{@link #isProcessed() <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROCESSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProcessed() <em>Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessed()
	 * @generated
	 * @ordered
	 */
	protected boolean processed = PROCESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Plugin> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PLUGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProcessed() {
		return processed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessed(boolean newProcessed) {
		boolean oldProcessed = processed;
		processed = newProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PLUGIN__PROCESSED, oldProcessed, processed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginContainer getContainingElement() {
		if (eContainerFeatureID() != ModelPackage.PLUGIN__CONTAINING_ELEMENT) return null;
		return (PluginContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingElement(PluginContainer newContainingElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingElement, ModelPackage.PLUGIN__CONTAINING_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingElement(PluginContainer newContainingElement) {
		if (newContainingElement != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PLUGIN__CONTAINING_ELEMENT && newContainingElement != null)) {
			if (EcoreUtil.isAncestor(this, newContainingElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingElement != null)
				msgs = ((InternalEObject)newContainingElement).eInverseAdd(this, ModelPackage.PLUGIN_CONTAINER__PLUGINS, PluginContainer.class, msgs);
			msgs = basicSetContainingElement(newContainingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PLUGIN__CONTAINING_ELEMENT, newContainingElement, newContainingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plugin> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Plugin>(Plugin.class, this, ModelPackage.PLUGIN__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PLUGIN__CONTAINING_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingElement((PluginContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PLUGIN__CONTAINING_ELEMENT:
				return basicSetContainingElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.PLUGIN__CONTAINING_ELEMENT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.PLUGIN_CONTAINER__PLUGINS, PluginContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PLUGIN__PROCESSED:
				return isProcessed();
			case ModelPackage.PLUGIN__CONTAINING_ELEMENT:
				return getContainingElement();
			case ModelPackage.PLUGIN__DEPENDENCIES:
				return getDependencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PLUGIN__PROCESSED:
				setProcessed((Boolean)newValue);
				return;
			case ModelPackage.PLUGIN__CONTAINING_ELEMENT:
				setContainingElement((PluginContainer)newValue);
				return;
			case ModelPackage.PLUGIN__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Plugin>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.PLUGIN__PROCESSED:
				setProcessed(PROCESSED_EDEFAULT);
				return;
			case ModelPackage.PLUGIN__CONTAINING_ELEMENT:
				setContainingElement((PluginContainer)null);
				return;
			case ModelPackage.PLUGIN__DEPENDENCIES:
				getDependencies().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.PLUGIN__PROCESSED:
				return processed != PROCESSED_EDEFAULT;
			case ModelPackage.PLUGIN__CONTAINING_ELEMENT:
				return getContainingElement() != null;
			case ModelPackage.PLUGIN__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Processeable.class) {
			switch (derivedFeatureID) {
				case ModelPackage.PLUGIN__PROCESSED: return ModelPackage.PROCESSEABLE__PROCESSED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Processeable.class) {
			switch (baseFeatureID) {
				case ModelPackage.PROCESSEABLE__PROCESSED: return ModelPackage.PLUGIN__PROCESSED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (processed: ");
		result.append(processed);
		result.append(')');
		return result.toString();
	}

} //PluginImpl
