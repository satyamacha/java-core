package com.learning.core.day6;
import java.util.Date;
import java.util.TreeSet;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date dateOfPublication;

    public Book(int bookId, String title, double price, String author, Date dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
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

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.bookId, other.bookId);
    }
}
public class D06P03 {
  public static void main(String[] args) {
        Book book1 = new Book(1001, "Python Learning", 715.0, "Martic C, Brown", new Date(2020 - 1900, 1 - 1, 2));
        Book book2 = new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date());
        Book book3 = new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(1984 - 1900, 11 - 1, 23));
        Book book4 = new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(1984 - 1900, 11 - 1, 19));
        Book book5 = new Book(1005, ".Net Platform", 34970.0, "Mark J. Price", new Date(1984 - 1900, 3 - 1, 6));

        TreeSet<Book> bookSet = new TreeSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}