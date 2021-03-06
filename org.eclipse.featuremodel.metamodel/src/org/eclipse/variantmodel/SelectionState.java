/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.variantmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Selection State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.variantmodel.VariantModelPackage#getSelectionState()
 * @model
 * @generated
 */
public enum SelectionState implements Enumerator {
  /**
   * The '<em><b>Unselected</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNSELECTED_VALUE
   * @generated
   * @ordered
   */
  UNSELECTED(0, "unselected", "unselected"),

  /**
   * The '<em><b>Selected</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SELECTED_VALUE
   * @generated
   * @ordered
   */
  SELECTED(1, "selected", "selected"),

  /**
   * The '<em><b>Excluded</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXCLUDED_VALUE
   * @generated
   * @ordered
   */
  EXCLUDED(2, "excluded", "excluded");

  /**
   * The '<em><b>Unselected</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unselected</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNSELECTED
   * @model name="unselected"
   * @generated
   * @ordered
   */
  public static final int UNSELECTED_VALUE = 0;

  /**
   * The '<em><b>Selected</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Selected</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SELECTED
   * @model name="selected"
   * @generated
   * @ordered
   */
  public static final int SELECTED_VALUE = 1;

  /**
   * The '<em><b>Excluded</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Excluded</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXCLUDED
   * @model name="excluded"
   * @generated
   * @ordered
   */
  public static final int EXCLUDED_VALUE = 2;

  /**
   * An array of all the '<em><b>Selection State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SelectionState[] VALUES_ARRAY =
    new SelectionState[] {
      UNSELECTED,
      SELECTED,
      EXCLUDED,
    };

  /**
   * A public read-only list of all the '<em><b>Selection State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SelectionState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Selection State</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SelectionState get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SelectionState result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Selection State</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SelectionState getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SelectionState result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Selection State</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SelectionState get(int value) {
    switch (value) {
      case UNSELECTED_VALUE: return UNSELECTED;
      case SELECTED_VALUE: return SELECTED;
      case EXCLUDED_VALUE: return EXCLUDED;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private SelectionState(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
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
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }
  
} //SelectionState
