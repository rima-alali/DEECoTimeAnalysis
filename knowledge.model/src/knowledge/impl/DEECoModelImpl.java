/**
 */
package knowledge.impl;

import java.util.Collection;

import knowledge.AbstractElement;
import knowledge.AbstractKnowledge;
import knowledge.DEECoModel;
import knowledge.KnowledgePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEE Co Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link knowledge.impl.DEECoModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link knowledge.impl.DEECoModelImpl#getKnowledges <em>Knowledges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEECoModelImpl extends EObjectImpl implements DEECoModel {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractElement> elements;

	/**
	 * The cached value of the '{@link #getKnowledges() <em>Knowledges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledges()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractKnowledge> knowledges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEECoModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KnowledgePackage.Literals.DEE_CO_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, KnowledgePackage.DEE_CO_MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractKnowledge> getKnowledges() {
		if (knowledges == null) {
			knowledges = new EObjectContainmentEList<AbstractKnowledge>(AbstractKnowledge.class, this, KnowledgePackage.DEE_CO_MODEL__KNOWLEDGES);
		}
		return knowledges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KnowledgePackage.DEE_CO_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case KnowledgePackage.DEE_CO_MODEL__KNOWLEDGES:
				return ((InternalEList<?>)getKnowledges()).basicRemove(otherEnd, msgs);
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
			case KnowledgePackage.DEE_CO_MODEL__ELEMENTS:
				return getElements();
			case KnowledgePackage.DEE_CO_MODEL__KNOWLEDGES:
				return getKnowledges();
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
			case KnowledgePackage.DEE_CO_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends AbstractElement>)newValue);
				return;
			case KnowledgePackage.DEE_CO_MODEL__KNOWLEDGES:
				getKnowledges().clear();
				getKnowledges().addAll((Collection<? extends AbstractKnowledge>)newValue);
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
			case KnowledgePackage.DEE_CO_MODEL__ELEMENTS:
				getElements().clear();
				return;
			case KnowledgePackage.DEE_CO_MODEL__KNOWLEDGES:
				getKnowledges().clear();
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
			case KnowledgePackage.DEE_CO_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case KnowledgePackage.DEE_CO_MODEL__KNOWLEDGES:
				return knowledges != null && !knowledges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DEECoModelImpl
