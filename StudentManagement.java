import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    int searchIndex;

    while (true) {
      System.out.println("\n--- Management System ---");
      System.out.println("1. Add New Student");
      System.out.println("2. List Students ");
      System.out.println("3. Edit Student");
      System.out.println("4. Show Student");
      System.out.println("5. Delete Student");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Enter Student Id: ");
          int studentId = scanner.nextInt();

          System.out.print("Enter Name: ");
          String studentName = scanner.nextLine();

          students.add(new Student(studentId, studentName));
          System.out.println("Student added successfully!");
          break;

        case 2:

          System.out.println("Index | Student Title     | Student Author     | Student Quantity");
          for (int i = 0; i < students.size(); i++) {
            System.out.print(i + 1 + "     | ");
            students.get(i).displayStudent();
          }
          break;

        case 3:
          System.out.print("Edit Student: ");
          searchIndex = searchByIndex();

          if (checkElement(students, searchIndex)) {
            Student studentToEdit = students.get(searchIndex);

            System.out.println("Current details:");
            studentToEdit.displayStudent();

            System.out.print("Eneter The New Title:");
            int newStudentId = scanner.nextInt();
            studentToEdit.studentId = newStudentId;

            System.out.print("Eneter The Author Name:");
            String newStudentName = scanner.nextLine();
            studentToEdit.studentName = newStudentName;

          }
          break;

        case 4:
          System.out.print("Show Student: ");
          searchIndex = searchByIndex();

          if (checkElement(students, searchIndex)) {
            Student studentToEdit = students.get(searchIndex);

            System.out.println("Current details:");
            studentToEdit.displayStudent();
          }

          break;

        case 5:
          System.out.println("Delete Student");
          searchIndex = searchByIndex();

          if (checkElement(students, searchIndex)) {
            Student StudentToEdit = students.get(searchIndex);

            StudentToEdit.displayStudent();
            System.out.println("Deleted Successfully!");
            students.remove(searchIndex);
          }

          break;

        case 6:
          System.out.println("Thank You");
          return;

        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  public static int searchByIndex() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Student Index to search: ");
    int searchIndex = scanner.nextInt();
    return searchIndex;
  }

  public static boolean checkElement(ArrayList<Student> students, int searchIndex) {
    if (searchIndex < 0 || searchIndex >= students.size()) {
      System.out.println("Invalid index! No Student found.");
      return false;
    }
    return true;
  }
}