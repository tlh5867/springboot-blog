package com.codeup.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
//Must have response body to show in the html
//@ResponseBody- variables that are part of the URI of a request, as opposed to being passed as a query string
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!!";
    }

    @ResponseBody
    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return "hello, " + name + "!!";
    }

    @ResponseBody
    @GetMapping("/hello/{firstName}/{lastName}")
    public String helloFullName(@PathVariable String firstName, @PathVariable String lastName){
        return "<h1>Hello, " + firstName + " " + lastName + "!!</h1>";

    }

    @ResponseBody
    @GetMapping("/square/{number}")
    public Integer square(@PathVariable Integer number){
        return number * number;
    }



}



