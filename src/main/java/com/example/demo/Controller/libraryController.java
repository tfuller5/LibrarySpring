package com.example.demo.Controller;

import com.example.demo.Model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libraryController {
    @RequestMapping("/")
    public String login() { // "login is never used"
        // login is called by spring in the background
        // return actually ends the function
        // there can never be code after return is invoked
        return "login.html";
    }

    @RequestMapping("/books")
    public String getBook() {
        Book book1 = new Book();
        return book1.getBookName();
    }
}
