/**
 */
package upctforma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.Fixed#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getFixed()
 * @model
 * @generated
 */
public interface Fixed extends Parameter {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctforma.TypeSimpleElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctforma.TypeSimpleElement
	 * @see #setType(TypeSimpleElement)
	 * @see upctforma.UpctformaPackage#getFixed_Type()
	 * @model
	 * @generated
	 */
	TypeSimpleElement getType();

	/**
	 * Sets the value of the '{@link upctforma.Fixed#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctforma.TypeSimpleElement
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeSimpleElement value);

} // Fixed
