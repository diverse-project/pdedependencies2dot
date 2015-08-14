/**
 */
package osgi2dot.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import osgi2dot.model.ModelPackage;
import osgi2dot.model.Plugin;
import osgi2dot.model.PluginContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link osgi2dot.model.impl.PluginContainerImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link osgi2dot.model.impl.PluginContainerImpl#getHue <em>Hue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PluginContainerImpl extends NamedElementImpl implements PluginContainer {
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
	public float getHue() {
		return hue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PLUGIN_CONTAINER__PLUGINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlugins()).basicAdd(otherEnd, msgs);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hue: ");
		result.append(hue);
		result.append(')');
		return result.toString();
	}

} //PluginContainerImpl
