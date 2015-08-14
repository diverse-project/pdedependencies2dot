/**
 */
package fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl;

import fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Pdedependencies2dotPackage;
import fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Plugin;
import fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PluginContainer;

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
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginImpl#getContainingElement <em>Containing Element</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PluginImpl extends NamedElementImpl implements Plugin {
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
		return Pdedependencies2dotPackage.Literals.PLUGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginContainer getContainingElement() {
		if (eContainerFeatureID() != Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT) return null;
		return (PluginContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingElement(PluginContainer newContainingElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingElement, Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingElement(PluginContainer newContainingElement) {
		if (newContainingElement != eInternalContainer() || (eContainerFeatureID() != Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT && newContainingElement != null)) {
			if (EcoreUtil.isAncestor(this, newContainingElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingElement != null)
				msgs = ((InternalEObject)newContainingElement).eInverseAdd(this, Pdedependencies2dotPackage.PLUGIN_CONTAINER__PLUGINS, PluginContainer.class, msgs);
			msgs = basicSetContainingElement(newContainingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT, newContainingElement, newContainingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plugin> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Plugin>(Plugin.class, this, Pdedependencies2dotPackage.PLUGIN__DEPENDENCIES);
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
			case Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT:
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
			case Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT:
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
			case Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT:
				return eInternalContainer().eInverseRemove(this, Pdedependencies2dotPackage.PLUGIN_CONTAINER__PLUGINS, PluginContainer.class, msgs);
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
			case Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT:
				return getContainingElement();
			case Pdedependencies2dotPackage.PLUGIN__DEPENDENCIES:
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
			case Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT:
				setContainingElement((PluginContainer)newValue);
				return;
			case Pdedependencies2dotPackage.PLUGIN__DEPENDENCIES:
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
			case Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT:
				setContainingElement((PluginContainer)null);
				return;
			case Pdedependencies2dotPackage.PLUGIN__DEPENDENCIES:
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
			case Pdedependencies2dotPackage.PLUGIN__CONTAINING_ELEMENT:
				return getContainingElement() != null;
			case Pdedependencies2dotPackage.PLUGIN__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PluginImpl
