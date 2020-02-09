package com.chin.leetcode.datastructures;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Chin
 */
public class AllOne {
    private Deque<String> keyFreq;
    private Stack<String> helper;
    private HashMap<String, Integer> hashMap;

    /**
     * Initialize your data structure here.
     */
    public AllOne() {
        hashMap = new HashMap<>(16);
        keyFreq = new LinkedList<>();
        helper = new Stack<>();
    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key) {
        if (hashMap.containsKey(key)) {
            hashMap.put(key, hashMap.get(key) + 1);
        } else {
            hashMap.put(key, 1);
        }
        if (!keyFreq.isEmpty()) {
            int freq = hashMap.get(key) - 1;
            while (!keyFreq.isEmpty() && freq <= hashMap.get(keyFreq.peekFirst())) {
                String currKey = keyFreq.pollFirst();
                assert currKey != null;
                if (!currKey.equals(key)) {
                    helper.push(currKey);
                }
            }
        }
        int freq = hashMap.get(key);
        while (!helper.isEmpty() && hashMap.get(helper.peek()) == freq - 1) {
            keyFreq.offerFirst(helper.pop());
        }
        keyFreq.offerFirst(key);
        while (!helper.isEmpty()) {
            keyFreq.offerFirst(helper.pop());
        }
    }

    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key) {
        if (hashMap.containsKey(key)) {
            if (hashMap.get(key) == 1) {
                hashMap.remove(key);
                keyFreq.remove(key);
                return;
            } else {
                hashMap.put(key, hashMap.get(key) - 1);
            }
        } else {
            return;
        }
        if (!keyFreq.isEmpty()) {
            int freq = hashMap.get(key) + 1;
            while (!keyFreq.isEmpty() && freq >= hashMap.get(keyFreq.peekLast())) {
                String curr = keyFreq.pollLast();
                assert curr != null;
                if (!curr.equals(key)) {
                    helper.push(curr);
                }
            }
        }
        int freq = hashMap.get(key);
        while (!helper.isEmpty() && hashMap.get(helper.peek()) == freq + 1) {
            keyFreq.offerLast(helper.pop());
        }
        keyFreq.offerLast(key);
        while (!helper.isEmpty()) {
            keyFreq.offerLast(helper.pop());
        }
    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey() {
        if (keyFreq.isEmpty()) {
            return "";
        } else {
            return keyFreq.peekFirst();
        }
    }

    /**
     * Returns one of the keys with Minimal value.
     */
    public String getMinKey() {
        if (keyFreq.isEmpty()) {
            return "";
        } else {
            return keyFreq.peekLast();
        }
    }
}
