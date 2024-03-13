
package com.learning.core.Day06;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;

import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;

class LibraryBook {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date dateOfPublication;

    public LibraryBook(int bookId, String title, double price, String author, Date dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        String bookIdString = String.format("%-6d", bookId);
        String titleString = String.format("%-20s", title);
        String priceString = String.format("%-10.2f", price);
        String authorString = String.format("%-20s", author);
        String dateString = String.format("%tm/%<td/%<tY", dateOfPublication);
        return bookIdString + titleString + priceString + authorString + dateString;
    }
}
public class D06P04 {
  public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook(1001, "Python Learning", 715.0, "Martic C, Brown", new Date(2020 - 1900, 1 - 1, 2));
        LibraryBook book2 = new LibraryBook(1002, "Modern Mainframe", 295.0, "Sharad", new Date());
        LibraryBook book3 = new LibraryBook(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(1984 - 1900, 11 - 1, 23));
        LibraryBook book4 = new LibraryBook(1004, "Read C++", 295.0, "Henry Harvin", new Date(1984 - 1900, 11 - 1, 19));
        LibraryBook book5 = new LibraryBook(1005, ".Net Platform", 34970.0, "Mark J. Price", new Date(1984 - 1900, 3 - 1, 6));

        TreeSet<LibraryBook> bookSet = new TreeSet<>(Comparator.comparing(LibraryBook::getTitle));

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        for (LibraryBook book : bookSet) {
            System.out.println(book);
        }
    }
}