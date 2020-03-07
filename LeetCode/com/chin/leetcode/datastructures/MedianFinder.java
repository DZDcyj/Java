package com.chin.leetcode.datastructures;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author Chin
 */
public class MedianFinder {
    /**
     * initialize your data structure here.
     */

    private PriorityQueue<Integer> bigger = new PriorityQueue<>();
    private PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int num) {
        if (bigger.size() == 0) {
            bigger.offer(num);
            return;
        }
        if (smaller.size() == 0) {
            if (num < bigger.peek()) {
                smaller.offer(num);
            } else {
                bigger.offer(num);
                smaller.offer(bigger.poll());
            }
            return;
        }
        if (bigger.size() <= smaller.size()) {
            if (num > smaller.peek()) {
                bigger.offer(num);
            } else {
                smaller.offer(num);
                bigger.offer(smaller.poll());
            }
        } else {
            if (num < bigger.peek()) {
                smaller.offer(num);
            } else {
                bigger.offer(num);
                smaller.offer(bigger.poll());
            }
        }
    }

    public double findMedian() {
        if (bigger.size() == smaller.size()) {
            return (bigger.peek() + smaller.peek()) / 2.0;
        }
        return bigger.peek();
    }
}
