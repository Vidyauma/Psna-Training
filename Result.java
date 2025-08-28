
import java.util.*;

abstract class Person {
  public abstract void displayDetails();
}

class Student extends Person {
  private String name;
  private int rollNo;

  public Student() {
      this.name = "Unknown";
      this.rollNo = 0;
  }

  public Student(String name, int rollNo) {
      this.name = name;
      this.rollNo = rollNo;
  }

    public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getRollNo() {
      return rollNo;
  }

  public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
  }

  @Override
  public void displayDetails() {
      System.out.println("Student Name: " + name);
      System.out.println("Roll Number: " + rollNo);
  }
}

class Tech extends Student {
  private int marks1, marks2, marks3;
  private String grade;

  public Tech(String name, int rollNo, int m1, int m2, int m3) {
      super(name, rollNo); 
      this.marks1 = m1;
      this.marks2 = m2;
      this.marks3 = m3;
  }

  public int calculateResult() {
      return marks1 + marks2 + marks3;
  }

  public double calculateResult(int totalSubjects) {
      return (marks1 + marks2 + marks3) / (double) totalSubjects;
  }

  @Override
  public void displayDetails() {
      super.displayDetails(); 
      System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
      int total = calculateResult();
      double avg = calculateResult(3);

      if (avg >= 90) grade = "A+";
      else if (avg >= 75) grade = "A";
      else if (avg >= 60) grade = "B";
      else if (avg >= 50) grade = "C";
      else grade = "Fail";

      System.out.println("Total Marks: " + total);
      System.out.println("Average: " + avg);
      System.out.println("Grade: " + grade);
  }
}


public class Result {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Student Name: ");
      String name = sc.nextLine();

      System.out.print("Enter Roll Number: ");
      int rollNo = sc.nextInt();

      System.out.print("Enter marks of Subject 1: ");
      int m1 = sc.nextInt();

      System.out.print("Enter marks of Subject 2: ");
      int m2 = sc.nextInt();

      System.out.print("Enter marks of Subject 3: ");
      int m3 = sc.nextInt();

      Tech studentResult = new Tech(name, rollNo, m1, m2, m3);

      System.out.println("\n--- Student Result ---");
      studentResult.displayDetails();

     
  }
}
