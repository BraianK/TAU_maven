package com.pejot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
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
  @Test
  public void payTuitionForTestTest() {
    int tuitionBalance = 600;
    int payment = 300;
    int tmp = opr.payTuitionForTest(tuitionBalance, payment);
    assertEquals(300, tmp);
  }
  @Test
  public void studentFullNameTest() {
    String name = "Braian";
    String lastName = "Kreft";
    String tmp = opr.studentFullName(name, lastName);
    assertEquals("Braian Kreft", tmp);
  }
  @Test
  public void studentGradesTest() {
    String firstGrade = "Braian";
    String secondGrade = "Kreft";
    List tmp = opr.studentGrades(firstGrade, secondGrade);
    assertEquals("[Braian, Kreft]", tmp.toString());
  }
  @Test
  public void firstElementstudentGradesTest() {
    String firstGrade = "Braian";
    String secondGrade = "Kreft";
    List tmp = opr.studentGrades(firstGrade, secondGrade);
    assertEquals("Braian", tmp.get(0).toString());
  }
}
