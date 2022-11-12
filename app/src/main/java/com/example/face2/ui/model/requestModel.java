package com.example.face2.ui.model;

public class requestModel {
    private int use_img;
    private String user_name;
    public requestModel(String username, int use_img){
        this.user_name=username;
        this.use_img=use_img;
    }

    public int getUse_img() {
        return use_img;
    }

    public void setUse_img(int use_img) {
        this.use_img = use_img;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
