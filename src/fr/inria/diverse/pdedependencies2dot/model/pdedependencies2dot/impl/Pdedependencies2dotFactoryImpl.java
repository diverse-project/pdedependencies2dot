/**
 */
package fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl;

import fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pdedependencies2dotFactoryImpl extends EFactoryImpl implements Pdedependencies2dotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Pdedependencies2dotFactory init() {
		try {
			Pdedependencies2dotFactory thePdedependencies2dotFactory = (Pdedependencies2dotFactory)EPackage.Registry.INSTANCE.getEFactory(Pdedependencies2dotPackage.eNS_URI);
			if (thePdedependencies2dotFactory != null) {
				return thePdedependencies2dotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Pdedependencies2dotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pdedependencies2dotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Pdedependencies2dotPackage.PDE_GRAPH: return createPDEGraph();
			case Pdedependencies2dotPackage.PLUGIN: return createPlugin();
			case Pdedependencies2dotPackage.FEATURE: return createFeature();
			case Pdedependencies2dotPackage.PLUGIN_CONTAINER: return createPluginContainer();
			case Pdedependencies2dotPackage.NAMED_ELEMENT: return createNamedElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDEGraph createPDEGraph() {
		PDEGraphImpl pdeGraph = new PDEGraphImpl();
		return pdeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin createPlugin() {
		PluginImpl plugin = new PluginImpl();
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginContainer createPluginContainer() {
		PluginContainerImpl pluginContainer = new PluginContainerImpl();
		return pluginContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pdedependencies2dotPackage getPdedependencies2dotPackage() {
		return (Pdedependencies2dotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Pdedependencies2dotPackage getPackage() {
		return Pdedependencies2dotPackage.eINSTANCE;
	}

} //Pdedependencies2dotFactoryImpl
