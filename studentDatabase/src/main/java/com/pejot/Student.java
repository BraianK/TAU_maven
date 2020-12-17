package com.pejot;

import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentID;
  private String courses = "";
  private int tuitionBalance = 0;
  private static int costOfCourse = 600;
  private static int id = 1000;
  StudentOperations operations = new StudentOperations();
  // Constructor: prompt user to enter student's name and year
  public Student() {
    Scanner in = new Scanner(System.in);
    System.out.print("Podaj imie studenta: ");
    this.firstName = in.nextLine();

    System.out.print("Podaj nazwisko studenta: ");
    this.lastName = in.nextLine();

    System.out.print("1 - Junior\n2 - Medior\n3 - Senior\nPodaj poziom studenta: ");
    this.gradeYear = in.nextInt();
    setStudentID();

  }
  // Generate an ID
  private void setStudentID() {
    // Grade Level + ID
    id++;
    this.studentID = gradeYear + "" + id;


  }
  // Enroll a courses
  public void enroll() {
    // Get inside a loop, user hits 0
    do {
      System.out.print("Wybierz kurs (Q do wyjœcia): ");
      Scanner in = new Scanner(System.in);
      String course = in.nextLine();
      if(!course.equals("Q")) {
        courses = courses + "\n " + course;
        tuitionBalance = tuitionBalance + costOfCourse;
      }
      else { break; }
    } while (1 != 0);
  }

  // View balance
  public void viewBalance() {
    System.out.println("Twoje saldo wynosi: " + tuitionBalance);
  }
  // Pay tuition
  public void payTuition() {
    viewBalance();
    System.out.println("Naliczam zni¿kê 30%\n ");
//		Scanner in = new Scanner(System.in);

//		float discount = in.nextFloat();
    float discount = operations.discount(tuitionBalance);
    tuitionBalance = (int) (tuitionBalance - discount);
    viewBalance();
    System.out.println("Wp³aæ nale¿noœæ: ");
    Scanner in = new Scanner(System.in);
    int payment = in.nextInt();
    tuitionBalance = tuitionBalance - payment;
    System.out.println("Dziêkujemy dla p³atonœæ wynosz¹c¹: " + payment);
    viewBalance();
  }



  // Show status
  public String toString() {
    return "Dane: " + firstName + " " + lastName +
        "\nPoziom zaawansowania: " + gradeYear +
        "\nStudent ID: " + studentID +
        "\nWybrane kursy:" + courses +
        "\nSaldo: " + tuitionBalance;
  }
}
