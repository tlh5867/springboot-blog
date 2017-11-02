package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @ResponseBody
    @GetMapping("/add/{numberOne}/and/{numberTwo}")
    public Integer add(@PathVariable Integer numberOne,@PathVariable Integer numberTwo){
        return numberOne + numberTwo;
    }
    @ResponseBody
    @GetMapping("/subtract/{numberOne}/from/{numberTwo}")
    public Integer sub(@PathVariable Integer numberOne,@PathVariable Integer numberTwo){
        return numberOne - numberTwo;

    }
    @ResponseBody
    @GetMapping("/multiply/{numberOne}/and/{numberTwo}")
    public Integer times(@PathVariable Integer numberOne,@PathVariable Integer numberTwo){
        return numberOne * numberTwo;
    }
    @ResponseBody
    @GetMapping("/divide/{numberOne}/by/{numberTwo}")
    public Integer divide(@PathVariable Integer numberOne,@PathVariable Integer numberTwo){
        return numberOne / numberTwo;
    }





}
