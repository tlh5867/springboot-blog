package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.services.PostSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //Step 1 Annotate
public class PostController {

    private final PostSvc postSvc;

    @Autowired
    public PostController(PostSvc postSvc){
        this.postSvc = postSvc;
    }

    @GetMapping("/posts") //Step 2 what url want to respond to
    public String showAll(Model vModel) {
//        ArrayList<Post> posts = new ArrayList<>();
//
//        posts.add(new Post("Title One", "Body goes here"));
//        posts.add(new Post("Title 2", "Body goes here"));
//        posts.add(new Post("Title 3", "Body goes here"));
//        List<Post> posts = postSvc.findAll();
        vModel.addAttribute("posts", postSvc.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable int id, Model vModel) {
        vModel.addAttribute("Post", postSvc.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String ViewCreateForm(Model vModel) {
        vModel.addAttribute("Post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String CreatePost(@ModelAttribute Post post) {
        postSvc.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute int id, Model vModel) {
        vModel.addAttribute("Post", postSvc.findOne(id));
        return "posts/edit";
    }
}
