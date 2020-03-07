package com.chin.leetcode.sword2offer.datastructures;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */
public class MaxQueue {
    private Queue<Integer> queue;
    private Deque<Integer> max;

    public MaxQueue() {
        queue = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int maxValue() {
        if (max.isEmpty()) {
            return -1;
        }
        return max.getFirst();
    }

    public void pushBack(int value) {
        while (!max.isEmpty() && max.getLast() < value) {
            max.removeLast();
        }
        max.offerLast(value);
        queue.offer(value);
    }

    public int popFront() {
        if (queue.isEmpty()) {
            return -1;
        }
        int res = queue.peek();
        if (res == max.getFirst()) {
            max.removeFirst();
        }
        queue.remove();
        return res;
    }
}
