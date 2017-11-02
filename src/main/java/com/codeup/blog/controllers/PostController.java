package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//must add controller always DON'T FORGET LEON!!!!!
@Controller
public class PostController {

    @ResponseBody
    @GetMapping("/posts")
    public String indexPage(){
        return "<h1>Post Index Page</h1>";
    }

    @ResponseBody
    @GetMapping("/posts{id}")
    public String showPost(@PathVariable int id){
        return "<h1>View an individual post</h1>"+ id;
    }

    @ResponseBody
    @GetMapping("/posts/create")
    public String showCreateForm(){
        return "<h1>View the form for creating posts</h1>";
    }

    @ResponseBody
   @PostMapping("/posts/create")
    public String createPost(){
        return "Create new post";
    }


}
