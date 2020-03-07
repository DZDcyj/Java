package com.chin.leetcode.sword2offer.datastructures;

import java.util.Stack;

/**
 * @author Chin
 */
public class CQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int val) {
        inStack.push(val);
    }

    public int deleteHead() {
        if (inStack.isEmpty() && outStack.isEmpty()) {
            return -1;
        }
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}
