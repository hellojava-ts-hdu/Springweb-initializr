package com.yiyue.lesson.springinitialierdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWordcontroller {

    @GetMapping("/hello")
    public String helloword(){
        return "hell spring Initi boot!";
    }
}
