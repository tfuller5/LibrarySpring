package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class anotherController {
    @RequestMapping("/bye")
    public String byeWorld() {
        // this is in the service
        // could be called timeService.java
        String time = timeService.getCurrentTime();
        return time;

        //table called students
        // i want to display the name of an attribute from the db
    }

    @RequestMapping("/")
    public String login() { // "login is never used"
        // login is called by spring in the background
        // return actually ends the function
        // there can never be code after return is invoked
        return "login.html";
    }
}
