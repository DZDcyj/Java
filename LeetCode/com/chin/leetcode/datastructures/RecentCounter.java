package com.chin.leetcode.datastructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */
public class RecentCounter {
    private final static int BOTTOM = 3000;
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (t - BOTTOM > queue.element()) {
            queue.remove();
        }
        return queue.size();
    }
}
