import java.util.ArrayList;
import java.util.Scanner;

public class BookSystem {
  public static void main(String[] args) {
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    int searchIndex;

    while (true) {
      System.out.println("\n--- Book Management System ---");
      System.out.println("1. Add Book");
      System.out.println("2. List Book");
      System.out.println("3. Edit Book");
      System.out.println("4. Show Book");
      System.out.println("5. Delete Book");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Enter Book Title: ");
          String title = scanner.nextLine();

          System.out.print("Enter Book Author: ");
          String author = scanner.nextLine();

          System.out.print("Enter Quantity: ");
          int qty = scanner.nextInt();
          scanner.nextLine(); // consume newline

          books.add(new Book(title, author, qty));
          System.out.println("Book added successfully!");
          break;

        case 2:

          System.out.println("Index | Book Title     | Book Author     | Book Quantity");
          for (int i = 0; i < books.size(); i++) {
            System.out.print(i + 1 + "     | ");
            books.get(i).displayBook();
          }
          break;

        case 3:
          System.out.print("Edit Book: ");
          searchIndex = searchByIndex();

          if (checkElement(books, searchIndex)) {
            Book bookToEdit = books.get(searchIndex);

            System.out.println("Current details:");
            bookToEdit.displayBook();

            System.out.print("Eneter The New Title:");
            String newTitle = scanner.nextLine();
            bookToEdit.title = newTitle;

            System.out.print("Eneter The Author Name:");
            String newAuthor = scanner.nextLine();
            bookToEdit.author = newAuthor;

            System.out.print("Eneter The Quantity:");
            int newQuantity = scanner.nextInt();
            bookToEdit.quantity = newQuantity;

          }
          break;

        case 4:
          System.out.print("Show Book: ");
          searchIndex = searchByIndex();

          if (checkElement(books, searchIndex)) {
            Book bookToEdit = books.get(searchIndex);

            System.out.println("Current details:");
            bookToEdit.displayBook();
          }

          break;

        case 5:
          System.out.println("Delete Book");
          searchIndex = searchByIndex();

          if (checkElement(books, searchIndex)) {
            Book bookToEdit = books.get(searchIndex);

            bookToEdit.displayBook();
            System.out.println("Deleted Successfully!");
            books.remove(searchIndex);
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
    System.out.println("Enter Book Index to search: ");
    int searchIndex = scanner.nextInt();
    return searchIndex;
  }

  public static boolean checkElement(ArrayList<Book> books, int searchIndex) {
    if (searchIndex < 0 || searchIndex >= books.size()) {
      System.out.println("Invalid index! No book found.");
      return false;
    }
    return true;
  }
}