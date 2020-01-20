package test;

import com.chin.leetcode.datastructures.*;

/**
 * @author Chin
 */
public class DataStructureTest {
    public static void main(String[] args) {
        testWordDictionary();
        // testMyCircularDeque();
        // testMyLinkedList();
        // testCodec();
        // testTwitter();
        // testRecentCounter();
        // testLRUCache();
    }

    private static void testCodec() {
        Codec codec = new Codec();
        String shortUrl = codec.encode("https://pixiv.net");
        System.out.println(shortUrl);
        System.out.println(codec.decode(shortUrl));
    }

    private static void testMyLinkedList() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(2);
        linkedList.addAtHead(3);
        linkedList.addAtTail(4);
        linkedList.addAtHead(5);
        linkedList.addAtHead(6);
        System.out.println(linkedList.get(2));
    }

    private static void testMyCircularDeque() {
        MyCircularDeque circularDeque = new MyCircularDeque(2);
        System.out.println(circularDeque.insertFront(2));
        System.out.println(circularDeque.deleteLast());
        System.out.println(circularDeque.getFront());
        System.out.println(circularDeque.insertLast(5));
        System.out.println(circularDeque.insertFront(0));
        System.out.println(circularDeque.getFront());
        System.out.println(circularDeque.getRear());
        System.out.println(circularDeque.getFront());
        System.out.println(circularDeque.getRear());
        System.out.println(circularDeque.insertLast(0));
    }

    private static void testWordDictionary() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("bat");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad"));
        // expected result false
        System.out.println(wordDictionary.search("bad"));
        // expected result true
        System.out.println(wordDictionary.search(".ad"));
        // expected result true
        System.out.println(wordDictionary.search("b.."));
        // expected result true
        System.out.println(wordDictionary.search("p.."));
        // expected result false
    }

    private static void testTwitter() {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        System.out.println(twitter.getNewsFeed(1));
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        System.out.println(twitter.getNewsFeed(1));
        twitter.unfollow(1, 2);
        System.out.println(twitter.getNewsFeed(1));
    }

    private static void testRecentCounter() {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));

        RecentCounter recentCounter1 = new RecentCounter();
        System.out.println(recentCounter.ping(642));
    }

    private static void testLRUCache() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
