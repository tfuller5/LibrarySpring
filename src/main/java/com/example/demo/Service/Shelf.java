package com.example.demo.Service;

import com.example.demo.Model.Book;

import java.util.ArrayList;
import java.util.List;


public class Shelf extends collectionOfBooks {
    private int shelfId;
    private String shelfName;

    // one instance of a book
    Book book = new Book();
    // arraylist of books
    List<Book> listOfBooks = new ArrayList<>();
}
