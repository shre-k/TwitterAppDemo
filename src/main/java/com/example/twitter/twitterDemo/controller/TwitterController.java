package com.example.twitter.twitterDemo.controller;

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

    @PostMapping("/tweet")
    public String postTweet(@RequestParam(name = "message") String message) throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = twitter.updateStatus(message);
        return status.getText();
    }

    @GetMapping("/timeLine")
    public static List<String> getHomeTimeLine() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        return statuses.stream().map(
                item -> item.getText()).collect(
                Collectors.toList());
    }
}