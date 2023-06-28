package com.sparta.levelone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BlogController {

    @GetMapping("/blog")
    public String hello(){
        return "Hello World!";
    }
}
