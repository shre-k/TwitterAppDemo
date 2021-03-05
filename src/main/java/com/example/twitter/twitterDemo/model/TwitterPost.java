package com.example.twitter.twitterDemo.model;

import java.util.Date;

public class TwitterPost {
    String message;
    User user;
    Date createdAt;

    public TwitterPost() {
    }

    public TwitterPost(String message, User user, Date createdAt) {
        this.message = message;
        this.user = user;
        this.createdAt = createdAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
