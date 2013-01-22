/**
 */
package knowledge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link knowledge.AbstractKnowledge#getName <em>Name</em>}</li>
 *   <li>{@link knowledge.AbstractKnowledge#getReader <em>Reader</em>}</li>
 * </ul>
 * </p>
 *
 * @see knowledge.KnowledgePackage#getAbstractKnowledge()
 * @model abstract="true"
 * @generated
 */
public interface AbstractKnowledge extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see knowledge.KnowledgePackage#getAbstractKnowledge_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link knowledge.AbstractKnowledge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reader</b></em>' reference list.
	 * The list contents are of type {@link knowledge.AbstractElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader</em>' reference list.
	 * @see knowledge.KnowledgePackage#getAbstractKnowledge_Reader()
	 * @model
	 * @generated
	 */
	EList<AbstractElement> getReader();

} // AbstractKnowledge
