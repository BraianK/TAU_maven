package com.pejot;

import java.util.ArrayList;
import java.util.List;

public class StudentOperations {
  public float discount(float tuitionBalance) {
    return (float) (tuitionBalance * 0.3);

  }
  public boolean isTuitionToPay(float tuitionBalance) {
    if(tuitionBalance > 0) {
      return true;
    }else {
      return false;
    }

  }
  public float discount50(float tuitionBalance) {
    if(tuitionBalance == 0) {
      throw new IllegalArgumentException("Czesne jest uregulowane!");
    }else {
      return (float) (tuitionBalance * 0.5);
    }
  }
  public int payTuitionForTest(int tuitionBalance,int payment) {
    tuitionBalance = tuitionBalance - payment;
    return tuitionBalance;
  }
  public String  studentFullName(String name,String lastName) {
    String fullName = name + " " + lastName;
    return fullName;
  }
  public List studentGrades(String firstGrade,String secondGrade) {
    List grades = new ArrayList();
    grades.add(firstGrade);
    grades.add(secondGrade);
    return grades;
  }
}
