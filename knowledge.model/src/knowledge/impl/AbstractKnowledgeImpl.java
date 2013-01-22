/**
 */
package knowledge.impl;

import java.util.Collection;

import knowledge.AbstractElement;
import knowledge.AbstractKnowledge;
import knowledge.KnowledgePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link knowledge.impl.AbstractKnowledgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link knowledge.impl.AbstractKnowledgeImpl#getReader <em>Reader</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractKnowledgeImpl extends EObjectImpl implements AbstractKnowledge {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReader() <em>Reader</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractElement> reader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractKnowledgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KnowledgePackage.Literals.ABSTRACT_KNOWLEDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KnowledgePackage.ABSTRACT_KNOWLEDGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractElement> getReader() {
		if (reader == null) {
			reader = new EObjectResolvingEList<AbstractElement>(AbstractElement.class, this, KnowledgePackage.ABSTRACT_KNOWLEDGE__READER);
		}
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KnowledgePackage.ABSTRACT_KNOWLEDGE__NAME:
				return getName();
			case KnowledgePackage.ABSTRACT_KNOWLEDGE__READER:
				return getReader();
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
			case KnowledgePackage.ABSTRACT_KNOWLEDGE__NAME:
				setName((String)newValue);
				return;
			case KnowledgePackage.ABSTRACT_KNOWLEDGE__READER:
				getReader().clear();
				getReader().addAll((Collection<? extends AbstractElement>)newValue);
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
			case KnowledgePackage.ABSTRACT_KNOWLEDGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KnowledgePackage.ABSTRACT_KNOWLEDGE__READER:
				getReader().clear();
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
			case KnowledgePackage.ABSTRACT_KNOWLEDGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KnowledgePackage.ABSTRACT_KNOWLEDGE__READER:
				return reader != null && !reader.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractKnowledgeImpl
