/**
 */
package rslingo.rslil4privacy.rSLIL4Privacy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Partof</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof#getRefertoservice <em>Refertoservice</em>}</li>
 * </ul>
 *
 * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getServicePartof()
 * @model
 * @generated
 */
public interface ServicePartof extends EObject
{
  /**
   * Returns the value of the '<em><b>Refertoservice</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refertoservice</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refertoservice</em>' reference.
   * @see #setRefertoservice(Service)
   * @see rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage#getServicePartof_Refertoservice()
   * @model
   * @generated
   */
  Service getRefertoservice();

  /**
   * Sets the value of the '{@link rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof#getRefertoservice <em>Refertoservice</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refertoservice</em>' reference.
   * @see #getRefertoservice()
   * @generated
   */
  void setRefertoservice(Service value);

} // ServicePartof