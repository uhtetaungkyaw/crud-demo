package com.jdc.cruddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @GetMapping("/user")
    public String welcome(){
        return "Welcome Users!";
    }
}
