/**
 */
package fr.inria.diverse.pdedependencies2dot.model.impl;

import fr.inria.diverse.pdedependencies2dot.model.Feature;
import fr.inria.diverse.pdedependencies2dot.model.ModelPackage;
import fr.inria.diverse.pdedependencies2dot.model.PDEGraph;
import fr.inria.diverse.pdedependencies2dot.model.Product;

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
 * An implementation of the model object '<em><b>PDE Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PDEGraphImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PDEGraphImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.PDEGraphImpl#getBundleSymbolicName <em>Bundle Symbolic Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PDEGraphImpl extends PluginContainerImpl implements PDEGraph {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The default value of the '{@link #getBundleSymbolicName() <em>Bundle Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_SYMBOLIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundleSymbolicName() <em>Bundle Symbolic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleSymbolicName()
	 * @generated
	 * @ordered
	 */
	protected String bundleSymbolicName = BUNDLE_SYMBOLIC_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PDEGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PDE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, ModelPackage.PDE_GRAPH__FEATURES, ModelPackage.FEATURE__CONTAINING_GRAPH);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList<Product>(Product.class, this, ModelPackage.PDE_GRAPH__PRODUCTS, ModelPackage.PRODUCT__CONTAINING_GRAPH);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBundleSymbolicName() {
		return bundleSymbolicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundleSymbolicName(String newBundleSymbolicName) {
		String oldBundleSymbolicName = bundleSymbolicName;
		bundleSymbolicName = newBundleSymbolicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PDE_GRAPH__BUNDLE_SYMBOLIC_NAME, oldBundleSymbolicName, bundleSymbolicName));
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
			case ModelPackage.PDE_GRAPH__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case ModelPackage.PDE_GRAPH__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.PDE_GRAPH__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case ModelPackage.PDE_GRAPH__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.PDE_GRAPH__FEATURES:
				return getFeatures();
			case ModelPackage.PDE_GRAPH__PRODUCTS:
				return getProducts();
			case ModelPackage.PDE_GRAPH__BUNDLE_SYMBOLIC_NAME:
				return getBundleSymbolicName();
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
			case ModelPackage.PDE_GRAPH__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case ModelPackage.PDE_GRAPH__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case ModelPackage.PDE_GRAPH__BUNDLE_SYMBOLIC_NAME:
				setBundleSymbolicName((String)newValue);
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
			case ModelPackage.PDE_GRAPH__FEATURES:
				getFeatures().clear();
				return;
			case ModelPackage.PDE_GRAPH__PRODUCTS:
				getProducts().clear();
				return;
			case ModelPackage.PDE_GRAPH__BUNDLE_SYMBOLIC_NAME:
				setBundleSymbolicName(BUNDLE_SYMBOLIC_NAME_EDEFAULT);
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
			case ModelPackage.PDE_GRAPH__FEATURES:
				return features != null && !features.isEmpty();
			case ModelPackage.PDE_GRAPH__PRODUCTS:
				return products != null && !products.isEmpty();
			case ModelPackage.PDE_GRAPH__BUNDLE_SYMBOLIC_NAME:
				return BUNDLE_SYMBOLIC_NAME_EDEFAULT == null ? bundleSymbolicName != null : !BUNDLE_SYMBOLIC_NAME_EDEFAULT.equals(bundleSymbolicName);
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
		result.append(" (bundleSymbolicName: ");
		result.append(bundleSymbolicName);
		result.append(')');
		return result.toString();
	}

} //PDEGraphImpl
