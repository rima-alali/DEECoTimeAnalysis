/**
 */
package knowledge.impl;

import knowledge.DEECoModel;
import knowledge.Ensemble;
import knowledge.KnowledgeElement;
import knowledge.KnowledgeFactory;
import knowledge.KnowledgePackage;
import knowledge.Leaf;

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
public class KnowledgeFactoryImpl extends EFactoryImpl implements KnowledgeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KnowledgeFactory init() {
		try {
			KnowledgeFactory theKnowledgeFactory = (KnowledgeFactory)EPackage.Registry.INSTANCE.getEFactory("http://knowledge/1.0"); 
			if (theKnowledgeFactory != null) {
				return theKnowledgeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KnowledgeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeFactoryImpl() {
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
			case KnowledgePackage.KNOWLEDGE_ELEMENT: return createKnowledgeElement();
			case KnowledgePackage.LEAF: return createLeaf();
			case KnowledgePackage.ENSEMBLE: return createEnsemble();
			case KnowledgePackage.PROCESS: return createProcess();
			case KnowledgePackage.DEE_CO_MODEL: return createDEECoModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeElement createKnowledgeElement() {
		KnowledgeElementImpl knowledgeElement = new KnowledgeElementImpl();
		return knowledgeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leaf createLeaf() {
		LeafImpl leaf = new LeafImpl();
		return leaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ensemble createEnsemble() {
		EnsembleImpl ensemble = new EnsembleImpl();
		return ensemble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public knowledge.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEECoModel createDEECoModel() {
		DEECoModelImpl deeCoModel = new DEECoModelImpl();
		return deeCoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgePackage getKnowledgePackage() {
		return (KnowledgePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KnowledgePackage getPackage() {
		return KnowledgePackage.eINSTANCE;
	}

} //KnowledgeFactoryImpl
