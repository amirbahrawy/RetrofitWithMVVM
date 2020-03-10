package com.example.android.retrofitwithmvvm.model;

public class PostModel {
    private int userId;
    private int id;
    private String title;
    private String body;

    public PostModel() {
    }

    public PostModel(int userID, int id, String title, String body) {
        this.userId = userID;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserID() {
        return userId;
    }

    public void setUserID(int userID) {
        this.userId = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
