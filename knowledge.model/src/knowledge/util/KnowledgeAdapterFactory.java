/**
 */
package knowledge.util;

import knowledge.AbstractElement;
import knowledge.AbstractKnowledge;
import knowledge.DEECoModel;
import knowledge.Ensemble;
import knowledge.KnowledgeElement;
import knowledge.KnowledgeNode;
import knowledge.KnowledgePackage;
import knowledge.Leaf;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see knowledge.KnowledgePackage
 * @generated
 */
public class KnowledgeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KnowledgePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KnowledgePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeSwitch<Adapter> modelSwitch =
		new KnowledgeSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractKnowledge(AbstractKnowledge object) {
				return createAbstractKnowledgeAdapter();
			}
			@Override
			public Adapter caseKnowledgeNode(KnowledgeNode object) {
				return createKnowledgeNodeAdapter();
			}
			@Override
			public Adapter caseKnowledgeElement(KnowledgeElement object) {
				return createKnowledgeElementAdapter();
			}
			@Override
			public Adapter caseLeaf(Leaf object) {
				return createLeafAdapter();
			}
			@Override
			public Adapter caseEnsemble(Ensemble object) {
				return createEnsembleAdapter();
			}
			@Override
			public Adapter caseProcess(knowledge.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseAbstractElement(AbstractElement object) {
				return createAbstractElementAdapter();
			}
			@Override
			public Adapter caseDEECoModel(DEECoModel object) {
				return createDEECoModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link knowledge.AbstractKnowledge <em>Abstract Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see knowledge.AbstractKnowledge
	 * @generated
	 */
	public Adapter createAbstractKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link knowledge.KnowledgeNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see knowledge.KnowledgeNode
	 * @generated
	 */
	public Adapter createKnowledgeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link knowledge.KnowledgeElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see knowledge.KnowledgeElement
	 * @generated
	 */
	public Adapter createKnowledgeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link knowledge.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see knowledge.Leaf
	 * @generated
	 */
	public Adapter createLeafAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link knowledge.Ensemble <em>Ensemble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see knowledge.Ensemble
	 * @generated
	 */
	public Adapter createEnsembleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link knowledge.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see knowledge.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link knowledge.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see knowledge.AbstractElement
	 * @generated
	 */
	public Adapter createAbstractElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link knowledge.DEECoModel <em>DEE Co Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see knowledge.DEECoModel
	 * @generated
	 */
	public Adapter createDEECoModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KnowledgeAdapterFactory
