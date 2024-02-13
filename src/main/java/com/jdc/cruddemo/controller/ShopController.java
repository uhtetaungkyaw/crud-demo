package com.jdc.cruddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @GetMapping("/shop")
    public String welcomemyshop(){
        return "Welcome My Shop!";
    }
}
