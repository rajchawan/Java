import java.util.Scanner;

public class Calculator {

  static void add(int x, int y) {
    System.out.println("Result: " + (x + y));
  }

    static void sub(int x, int y) {
    System.out.println("Result: " + (x - y));
  }

    static void div(int x, int y) {
    System.out.println("Result: " + (x / y));
  }

    static void mul(int x, int y) {
    System.out.println("Result: " + (x * y));
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int choice = 5;
    while (choice != 0) {

      System.out.println("1. ADDITION");
      System.out.println("2. SUBTRACTION");
      System.out.println("3. DIVISION");
      System.out.println("4. MULTIPLICATION");
      System.out.println("5. EXIT");

      System.out.println("Enter your Choice");
      choice = scanner.nextInt();

      System.out.println("Enter the 1st Number");
      int number1 = scanner.nextInt();
      System.out.println("Enter the 2nd Number");
      int number2 = scanner.nextInt();
        switch(choice) {
          case 1:
            add(number1, number2);
            break;
          case 2:
            sub(number1,number2);
            break;
          case 3:
            div(number1, number2);
            break;
          case 4:
            mul(number1, number2);
            break;
          default:
            System.out.println("Thank You");
        }
      }
  }
}