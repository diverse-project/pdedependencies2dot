/**
 */
package fr.inria.diverse.pdedependencies2dot.model.impl;

import fr.inria.diverse.pdedependencies2dot.model.Bundle;
import fr.inria.diverse.pdedependencies2dot.model.ModelPackage;
import fr.inria.diverse.pdedependencies2dot.model.Plugin;
import fr.inria.diverse.pdedependencies2dot.model.PluginContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginContainerImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginContainerImpl#getHue <em>Hue</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginContainerImpl#getBundles <em>Bundles</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginContainerImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PluginContainerImpl extends NamedElementImpl implements PluginContainer {
	/**
	 * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugins()
	 * @generated
	 * @ordered
	 */
	protected EList<Plugin> plugins;

	/**
	 * The default value of the '{@link #getHue() <em>Hue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHue()
	 * @generated
	 * @ordered
	 */
	protected static final float HUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHue() <em>Hue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHue()
	 * @generated
	 * @ordered
	 */
	protected float hue = HUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBundles() <em>Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> bundles;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PLUGIN_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Plugin> getPlugins() {
		if (plugins == null) {
			plugins = new EObjectContainmentWithInverseEList<Plugin>(Plugin.class, this, ModelPackage.PLUGIN_CONTAINER__PLUGINS, ModelPackage.PLUGIN__CONTAINING_ELEMENT);
		}
		return plugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getHue() {
		return hue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHue(float newHue) {
		float oldHue = hue;
		hue = newHue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PLUGIN_CONTAINER__HUE, oldHue, hue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bundle> getBundles() {
		if (bundles == null) {
			bundles = new EObjectContainmentWithInverseEList<Bundle>(Bundle.class, this, ModelPackage.PLUGIN_CONTAINER__BUNDLES, ModelPackage.BUNDLE__CONTAINING_ELEMENT);
		}
		return bundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PLUGIN_CONTAINER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PLUGIN_CONTAINER__PLUGINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlugins()).basicAdd(otherEnd, msgs);
			case ModelPackage.PLUGIN_CONTAINER__BUNDLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBundles()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.PLUGIN_CONTAINER__PLUGINS:
				return ((InternalEList<?>)getPlugins()).basicRemove(otherEnd, msgs);
			case ModelPackage.PLUGIN_CONTAINER__BUNDLES:
				return ((InternalEList<?>)getBundles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PLUGIN_CONTAINER__PLUGINS:
				return getPlugins();
			case ModelPackage.PLUGIN_CONTAINER__HUE:
				return getHue();
			case ModelPackage.PLUGIN_CONTAINER__BUNDLES:
				return getBundles();
			case ModelPackage.PLUGIN_CONTAINER__DESCRIPTION:
				return getDescription();
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
			case ModelPackage.PLUGIN_CONTAINER__PLUGINS:
				getPlugins().clear();
				getPlugins().addAll((Collection<? extends Plugin>)newValue);
				return;
			case ModelPackage.PLUGIN_CONTAINER__HUE:
				setHue((Float)newValue);
				return;
			case ModelPackage.PLUGIN_CONTAINER__BUNDLES:
				getBundles().clear();
				getBundles().addAll((Collection<? extends Bundle>)newValue);
				return;
			case ModelPackage.PLUGIN_CONTAINER__DESCRIPTION:
				setDescription((String)newValue);
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
			case ModelPackage.PLUGIN_CONTAINER__PLUGINS:
				getPlugins().clear();
				return;
			case ModelPackage.PLUGIN_CONTAINER__HUE:
				setHue(HUE_EDEFAULT);
				return;
			case ModelPackage.PLUGIN_CONTAINER__BUNDLES:
				getBundles().clear();
				return;
			case ModelPackage.PLUGIN_CONTAINER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ModelPackage.PLUGIN_CONTAINER__PLUGINS:
				return plugins != null && !plugins.isEmpty();
			case ModelPackage.PLUGIN_CONTAINER__HUE:
				return hue != HUE_EDEFAULT;
			case ModelPackage.PLUGIN_CONTAINER__BUNDLES:
				return bundles != null && !bundles.isEmpty();
			case ModelPackage.PLUGIN_CONTAINER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hue: ");
		result.append(hue);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PluginContainerImpl
