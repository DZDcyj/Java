package com.chin.leetcode.datastructures;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chin
 */
public class Twitter {
    //TODO

    /**
     * The Tweet Class
     * Including the publishTime, and Id
     */
    private class Tweet {
        private int publishTime;
        private int Id;

        @Contract(pure = true)
        Tweet(int Id, int publishTime) {
            this.publishTime = publishTime;
            this.Id = Id;
        }
    }

    private class User {
        private int id;
        private List<Tweet> tweetList;
        private List<User> followers;

        @Contract(pure = true)
        User(int id) {
            this.id = id;
            this.tweetList = new ArrayList<>();
            this.followers = new ArrayList<>();
        }


        void follow(User follower) {
            followers.add(follower);
        }

        void unfollow(User follower) {
            followers.remove(follower);
        }
    }

    private List<User> users;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public Twitter() {
        size = 0;
        users = new ArrayList<>();
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        size++;
        Tweet newTweet = new Tweet(tweetId, size);
        User target = null;
        for (User user : users) {
            if (user.id == userId) {
                target = user;
                break;
            }
        }
        if (target == null) {
            target = new User(userId);
            users.add(target);
        }
        target.tweetList.add(newTweet);
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        User target = null;
        for (User user : users) {
            if (user.id == userId) {
                target = user;
            }
        }
        if (target == null) {
            return null;
        }
        List<Tweet> tweets = new ArrayList<>(target.tweetList);
        for (User follower : target.followers) {
            tweets.addAll(follower.tweetList);
        }
        tweets.sort((o1, o2) -> o2.publishTime - o1.publishTime);
        while (tweets.size() > 10) {
            tweets.remove(tweets.size() - 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Tweet tweet : tweets) {
            list.add(tweet.Id);
        }
        return list;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        User source = null, target = null;
        for (User user : users) {
            if (user.id == followerId) {
                source = user;
            } else if (user.id == followeeId) {
                target = user;
            }
        }
        if (source == null) {
            source = new User(followerId);
        }
        if (target == null) {
            target = new User(followeeId);
        }
        source.follow(target);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        User source = null;
        User target = null;
        for (User user : users) {
            if (user.id == followerId) {
                source = user;
            } else if (user.id == followeeId) {
                target = user;
            }
        }
        if (source == null || target == null) {
            return;
        }
        source.unfollow(target);
    }
}
