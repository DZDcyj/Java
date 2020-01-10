package com.chin.leetcode.datastructures;

import java.util.Stack;

// structure Queue based on stack
public class MyQueue {
    private Stack<Integer> queue;
    private Stack<Integer> stack;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        queue = new Stack<>();
        stack = new Stack<>();
        size = 0;
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        while (!stack.empty())
            queue.push(stack.pop());
        queue.push(x);
        while (!queue.empty())
            stack.push(queue.pop());
        size++;
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        size--;
        return stack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}
