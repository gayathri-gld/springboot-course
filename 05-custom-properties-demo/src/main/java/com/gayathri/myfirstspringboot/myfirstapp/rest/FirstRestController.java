package com.gayathri.myfirstspringboot.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return  "Hello World!";
    }

    //expose a new endpoint for "motivation"
    @GetMapping("/motivation")
    public String quoteOfTheDay(){
        return  "Only you can do it for you!";
    }
} 
