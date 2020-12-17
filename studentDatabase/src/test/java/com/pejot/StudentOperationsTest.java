package com.pejot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StudentOperationsTest {
  StudentOperations opr = new StudentOperations();

  @Test
  public void testDiscountTest() {

    float result = opr.discount(600);
    assertEquals(180, result);
  }
  @Test
  public void testIsTuitionToPayTest() {
    float tuitionBalance = 600;
    boolean isTuitionToPay = opr.isTuitionToPay(tuitionBalance);
    assertEquals(true, isTuitionToPay);
  }
  @Test
  public void testIsNotTuitionToPayTest() {
    float tuitionBalance = 0;
    boolean isTuitionToPay = opr.isTuitionToPay(tuitionBalance);
    assertEquals(false, isTuitionToPay);
  }


  @Test
  public void testException() {
    Throwable exception = assertThrows(
        IllegalArgumentException.class, () -> opr.discount50(0)
    );

    assertEquals("Czesne jest uregulowane!", exception.getMessage());
  }
  @Test
  public void testDiscountSameTest() {

    double result = opr.discount(600);
    double expected = 180;
    assertNotSame(expected, result);
  }
}
