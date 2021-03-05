package com.example.twitter.twitterDemo.controller;

import com.example.twitter.twitterDemo.model.TwitterPost;
import com.example.twitter.twitterDemo.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/twitterApi")
public class TwitterController {

    @Autowired
    TwitterService twitterService;


    @PostMapping("/tweet")
    public String postTweet(@RequestParam(name = "message") String message) throws TwitterException {
        return twitterService.postTweet(message);
    }


    @GetMapping("/timeLine")
    public List<TwitterPost> getHomeTimeLine() throws TwitterException {
        return twitterService.getHomeTimeLine();
    }
}