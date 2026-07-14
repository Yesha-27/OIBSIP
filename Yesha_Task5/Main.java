package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n====== DIGITAL LIBRARY MANAGEMENT ======");

            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    library.searchBook(id);
                    break;

                case 4:

                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    library.issueBook(id);
                    break;

                case 5:

                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    library.returnBook(id);
                    break;

                case 6:

                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    library.removeBook(id);
                    break;

                case 7:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}