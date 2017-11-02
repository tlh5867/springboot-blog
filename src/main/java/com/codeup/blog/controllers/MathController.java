package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MathController {

    @GetMapping("/add")
    public Integer add(@PathVariable Integer number){
        return number + number;
    }

    @GetMapping("subtract")
    public Integer sub(@PathVariable Integer number){
        return number - number;
    }
}
