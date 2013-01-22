/**
 */
package knowledge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEE Co Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link knowledge.DEECoModel#getElements <em>Elements</em>}</li>
 *   <li>{@link knowledge.DEECoModel#getKnowledges <em>Knowledges</em>}</li>
 * </ul>
 * </p>
 *
 * @see knowledge.KnowledgePackage#getDEECoModel()
 * @model
 * @generated
 */
public interface DEECoModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link knowledge.AbstractElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see knowledge.KnowledgePackage#getDEECoModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractElement> getElements();

	/**
	 * Returns the value of the '<em><b>Knowledges</b></em>' containment reference list.
	 * The list contents are of type {@link knowledge.AbstractKnowledge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledges</em>' containment reference list.
	 * @see knowledge.KnowledgePackage#getDEECoModel_Knowledges()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractKnowledge> getKnowledges();

} // DEECoModel
