package com.codeup.blog.models;


public class ad {

    private Long id;
    private String title;
    private String description;

    public ad(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public ad(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}