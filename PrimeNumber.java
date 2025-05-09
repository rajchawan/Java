import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the Number or Enter 0 to Exit");
    int number = scanner.nextInt();

    if (number != 0) {

      if (number % 2 == 0) {
        System.out.println(number + " is prime number");
      }else {
        System.out.println(number + " is not prime number");
      }
    } else {
      System.out.println("Thank You");
    }
  }
}