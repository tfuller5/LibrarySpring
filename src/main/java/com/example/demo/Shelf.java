package com.example.demo;

import java.util.ArrayList;
import java.util.List;


public class Shelf extends CollectionOfBooks {
    private int shelfId;
    private String shelfName;

    // one instance of a book
    Book book = new Book();
    // arraylist of books
    List<Book> listOfBooks = new ArrayList<>();
}
