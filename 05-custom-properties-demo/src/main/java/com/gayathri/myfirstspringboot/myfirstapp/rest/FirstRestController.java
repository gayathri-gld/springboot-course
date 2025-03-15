package com.gayathri.myfirstspringboot.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    //inject custom properties
    @Value("${animal.name}")
    private String animal;
    @Value("${animal.ecosystem}")
    private String ecosystem;

    //expose new endpoint that returns animal infp "animalinfo"
    @GetMapping("/animalinfo")
    public String myFavAnimal(){
        return "Animal: " + animal + ", " + "Ecosystem: "+ ecosystem;
    }

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
