/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.rules;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getType <em>Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getEntryPoint <em>Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1()
 * @model extendedMetaData="name='ActionType' kind='empty'"
 * @generated
 */
public interface ActionType1 extends CommonExtensionBase {

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
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
     *        extendedMetaData="name='name' kind='attribute'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.switchyard.tools.models.switchyard1_0.rules.ActionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
     * @see #setType(ActionType)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1_Type()
     * @model required="true"
     *        extendedMetaData="name='type' kind='attribute'"
     * @generated
     */
    ActionType getType();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.switchyard.tools.models.switchyard1_0.rules.ActionType
     * @see #getType()
     * @generated
     */
    void setType(ActionType value);

    /**
     * Returns the value of the '<em><b>Entry Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry Point</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry Point</em>' attribute.
     * @see #setEntryPoint(String)
     * @see org.switchyard.tools.models.switchyard1_0.rules.RulesPackage#getActionType1_EntryPoint()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="name='entryPoint' kind='attribute'"
     * @generated
     */
    String getEntryPoint();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.rules.ActionType1#getEntryPoint <em>Entry Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entry Point</em>' attribute.
     * @see #getEntryPoint()
     * @generated
     */
    void setEntryPoint(String value);
} // ActionType1
