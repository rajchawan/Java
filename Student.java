import java.util.ArrayList;
import java.util.Scanner;

class Student {
  // int bookId;
  int studentId;
  String studentName;
  ArrayList<String> bookIdBorrowed = new ArrayList<String>();

  public Student(int studentId, String name) {
    // this.bookId = bookId;
    this.studentId = studentId;
    this.studentName = studentName;
  }

  public void displayStudent() {
    System.out.println(studentId + "            | " + studentName);
  }
}
