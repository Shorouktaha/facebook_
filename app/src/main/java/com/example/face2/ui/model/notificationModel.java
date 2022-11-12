package com.example.face2.ui.model;

public class notificationModel {
    private int use_img;
    private String user_name ,notif_text;

    public notificationModel(int use_img,String user_name,String notif_text) {
        this.use_img = use_img;
        this.notif_text=notif_text;
        this.user_name=user_name;
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

    public String getNotif_text() {
        return notif_text;
    }

    public void setNotif_text(String notif_text) {
        this.notif_text = notif_text;
    }
}
