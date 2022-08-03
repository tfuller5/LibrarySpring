package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Service.Shelf;
import com.example.demo.Service.collectionOfBooks;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class libraryController {

    @RequestMapping("/books")
    public void getBook() {
        Book book1 = new Book();
        //return book1.getBookName();

    }

    // spring will search all of your code
    //

    @PostMapping("/add_book")
    public String addBook(@RequestParam String book_title) {
        System.out.println("test is running" + book_title);
        // we know that our code has passed this point
        Shelf shelf = new Shelf();
        shelf.addBookToShelf();
        //
        //return shelf.toString();
        //int vs Integer
        // int is primitive type
        int num = 10;
        Integer num2 = 10;
        /*char mystring[] = ['a', 'b', 'c']

        mystring[0]

                if(x > 5) {
        printf("%d", 10)*/

        //HashMap<String, Integer> named = new HashMap<>();
        //named.get("name");
        //named.put("")

        //num.toString();
        //num2.toString();

        // homework 3rd aug
        // Shelf maintains an array of numbers
        // 1. when add book is called: add a number which is not in the array
        // 2. e.g. [1, 2, 3] can add 4 and 5
        // 3. return the array converted to a string
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        return numbers.toString();
    }

    // spring automatically reads the params from the url
    @PostMapping("/delivery")
    public String authenticateUsernameAndPassword(@RequestParam String usernameAttempt,

                                                @RequestParam String passwordAttempt) {
        String actual_username = "apple";
        String actual_password = "1234";
        System.out.println(usernameAttempt);
        System.out.println(passwordAttempt);

        // Boolean authenticated = false;
        if (passwordAttempt.equals(actual_password) && usernameAttempt.equals( actual_username)) {
            System.out.println("test1");
            return "success";
        }
        else {
            System.out.println("test2");
            return "fail";
        }

        // return success if they both match
        // return fail if they don't

        //System.out.println("username: "+username);
        //System.out.println("password: "+password);
    }
}
