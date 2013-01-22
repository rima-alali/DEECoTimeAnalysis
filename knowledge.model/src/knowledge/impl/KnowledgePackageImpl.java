/**
 */
package knowledge.impl;

import knowledge.AbstractElement;
import knowledge.AbstractKnowledge;
import knowledge.DEECoModel;
import knowledge.Ensemble;
import knowledge.KnowledgeElement;
import knowledge.KnowledgeFactory;
import knowledge.KnowledgeNode;
import knowledge.KnowledgePackage;
import knowledge.Leaf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnowledgePackageImpl extends EPackageImpl implements KnowledgePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractKnowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ensembleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deeCoModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see knowledge.KnowledgePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KnowledgePackageImpl() {
		super(eNS_URI, KnowledgeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KnowledgePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KnowledgePackage init() {
		if (isInited) return (KnowledgePackage)EPackage.Registry.INSTANCE.getEPackage(KnowledgePackage.eNS_URI);

		// Obtain or create and register package
		KnowledgePackageImpl theKnowledgePackage = (KnowledgePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KnowledgePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KnowledgePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theKnowledgePackage.createPackageContents();

		// Initialize created meta-data
		theKnowledgePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKnowledgePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KnowledgePackage.eNS_URI, theKnowledgePackage);
		return theKnowledgePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractKnowledge() {
		return abstractKnowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractKnowledge_Name() {
		return (EAttribute)abstractKnowledgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractKnowledge_Reader() {
		return (EReference)abstractKnowledgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeNode() {
		return knowledgeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeElement() {
		return knowledgeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeElement_Child() {
		return (EReference)knowledgeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeaf() {
		return leafEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeaf_Type() {
		return (EAttribute)leafEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeaf_Writer() {
		return (EReference)leafEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnsemble() {
		return ensembleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractElement() {
		return abstractElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractElement_Name() {
		return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractElement_Period() {
		return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEECoModel() {
		return deeCoModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEECoModel_Elements() {
		return (EReference)deeCoModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEECoModel_Knowledges() {
		return (EReference)deeCoModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeFactory getKnowledgeFactory() {
		return (KnowledgeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractKnowledgeEClass = createEClass(ABSTRACT_KNOWLEDGE);
		createEAttribute(abstractKnowledgeEClass, ABSTRACT_KNOWLEDGE__NAME);
		createEReference(abstractKnowledgeEClass, ABSTRACT_KNOWLEDGE__READER);

		knowledgeNodeEClass = createEClass(KNOWLEDGE_NODE);

		knowledgeElementEClass = createEClass(KNOWLEDGE_ELEMENT);
		createEReference(knowledgeElementEClass, KNOWLEDGE_ELEMENT__CHILD);

		leafEClass = createEClass(LEAF);
		createEAttribute(leafEClass, LEAF__TYPE);
		createEReference(leafEClass, LEAF__WRITER);

		ensembleEClass = createEClass(ENSEMBLE);

		processEClass = createEClass(PROCESS);

		abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
		createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__NAME);
		createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__PERIOD);

		deeCoModelEClass = createEClass(DEE_CO_MODEL);
		createEReference(deeCoModelEClass, DEE_CO_MODEL__ELEMENTS);
		createEReference(deeCoModelEClass, DEE_CO_MODEL__KNOWLEDGES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		knowledgeNodeEClass.getESuperTypes().add(this.getAbstractKnowledge());
		knowledgeElementEClass.getESuperTypes().add(this.getKnowledgeNode());
		leafEClass.getESuperTypes().add(this.getKnowledgeNode());
		ensembleEClass.getESuperTypes().add(this.getAbstractElement());
		processEClass.getESuperTypes().add(this.getAbstractElement());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractKnowledgeEClass, AbstractKnowledge.class, "AbstractKnowledge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractKnowledge_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractKnowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractKnowledge_Reader(), this.getAbstractElement(), null, "reader", null, 0, -1, AbstractKnowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeNodeEClass, KnowledgeNode.class, "KnowledgeNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(knowledgeElementEClass, KnowledgeElement.class, "KnowledgeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeElement_Child(), this.getKnowledgeNode(), null, "child", null, 1, -1, KnowledgeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leafEClass, Leaf.class, "Leaf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeaf_Type(), ecorePackage.getEString(), "type", null, 0, 1, Leaf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeaf_Writer(), this.getAbstractElement(), null, "writer", null, 0, 1, Leaf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ensembleEClass, Ensemble.class, "Ensemble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processEClass, knowledge.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractElement_Period(), ecorePackage.getEInt(), "period", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deeCoModelEClass, DEECoModel.class, "DEECoModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEECoModel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, DEECoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEECoModel_Knowledges(), this.getAbstractKnowledge(), null, "knowledges", null, 0, -1, DEECoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //KnowledgePackageImpl
