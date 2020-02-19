/**
 */
package fr.inria.diverse.pdedependencies2dot.model;

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
 * @see fr.inria.diverse.pdedependencies2dot.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

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
	ModelPackage eINSTANCE = fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.NamedElementImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getNamedElement()
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
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginContainerImpl <em>Plugin Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.PluginContainerImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getPluginContainer()
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
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER__VERSION = NAMED_ELEMENT__VERSION;

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
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER__BUNDLES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Plugin Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Plugin Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.PDEGraphImpl <em>PDE Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.PDEGraphImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getPDEGraph()
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
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__VERSION = PLUGIN_CONTAINER__VERSION;

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
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__BUNDLES = PLUGIN_CONTAINER__BUNDLES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__DESCRIPTION = PLUGIN_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__FEATURES = PLUGIN_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__PRODUCTS = PLUGIN_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bundle Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH__BUNDLE_SYMBOLIC_NAME = PLUGIN_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PDE Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH_FEATURE_COUNT = PLUGIN_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>PDE Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDE_GRAPH_OPERATION_COUNT = PLUGIN_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.PluginImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getPlugin()
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
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__VERSION = NAMED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__PROCESSED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__CONTAINING_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exported Bundles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__EXPORTED_BUNDLES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Bundles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__REQUIRED_BUNDLES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imported Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__IMPORTED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.FeatureImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getFeature()
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
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = PLUGIN_CONTAINER__VERSION;

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
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BUNDLES = PLUGIN_CONTAINER__BUNDLES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = PLUGIN_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROCESSED = PLUGIN_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIRED_FEATURES = PLUGIN_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONTAINING_GRAPH = PLUGIN_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Additionnal Plugins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ADDITIONNAL_PLUGINS = PLUGIN_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Plugins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIRED_PLUGINS = PLUGIN_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = PLUGIN_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = PLUGIN_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.ProcesseableImpl <em>Processeable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ProcesseableImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getProcesseable()
	 * @generated
	 */
	int PROCESSEABLE = 5;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSEABLE__PROCESSED = 0;

	/**
	 * The number of structural features of the '<em>Processeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSEABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Processeable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.BundleImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VERSION = NAMED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__PROCESSED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__CONTAINING_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ProductImpl
	 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = PLUGIN_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VERSION = PLUGIN_CONTAINER__VERSION;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PLUGINS = PLUGIN_CONTAINER__PLUGINS;

	/**
	 * The feature id for the '<em><b>Hue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__HUE = PLUGIN_CONTAINER__HUE;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__BUNDLES = PLUGIN_CONTAINER__BUNDLES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = PLUGIN_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PROCESSED = PLUGIN_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONTAINING_GRAPH = PLUGIN_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FEATURES = PLUGIN_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = PLUGIN_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = PLUGIN_CONTAINER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph <em>PDE Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDE Graph</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.PDEGraph
	 * @generated
	 */
	EClass getPDEGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getFeatures()
	 * @see #getPDEGraph()
	 * @generated
	 */
	EReference getPDEGraph_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getProducts()
	 * @see #getPDEGraph()
	 * @generated
	 */
	EReference getPDEGraph_Products();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getBundleSymbolicName <em>Bundle Symbolic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle Symbolic Name</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.PDEGraph#getBundleSymbolicName()
	 * @see #getPDEGraph()
	 * @generated
	 */
	EAttribute getPDEGraph_BundleSymbolicName();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getContainingElement <em>Containing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Element</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Plugin#getContainingElement()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_ContainingElement();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getExportedBundles <em>Exported Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exported Bundles</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Plugin#getExportedBundles()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_ExportedBundles();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getRequiredBundles <em>Required Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Bundles</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Plugin#getRequiredBundles()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_RequiredBundles();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getImportedPackages <em>Imported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Packages</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Plugin#getImportedPackages()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_ImportedPackages();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.Plugin#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Plugin#getParameters()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Parameters();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.Feature#getRequiredFeatures <em>Required Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Features</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Feature#getRequiredFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RequiredFeatures();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.pdedependencies2dot.model.Feature#getContainingGraph <em>Containing Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Graph</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Feature#getContainingGraph()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ContainingGraph();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.Feature#getAdditionnalPlugins <em>Additionnal Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additionnal Plugins</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Feature#getAdditionnalPlugins()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_AdditionnalPlugins();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.Feature#getRequiredPlugins <em>Required Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Plugins</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Feature#getRequiredPlugins()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_RequiredPlugins();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer <em>Plugin Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Container</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.PluginContainer
	 * @generated
	 */
	EClass getPluginContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getPlugins()
	 * @see #getPluginContainer()
	 * @generated
	 */
	EReference getPluginContainer_Plugins();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getHue <em>Hue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hue</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getHue()
	 * @see #getPluginContainer()
	 * @generated
	 */
	EAttribute getPluginContainer_Hue();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundles</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getBundles()
	 * @see #getPluginContainer()
	 * @generated
	 */
	EReference getPluginContainer_Bundles();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.PluginContainer#getDescription()
	 * @see #getPluginContainer()
	 * @generated
	 */
	EAttribute getPluginContainer_Description();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.NamedElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.NamedElement#getVersion()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Version();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.Processeable <em>Processeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processeable</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Processeable
	 * @generated
	 */
	EClass getProcesseable();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.Processeable#isProcessed <em>Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processed</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Processeable#isProcessed()
	 * @see #getProcesseable()
	 * @generated
	 */
	EAttribute getProcesseable_Processed();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.pdedependencies2dot.model.Bundle#getContainingElement <em>Containing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Element</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Bundle#getContainingElement()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ContainingElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.pdedependencies2dot.model.Bundle#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Bundle#getParameters()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Parameters();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.pdedependencies2dot.model.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the container reference '{@link fr.inria.diverse.pdedependencies2dot.model.Product#getContainingGraph <em>Containing Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Graph</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Product#getContainingGraph()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ContainingGraph();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.pdedependencies2dot.model.Product#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see fr.inria.diverse.pdedependencies2dot.model.Product#getFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Features();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.PDEGraphImpl <em>PDE Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.PDEGraphImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getPDEGraph()
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
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDE_GRAPH__PRODUCTS = eINSTANCE.getPDEGraph_Products();

		/**
		 * The meta object literal for the '<em><b>Bundle Symbolic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDE_GRAPH__BUNDLE_SYMBOLIC_NAME = eINSTANCE.getPDEGraph_BundleSymbolicName();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.PluginImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getPlugin()
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
		 * The meta object literal for the '<em><b>Exported Bundles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__EXPORTED_BUNDLES = eINSTANCE.getPlugin_ExportedBundles();

		/**
		 * The meta object literal for the '<em><b>Required Bundles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__REQUIRED_BUNDLES = eINSTANCE.getPlugin_RequiredBundles();

		/**
		 * The meta object literal for the '<em><b>Imported Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__IMPORTED_PACKAGES = eINSTANCE.getPlugin_ImportedPackages();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__PARAMETERS = eINSTANCE.getPlugin_Parameters();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.FeatureImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getFeature()
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
		 * The meta object literal for the '<em><b>Required Plugins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REQUIRED_PLUGINS = eINSTANCE.getFeature_RequiredPlugins();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.PluginContainerImpl <em>Plugin Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.PluginContainerImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getPluginContainer()
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
		 * The meta object literal for the '<em><b>Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_CONTAINER__BUNDLES = eINSTANCE.getPluginContainer_Bundles();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_CONTAINER__DESCRIPTION = eINSTANCE.getPluginContainer_Description();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.NamedElementImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getNamedElement()
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

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__VERSION = eINSTANCE.getNamedElement_Version();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.ProcesseableImpl <em>Processeable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ProcesseableImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getProcesseable()
		 * @generated
		 */
		EClass PROCESSEABLE = eINSTANCE.getProcesseable();

		/**
		 * The meta object literal for the '<em><b>Processed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSEABLE__PROCESSED = eINSTANCE.getProcesseable_Processed();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.BundleImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Containing Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__CONTAINING_ELEMENT = eINSTANCE.getBundle_ContainingElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__PARAMETERS = eINSTANCE.getBundle_Parameters();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.pdedependencies2dot.model.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ProductImpl
		 * @see fr.inria.diverse.pdedependencies2dot.model.impl.ModelPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Containing Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CONTAINING_GRAPH = eINSTANCE.getProduct_ContainingGraph();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__FEATURES = eINSTANCE.getProduct_Features();

	}

} //ModelPackage
