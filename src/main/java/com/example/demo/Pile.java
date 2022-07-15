package com.example.demo;

import java.util.List;
import java.util.Stack;

// this is simply a collection of various books
public class Pile extends CollectionOfBooks {
    private int pileId;
    private String pileName;

    // in a pile of books
    // a book can only be added or removed from the top of the pile
    List<Book> pileOfBooks = new Stack<>();

    public void addBook(Book book) {
        System.out.println("adding a book");
        pileOfBooks.add(book);
    }

    public void removeBook(Book book) {
        System.out.println("removing a book");
        pileOfBooks.remove(book);
    }
}
