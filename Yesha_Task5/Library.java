package org.example;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully!");
    }

    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        for (Book book : books) {
            System.out.println("----------------------");
            System.out.println(book);
        }
    }

    public void searchBook(int id) {

        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println(book);
                return;
            }
        }

        System.out.println("Book Not Found!");
    }

    public void issueBook(int id) {

        for (Book book : books) {

            if (book.getId() == id) {

                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book Issued Successfully!");
                } else {
                    System.out.println("Book Already Issued!");
                }

                return;
            }
        }

        System.out.println("Book Not Found!");
    }

    public void returnBook(int id) {

        for (Book book : books) {

            if (book.getId() == id) {

                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book Returned Successfully!");
                } else {
                    System.out.println("Book Wasn't Issued.");
                }

                return;
            }
        }

        System.out.println("Book Not Found!");
    }

    public void removeBook(int id) {

        for (Book book : books) {

            if (book.getId() == id) {
                books.remove(book);
                System.out.println("Book Removed Successfully!");
                return;
            }
        }

        System.out.println("Book Not Found!");
    }
}
