/**
 */
package fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Pdedependencies2dotFactory
 * @model kind="package"
 * @generated
 */
public interface Pdedependencies2dotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pdedependencies2dot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "pdedependencies2dot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pdedependencies2dot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pdedependencies2dotPackage eINSTANCE = fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.NamedElementImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginContainerImpl <em>Plugin Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginContainerImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getPluginContainer()
	 * @generated
	 */
	int PLUGIN_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER__PLUGINS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER__HUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plugin Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plugin Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PDEGraphImpl <em>PDE Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PDEGraphImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getPDEGraph()
	 * @generated
	 */
	int PDE_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__NAME = PLUGIN_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__PLUGINS = PLUGIN_CONTAINER__PLUGINS;

	/**
	 * The feature id for the '<em><b>Hue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__HUE = PLUGIN_CONTAINER__HUE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__FEATURES = PLUGIN_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PDE Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH_FEATURE_COUNT = PLUGIN_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PDE Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH_OPERATION_COUNT = PLUGIN_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Containing Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__CONTAINING_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.FeatureImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = PLUGIN_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PLUGINS = PLUGIN_CONTAINER__PLUGINS;

	/**
	 * The feature id for the '<em><b>Hue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__HUE = PLUGIN_CONTAINER__HUE;

	/**
	 * The feature id for the '<em><b>Required Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIRED_FEATURES = PLUGIN_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONTAINING_GRAPH = PLUGIN_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additionnal Plugins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ADDITIONNAL_PLUGINS = PLUGIN_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = PLUGIN_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = PLUGIN_CONTAINER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PDEGraph <em>PDE Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDE Graph</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PDEGraph
	 * @generated
	 */
	EClass getPDEGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PDEGraph#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PDEGraph#getFeatures()
	 * @see #getPDEGraph()
	 * @generated
	 */
	EReference getPDEGraph_Features();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Plugin#getContainingElement <em>Containing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Element</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Plugin#getContainingElement()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_ContainingElement();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Plugin#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Plugin#getDependencies()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Dependencies();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature#getRequiredFeatures <em>Required Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Features</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature#getRequiredFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RequiredFeatures();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature#getContainingGraph <em>Containing Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Graph</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature#getContainingGraph()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ContainingGraph();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature#getAdditionnalPlugins <em>Additionnal Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additionnal Plugins</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.Feature#getAdditionnalPlugins()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_AdditionnalPlugins();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PluginContainer <em>Plugin Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Container</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PluginContainer
	 * @generated
	 */
	EClass getPluginContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PluginContainer#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PluginContainer#getPlugins()
	 * @see #getPluginContainer()
	 * @generated
	 */
	EReference getPluginContainer_Plugins();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PluginContainer#getHue <em>Hue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hue</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.PluginContainer#getHue()
	 * @see #getPluginContainer()
	 * @generated
	 */
	EAttribute getPluginContainer_Hue();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Pdedependencies2dotFactory getPdedependencies2dotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PDEGraphImpl <em>PDE Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PDEGraphImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getPDEGraph()
		 * @generated
		 */
		EClass PDE_GRAPH = eINSTANCE.getPDEGraph();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDE_GRAPH__FEATURES = eINSTANCE.getPDEGraph_Features();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Containing Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__CONTAINING_ELEMENT = eINSTANCE.getPlugin_ContainingElement();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__DEPENDENCIES = eINSTANCE.getPlugin_Dependencies();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.FeatureImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Required Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REQUIRED_FEATURES = eINSTANCE.getFeature_RequiredFeatures();

		/**
		 * The meta object literal for the '<em><b>Containing Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONTAINING_GRAPH = eINSTANCE.getFeature_ContainingGraph();

		/**
		 * The meta object literal for the '<em><b>Additionnal Plugins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ADDITIONNAL_PLUGINS = eINSTANCE.getFeature_AdditionnalPlugins();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginContainerImpl <em>Plugin Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.PluginContainerImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getPluginContainer()
		 * @generated
		 */
		EClass PLUGIN_CONTAINER = eINSTANCE.getPluginContainer();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_CONTAINER__PLUGINS = eINSTANCE.getPluginContainer_Plugins();

		/**
		 * The meta object literal for the '<em><b>Hue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_CONTAINER__HUE = eINSTANCE.getPluginContainer_Hue();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.NamedElementImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.pdedependencies2dot.impl.Pdedependencies2dotPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //Pdedependencies2dotPackage
