package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GottaHaveControl {
    @RequestMapping("/")
    public String login() {
        // "login is never used"
        // login is called by spring in the background
        // return actually ends the function
        // there can never be code after return is invoked
        return "login.html";
    }

    @RequestMapping("/success")
    public String loginSuccess() {
        return "success.html";
    }

    @RequestMapping("/fail")
    public String loginFail() {
        return "fail.html";
    }
}
