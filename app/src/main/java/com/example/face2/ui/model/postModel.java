package com.example.face2.ui.model;

public class postModel {
    public String username;
    String post;
    public int use_img,post_img;
    public postModel(String username,String post,int use_img,int post_img){
        this.username=username;
        this.post=post;
        this.use_img=use_img;
        this.post_img=post_img;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getUse_img() {
        return use_img;
    }

    public void setUse_img(int use_img) {
        this.use_img = use_img;
    }

    public int getPost_img() {
        return post_img;
    }

    public void setPost_img(int post_img) {
        this.post_img = post_img;
    }
}
