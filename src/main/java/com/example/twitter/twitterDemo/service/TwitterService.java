package com.example.twitter.twitterDemo.service;

import com.example.twitter.twitterDemo.model.TwitterPost;
import com.example.twitter.twitterDemo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class TwitterService {
    private static Logger logger = LoggerFactory.getLogger(TwitterService.class);

    public String postTweet(String message) throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        logger.info("Posting Tweet");
        Status status = twitter.updateStatus(message);
        return status.getText();
    }


    public List<TwitterPost> getHomeTimeLine() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        logger.info("Getting home timeline");

        List<Status> statuses = twitter.getHomeTimeline();
        List<TwitterPost> twitterPosts = new ArrayList<TwitterPost>();
        for(Status posts : statuses){
            User usr= new User(posts.getUser().getName() , posts.getUser().getScreenName() , 
                    posts.getUser().getProfileImageURL());
            TwitterPost twPost = new TwitterPost(posts.getText() , usr , posts.getCreatedAt());
            twitterPosts.add(twPost);
        }
        return twitterPosts;
    }

}
