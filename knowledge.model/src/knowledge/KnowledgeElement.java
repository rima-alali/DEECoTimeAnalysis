/**
 */
package knowledge;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link knowledge.KnowledgeElement#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see knowledge.KnowledgePackage#getKnowledgeElement()
 * @model
 * @generated
 */
public interface KnowledgeElement extends KnowledgeNode {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link knowledge.KnowledgeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see knowledge.KnowledgePackage#getKnowledgeElement_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<KnowledgeNode> getChild();

} // KnowledgeElement
