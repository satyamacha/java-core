package com.learning.core.Day01;



class Book {
    private String bookTitle;
    private double bookPrice;

    // Get for bookTitle
    public String getBookTitle() {
        return bookTitle;
    }

    // Set for bookTitle
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Get for bookPrice
    public double getBookPrice() {
        return bookPrice;
    }

    // Set for bookPrice
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}

public class D01P01 {
    public static Book createBooks(String title, double price) {
        Book book = new Book();         // create a object for book
        book.setBookTitle(title);
        book.setBookPrice(price);
        return book;
    }

    // displaying book information
    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
    }

  
    public static void main(String[] args) {
        Book javaProgrammingBook = createBooks("Java Programming", 350.00);
        showBooks(javaProgrammingBook);
    }
}

