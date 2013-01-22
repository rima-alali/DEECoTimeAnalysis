/**
 */
package knowledge;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see knowledge.KnowledgeFactory
 * @model kind="package"
 * @generated
 */
public interface KnowledgePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "knowledge";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://knowledge/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "knowledge";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KnowledgePackage eINSTANCE = knowledge.impl.KnowledgePackageImpl.init();

	/**
	 * The meta object id for the '{@link knowledge.impl.AbstractKnowledgeImpl <em>Abstract Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see knowledge.impl.AbstractKnowledgeImpl
	 * @see knowledge.impl.KnowledgePackageImpl#getAbstractKnowledge()
	 * @generated
	 */
	int ABSTRACT_KNOWLEDGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE__READER = 1;

	/**
	 * The number of structural features of the '<em>Abstract Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KNOWLEDGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link knowledge.impl.KnowledgeNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see knowledge.impl.KnowledgeNodeImpl
	 * @see knowledge.impl.KnowledgePackageImpl#getKnowledgeNode()
	 * @generated
	 */
	int KNOWLEDGE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_NODE__NAME = ABSTRACT_KNOWLEDGE__NAME;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_NODE__READER = ABSTRACT_KNOWLEDGE__READER;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_NODE_FEATURE_COUNT = ABSTRACT_KNOWLEDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link knowledge.impl.KnowledgeElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see knowledge.impl.KnowledgeElementImpl
	 * @see knowledge.impl.KnowledgePackageImpl#getKnowledgeElement()
	 * @generated
	 */
	int KNOWLEDGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_ELEMENT__NAME = KNOWLEDGE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_ELEMENT__READER = KNOWLEDGE_NODE__READER;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_ELEMENT__CHILD = KNOWLEDGE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_ELEMENT_FEATURE_COUNT = KNOWLEDGE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link knowledge.impl.LeafImpl <em>Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see knowledge.impl.LeafImpl
	 * @see knowledge.impl.KnowledgePackageImpl#getLeaf()
	 * @generated
	 */
	int LEAF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__NAME = KNOWLEDGE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__READER = KNOWLEDGE_NODE__READER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__TYPE = KNOWLEDGE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__WRITER = KNOWLEDGE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FEATURE_COUNT = KNOWLEDGE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link knowledge.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see knowledge.impl.AbstractElementImpl
	 * @see knowledge.impl.KnowledgePackageImpl#getAbstractElement()
	 * @generated
	 */
	int ABSTRACT_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT__PERIOD = 1;

	/**
	 * The number of structural features of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link knowledge.impl.EnsembleImpl <em>Ensemble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see knowledge.impl.EnsembleImpl
	 * @see knowledge.impl.KnowledgePackageImpl#getEnsemble()
	 * @generated
	 */
	int ENSEMBLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE__NAME = ABSTRACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE__PERIOD = ABSTRACT_ELEMENT__PERIOD;

	/**
	 * The number of structural features of the '<em>Ensemble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link knowledge.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see knowledge.impl.ProcessImpl
	 * @see knowledge.impl.KnowledgePackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = ABSTRACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PERIOD = ABSTRACT_ELEMENT__PERIOD;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link knowledge.impl.DEECoModelImpl <em>DEE Co Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see knowledge.impl.DEECoModelImpl
	 * @see knowledge.impl.KnowledgePackageImpl#getDEECoModel()
	 * @generated
	 */
	int DEE_CO_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEE_CO_MODEL__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Knowledges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEE_CO_MODEL__KNOWLEDGES = 1;

	/**
	 * The number of structural features of the '<em>DEE Co Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEE_CO_MODEL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link knowledge.AbstractKnowledge <em>Abstract Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Knowledge</em>'.
	 * @see knowledge.AbstractKnowledge
	 * @generated
	 */
	EClass getAbstractKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link knowledge.AbstractKnowledge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see knowledge.AbstractKnowledge#getName()
	 * @see #getAbstractKnowledge()
	 * @generated
	 */
	EAttribute getAbstractKnowledge_Name();

	/**
	 * Returns the meta object for the reference list '{@link knowledge.AbstractKnowledge#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reader</em>'.
	 * @see knowledge.AbstractKnowledge#getReader()
	 * @see #getAbstractKnowledge()
	 * @generated
	 */
	EReference getAbstractKnowledge_Reader();

	/**
	 * Returns the meta object for class '{@link knowledge.KnowledgeNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see knowledge.KnowledgeNode
	 * @generated
	 */
	EClass getKnowledgeNode();

	/**
	 * Returns the meta object for class '{@link knowledge.KnowledgeElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see knowledge.KnowledgeElement
	 * @generated
	 */
	EClass getKnowledgeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link knowledge.KnowledgeElement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see knowledge.KnowledgeElement#getChild()
	 * @see #getKnowledgeElement()
	 * @generated
	 */
	EReference getKnowledgeElement_Child();

	/**
	 * Returns the meta object for class '{@link knowledge.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf</em>'.
	 * @see knowledge.Leaf
	 * @generated
	 */
	EClass getLeaf();

	/**
	 * Returns the meta object for the attribute '{@link knowledge.Leaf#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see knowledge.Leaf#getType()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_Type();

	/**
	 * Returns the meta object for the reference '{@link knowledge.Leaf#getWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Writer</em>'.
	 * @see knowledge.Leaf#getWriter()
	 * @see #getLeaf()
	 * @generated
	 */
	EReference getLeaf_Writer();

	/**
	 * Returns the meta object for class '{@link knowledge.Ensemble <em>Ensemble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ensemble</em>'.
	 * @see knowledge.Ensemble
	 * @generated
	 */
	EClass getEnsemble();

	/**
	 * Returns the meta object for class '{@link knowledge.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see knowledge.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for class '{@link knowledge.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element</em>'.
	 * @see knowledge.AbstractElement
	 * @generated
	 */
	EClass getAbstractElement();

	/**
	 * Returns the meta object for the attribute '{@link knowledge.AbstractElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see knowledge.AbstractElement#getName()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EAttribute getAbstractElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link knowledge.AbstractElement#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see knowledge.AbstractElement#getPeriod()
	 * @see #getAbstractElement()
	 * @generated
	 */
	EAttribute getAbstractElement_Period();

	/**
	 * Returns the meta object for class '{@link knowledge.DEECoModel <em>DEE Co Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEE Co Model</em>'.
	 * @see knowledge.DEECoModel
	 * @generated
	 */
	EClass getDEECoModel();

	/**
	 * Returns the meta object for the containment reference list '{@link knowledge.DEECoModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see knowledge.DEECoModel#getElements()
	 * @see #getDEECoModel()
	 * @generated
	 */
	EReference getDEECoModel_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link knowledge.DEECoModel#getKnowledges <em>Knowledges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledges</em>'.
	 * @see knowledge.DEECoModel#getKnowledges()
	 * @see #getDEECoModel()
	 * @generated
	 */
	EReference getDEECoModel_Knowledges();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KnowledgeFactory getKnowledgeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link knowledge.impl.AbstractKnowledgeImpl <em>Abstract Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see knowledge.impl.AbstractKnowledgeImpl
		 * @see knowledge.impl.KnowledgePackageImpl#getAbstractKnowledge()
		 * @generated
		 */
		EClass ABSTRACT_KNOWLEDGE = eINSTANCE.getAbstractKnowledge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_KNOWLEDGE__NAME = eINSTANCE.getAbstractKnowledge_Name();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_KNOWLEDGE__READER = eINSTANCE.getAbstractKnowledge_Reader();

		/**
		 * The meta object literal for the '{@link knowledge.impl.KnowledgeNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see knowledge.impl.KnowledgeNodeImpl
		 * @see knowledge.impl.KnowledgePackageImpl#getKnowledgeNode()
		 * @generated
		 */
		EClass KNOWLEDGE_NODE = eINSTANCE.getKnowledgeNode();

		/**
		 * The meta object literal for the '{@link knowledge.impl.KnowledgeElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see knowledge.impl.KnowledgeElementImpl
		 * @see knowledge.impl.KnowledgePackageImpl#getKnowledgeElement()
		 * @generated
		 */
		EClass KNOWLEDGE_ELEMENT = eINSTANCE.getKnowledgeElement();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_ELEMENT__CHILD = eINSTANCE.getKnowledgeElement_Child();

		/**
		 * The meta object literal for the '{@link knowledge.impl.LeafImpl <em>Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see knowledge.impl.LeafImpl
		 * @see knowledge.impl.KnowledgePackageImpl#getLeaf()
		 * @generated
		 */
		EClass LEAF = eINSTANCE.getLeaf();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__TYPE = eINSTANCE.getLeaf_Type();

		/**
		 * The meta object literal for the '<em><b>Writer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF__WRITER = eINSTANCE.getLeaf_Writer();

		/**
		 * The meta object literal for the '{@link knowledge.impl.EnsembleImpl <em>Ensemble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see knowledge.impl.EnsembleImpl
		 * @see knowledge.impl.KnowledgePackageImpl#getEnsemble()
		 * @generated
		 */
		EClass ENSEMBLE = eINSTANCE.getEnsemble();

		/**
		 * The meta object literal for the '{@link knowledge.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see knowledge.impl.ProcessImpl
		 * @see knowledge.impl.KnowledgePackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '{@link knowledge.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see knowledge.impl.AbstractElementImpl
		 * @see knowledge.impl.KnowledgePackageImpl#getAbstractElement()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ELEMENT__PERIOD = eINSTANCE.getAbstractElement_Period();

		/**
		 * The meta object literal for the '{@link knowledge.impl.DEECoModelImpl <em>DEE Co Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see knowledge.impl.DEECoModelImpl
		 * @see knowledge.impl.KnowledgePackageImpl#getDEECoModel()
		 * @generated
		 */
		EClass DEE_CO_MODEL = eINSTANCE.getDEECoModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEE_CO_MODEL__ELEMENTS = eINSTANCE.getDEECoModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Knowledges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEE_CO_MODEL__KNOWLEDGES = eINSTANCE.getDEECoModel_Knowledges();

	}

} //KnowledgePackage
