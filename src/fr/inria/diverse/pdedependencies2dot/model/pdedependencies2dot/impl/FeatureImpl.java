/**
 */
package fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl;

import fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature;
import fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PDEGraph;
import fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Pdedependencies2dotPackage;
import fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Plugin;

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
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.FeatureImpl#getRequiredFeatures <em>Required Features</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.FeatureImpl#getContainingGraph <em>Containing Graph</em>}</li>
 *   <li>{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.FeatureImpl#getAdditionnalPlugins <em>Additionnal Plugins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends PluginContainerImpl implements Feature {
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
		return Pdedependencies2dotPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getRequiredFeatures() {
		if (requiredFeatures == null) {
			requiredFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, Pdedependencies2dotPackage.FEATURE__REQUIRED_FEATURES);
		}
		return requiredFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDEGraph getContainingGraph() {
		if (eContainerFeatureID() != Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH) return null;
		return (PDEGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingGraph(PDEGraph newContainingGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingGraph, Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingGraph(PDEGraph newContainingGraph) {
		if (newContainingGraph != eInternalContainer() || (eContainerFeatureID() != Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH && newContainingGraph != null)) {
			if (EcoreUtil.isAncestor(this, newContainingGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingGraph != null)
				msgs = ((InternalEObject)newContainingGraph).eInverseAdd(this, Pdedependencies2dotPackage.PDE_GRAPH__FEATURES, PDEGraph.class, msgs);
			msgs = basicSetContainingGraph(newContainingGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH, newContainingGraph, newContainingGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plugin> getAdditionnalPlugins() {
		if (additionnalPlugins == null) {
			additionnalPlugins = new EObjectResolvingEList<Plugin>(Plugin.class, this, Pdedependencies2dotPackage.FEATURE__ADDITIONNAL_PLUGINS);
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
			case Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH:
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
			case Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH:
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
			case Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH:
				return eInternalContainer().eInverseRemove(this, Pdedependencies2dotPackage.PDE_GRAPH__FEATURES, PDEGraph.class, msgs);
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
			case Pdedependencies2dotPackage.FEATURE__REQUIRED_FEATURES:
				return getRequiredFeatures();
			case Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH:
				return getContainingGraph();
			case Pdedependencies2dotPackage.FEATURE__ADDITIONNAL_PLUGINS:
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
			case Pdedependencies2dotPackage.FEATURE__REQUIRED_FEATURES:
				getRequiredFeatures().clear();
				getRequiredFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH:
				setContainingGraph((PDEGraph)newValue);
				return;
			case Pdedependencies2dotPackage.FEATURE__ADDITIONNAL_PLUGINS:
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
			case Pdedependencies2dotPackage.FEATURE__REQUIRED_FEATURES:
				getRequiredFeatures().clear();
				return;
			case Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH:
				setContainingGraph((PDEGraph)null);
				return;
			case Pdedependencies2dotPackage.FEATURE__ADDITIONNAL_PLUGINS:
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
			case Pdedependencies2dotPackage.FEATURE__REQUIRED_FEATURES:
				return requiredFeatures != null && !requiredFeatures.isEmpty();
			case Pdedependencies2dotPackage.FEATURE__CONTAINING_GRAPH:
				return getContainingGraph() != null;
			case Pdedependencies2dotPackage.FEATURE__ADDITIONNAL_PLUGINS:
				return additionnalPlugins != null && !additionnalPlugins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
