package com.example.demo.Controller;

import com.example.demo.Model.Book;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libraryController {
    @RequestMapping("/books")
    public String getBook() {
        Book book1 = new Book();
        return book1.getBookName();
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
