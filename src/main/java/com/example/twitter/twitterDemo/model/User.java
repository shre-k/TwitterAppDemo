package com.example.twitter.twitterDemo.model;


public class User {
        String user_name;
        String twitter_handle;
        String  profileImageUrl;

    public User() {
    }

    public User(String user_name, String twitter_handle, String profileImageUrl) {
        this.user_name = user_name;
        this.twitter_handle = twitter_handle;
        this.profileImageUrl = profileImageUrl;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getTwitter_handle() {
        return twitter_handle;
    }

    public void setTwitter_handle(String twitter_handle) {
        this.twitter_handle = twitter_handle;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

}
