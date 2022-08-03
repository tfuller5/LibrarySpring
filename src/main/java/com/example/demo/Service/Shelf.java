package com.example.demo.Service;

import com.example.demo.Model.Book;

import java.util.ArrayList;
import java.util.List;


public class Shelf extends collectionOfBooks {
    private int shelfId;
    private String shelfName;

    public void addBookToShelf() {
        Book harryBook = new Book();
        harryBook.setBookName("Harry Potter and the chamber of secrets");
        // arraylist of books
        List<Book> listOfBooks = new ArrayList<>();
        // add a book into the arraylist
        listOfBooks.add(harryBook);
        // print the listOfBooks
        System.out.println(listOfBooks);
    }


}
