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
}
