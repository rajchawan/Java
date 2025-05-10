import java.util.ArrayList;
import java.util.Scanner;

class Book {
  // int bookId;
  String title;
  String author;
  int quantity;

  public Book(String title, String author, int quantity) {
    // this.bookId = bookId;
    this.title = title;
    this.author = author;
    this.quantity = quantity;
  }

  public void displayBook() {
    System.out.println(title + "            | " + author + "            | " + quantity);
  }
}
