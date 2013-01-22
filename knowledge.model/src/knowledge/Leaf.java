/**
 */
package knowledge;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link knowledge.Leaf#getType <em>Type</em>}</li>
 *   <li>{@link knowledge.Leaf#getWriter <em>Writer</em>}</li>
 * </ul>
 * </p>
 *
 * @see knowledge.KnowledgePackage#getLeaf()
 * @model
 * @generated
 */
public interface Leaf extends KnowledgeNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see knowledge.KnowledgePackage#getLeaf_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link knowledge.Leaf#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer</em>' reference.
	 * @see #setWriter(AbstractElement)
	 * @see knowledge.KnowledgePackage#getLeaf_Writer()
	 * @model
	 * @generated
	 */
	AbstractElement getWriter();

	/**
	 * Sets the value of the '{@link knowledge.Leaf#getWriter <em>Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer</em>' reference.
	 * @see #getWriter()
	 * @generated
	 */
	void setWriter(AbstractElement value);

} // Leaf
