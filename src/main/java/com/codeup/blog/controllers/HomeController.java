package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
//1. ADD CONTROLLER ANNOTATION
@Controller
public class HomeController {
    //3. ADD THE RESPONSE ANNOTATION
    @ResponseBody
    //4. BIND THIS METHOD TO A URL PATTERN
    @GetMapping("/")
    //CREATE A REGULAR METHOD
    public String index(){
        return"<h1>This is the landing page!!</h1>";

    }



}
