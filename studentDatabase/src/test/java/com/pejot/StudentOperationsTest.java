package com.pejot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
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
    String firstGrade = "1";
    String secondGrade = "2";
    List tmp = opr.studentGrades(firstGrade, secondGrade);
    assertEquals("[1, 2]", tmp.toString());
  }
  @Test
  public void firstElementStudentGradesTest() {
    String firstGrade = "1";
    String secondGrade = "2";
    List tmp = opr.studentGrades(firstGrade, secondGrade);
    assertEquals("1", tmp.get(0).toString());
  }
  @Test
  public void studentSortTest() {
    String firstElement = "3";
    String secondElement = "1";
    String thirdElement = "2";
    List tmp = opr.studentSort(firstElement, secondElement, thirdElement);
    assertEquals("[1, 2, 3]", tmp.toString());
  }
  @Test
  public void studentGradeFindMinTest() {
    int firstElement = 3;
    int secondElement = 1;
    int thirdElement = 2;
    int tmp = opr.studentGradeFindtMin(firstElement, secondElement, thirdElement);
    assertEquals(1, tmp);
  }
  @Test
  public void studentGradeFindMaxTest() {
    int firstElement = 3;
    int secondElement = 1;
    int thirdElement = 2;
    int tmp = opr.studentGradeFindtMax(firstElement, secondElement, thirdElement);
    assertEquals(3, tmp);
  }
  @Test
  public void testDiscountMockTest() {
    StudentOperations opr = mock(StudentOperations.class);
    when(opr.discount(600)).thenReturn((float) 180);
    float discount = opr.discount(600);
    assertEquals(180, discount);
  }
  @Test
  public void studentFullNameMockTest() {
    StudentOperations opr = mock(StudentOperations.class);
    String name = "Braian";
    String lastName = "Kreft";
    when(opr.studentFullName(name, lastName)).thenReturn("Braian Kreft");
    String tmp = opr.studentFullName(name, lastName);
    assertEquals("Braian Kreft", tmp);
  }
  @Test
  public void studentGradesMockTest() {
    StudentOperations opr = mock(StudentOperations.class);
    String firstGrade = "1";
    String secondGrade = "2";
    List list = new ArrayList();
    list.add("1");
    list.add("2");
    when(opr.studentGrades(firstGrade, secondGrade)).thenReturn(list);
    List tmp = opr.studentGrades(firstGrade, secondGrade);
    assertEquals("[1, 2]", tmp.toString());
  }
  @Test
  public void returnBalanceMockTest() {
    Student student = mock(Student.class);
    when(student.returnBalance()).thenReturn(123);
    int balance = student.returnBalance();
    assertEquals(123, balance);
  }
  @Test
  public void viewStudentIdMockTest() {
    Student student = mock(Student.class);
    when(student.getStudentID()).thenReturn("1");
    String id= student.getStudentID();
    assertEquals("1", id);
  }
  @Test
  public void viewStudentGradesMockTest() {
    Student student = mock(Student.class);
    List list = new ArrayList();
    list.add("1");
    list.add("2");
    when(student.getStudentGrades()).thenReturn(list);
    List tmp = student.getStudentGrades();
    assertEquals("[1, 2]", tmp.toString());
  }
}
