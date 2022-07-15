package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// 1. locally: the database in a file
// 2. not locally: (
// Database: more complicated java array
// library many books, one book has one author


@RestController
public class loginAttempt {
    @PostMapping(path = {"/login_attempt"})
    // RequestBody captures the data your sending
    public String loginAttempt(@RequestBody String username) {
        System.out.println(username);
        boolean userLogsIn = true;
        if (userLogsIn) {
            return "success.html";
        }
        else {
            return "fail.html";
        }
    }
}
