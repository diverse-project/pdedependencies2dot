/**
 */
package fr.inria.diverse.pdedependencies2dot.model.impl;

import fr.inria.diverse.pdedependencies2dot.model.Feature;
import fr.inria.diverse.pdedependencies2dot.model.ModelPackage;
import fr.inria.diverse.pdedependencies2dot.model.PDEGraph;
import fr.inria.diverse.pdedependencies2dot.model.Plugin;

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
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.FeatureImpl#isProcessed <em>Processed</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.FeatureImpl#getRequiredFeatures <em>Required Features</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.FeatureImpl#getContainingGraph <em>Containing Graph</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.impl.FeatureImpl#getAdditionnalPlugins <em>Additionnal Plugins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends PluginContainerImpl implements Feature {
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
	 * The cached value of the '{@link #getRequiredFeatures() <em>Required Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> requiredFeatures;

	/**
	 * The cached value of the '{@link #getAdditionnalPlugins() <em>Additionnal Plugins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionnalPlugins()
	 * @generated
	 * @ordered
	 */
	protected EList<Plugin> additionnalPlugins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__PROCESSED, oldProcessed, processed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getRequiredFeatures() {
		if (requiredFeatures == null) {
			requiredFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, ModelPackage.FEATURE__REQUIRED_FEATURES);
		}
		return requiredFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDEGraph getContainingGraph() {
		if (eContainerFeatureID() != ModelPackage.FEATURE__CONTAINING_GRAPH) return null;
		return (PDEGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingGraph(PDEGraph newContainingGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingGraph, ModelPackage.FEATURE__CONTAINING_GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingGraph(PDEGraph newContainingGraph) {
		if (newContainingGraph != eInternalContainer() || (eContainerFeatureID() != ModelPackage.FEATURE__CONTAINING_GRAPH && newContainingGraph != null)) {
			if (EcoreUtil.isAncestor(this, newContainingGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingGraph != null)
				msgs = ((InternalEObject)newContainingGraph).eInverseAdd(this, ModelPackage.PDE_GRAPH__FEATURES, PDEGraph.class, msgs);
			msgs = basicSetContainingGraph(newContainingGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FEATURE__CONTAINING_GRAPH, newContainingGraph, newContainingGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plugin> getAdditionnalPlugins() {
		if (additionnalPlugins == null) {
			additionnalPlugins = new EObjectResolvingEList<Plugin>(Plugin.class, this, ModelPackage.FEATURE__ADDITIONNAL_PLUGINS);
		}
		return additionnalPlugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FEATURE__CONTAINING_GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingGraph((PDEGraph)otherEnd, msgs);
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
			case ModelPackage.FEATURE__CONTAINING_GRAPH:
				return basicSetContainingGraph(null, msgs);
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
			case ModelPackage.FEATURE__CONTAINING_GRAPH:
				return eInternalContainer().eInverseRemove(this, ModelPackage.PDE_GRAPH__FEATURES, PDEGraph.class, msgs);
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
			case ModelPackage.FEATURE__PROCESSED:
				return isProcessed();
			case ModelPackage.FEATURE__REQUIRED_FEATURES:
				return getRequiredFeatures();
			case ModelPackage.FEATURE__CONTAINING_GRAPH:
				return getContainingGraph();
			case ModelPackage.FEATURE__ADDITIONNAL_PLUGINS:
				return getAdditionnalPlugins();
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
			case ModelPackage.FEATURE__PROCESSED:
				setProcessed((Boolean)newValue);
				return;
			case ModelPackage.FEATURE__REQUIRED_FEATURES:
				getRequiredFeatures().clear();
				getRequiredFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case ModelPackage.FEATURE__CONTAINING_GRAPH:
				setContainingGraph((PDEGraph)newValue);
				return;
			case ModelPackage.FEATURE__ADDITIONNAL_PLUGINS:
				getAdditionnalPlugins().clear();
				getAdditionnalPlugins().addAll((Collection<? extends Plugin>)newValue);
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
			case ModelPackage.FEATURE__PROCESSED:
				setProcessed(PROCESSED_EDEFAULT);
				return;
			case ModelPackage.FEATURE__REQUIRED_FEATURES:
				getRequiredFeatures().clear();
				return;
			case ModelPackage.FEATURE__CONTAINING_GRAPH:
				setContainingGraph((PDEGraph)null);
				return;
			case ModelPackage.FEATURE__ADDITIONNAL_PLUGINS:
				getAdditionnalPlugins().clear();
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
			case ModelPackage.FEATURE__PROCESSED:
				return processed != PROCESSED_EDEFAULT;
			case ModelPackage.FEATURE__REQUIRED_FEATURES:
				return requiredFeatures != null && !requiredFeatures.isEmpty();
			case ModelPackage.FEATURE__CONTAINING_GRAPH:
				return getContainingGraph() != null;
			case ModelPackage.FEATURE__ADDITIONNAL_PLUGINS:
				return additionnalPlugins != null && !additionnalPlugins.isEmpty();
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
				case ModelPackage.FEATURE__PROCESSED: return ModelPackage.PROCESSEABLE__PROCESSED;
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
				case ModelPackage.PROCESSEABLE__PROCESSED: return ModelPackage.FEATURE__PROCESSED;
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

} //FeatureImpl
