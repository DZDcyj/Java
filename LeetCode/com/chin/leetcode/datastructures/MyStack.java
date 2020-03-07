package com.chin.leetcode.datastructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */

/**
 * Structure Stack Based on Queue
 * @author Chin
 */
public class MyStack {
    private Queue<Integer> storage;
    private Queue<Integer> queue;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        storage = new LinkedList<>();
        queue = new LinkedList<>();
        size = 0;
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        size++;
        queue.offer(x);
        while (queue.size() > 1) {
            storage.offer(queue.poll());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int result = queue.poll();
        while (!storage.isEmpty()) {
            queue.offer(storage.poll());
        }
        while (queue.size() > 1) {
            storage.offer(queue.poll());
        }
        size--;
        return result;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return size == 0;
    }

}
