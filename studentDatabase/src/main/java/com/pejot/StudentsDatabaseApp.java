package com.pejot;

import java.util.Scanner;

public class StudentsDatabaseApp {
  public static void main(String[] args) {
    //Ask how many new students we want to add
    System.out.println("Podaj liczbe studentów: ");
    Scanner in = new Scanner(System.in);
    int numOfstudents = in.nextInt();
    Student[] students = new Student[numOfstudents];
    // Create n number of news students
    for (int i = 0; i < numOfstudents; i++) {
      students[i] = new Student();
      students[i].enroll();
      students[i].payTuition();
    }
    for (int i = 0; i < numOfstudents; i++) {
      System.out.println(students[i].toString());
    }
  }
}
