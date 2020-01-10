package com.chin.leetcode.datastructures;

import org.jetbrains.annotations.Contract;

public class MinStack {
    private int min;
    private Node top;

    private class Node {
        int val;
        Node next;

        @Contract(pure = true)
        Node(int x) {
            val = x;
            next = null;
        }
    }

    @Contract(pure = true)
    public MinStack() {
        top = null;
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x < min)
            min = x;
        Node node = new Node(x);
        if (top != null)
            node.next = top;
        top = node;
    }

    public void pop() {
        if (top.val == min) {
            top = top.next;
            Node node = top;
            int tempmin = Integer.MAX_VALUE;
            while (node != null) {
                if (node.val < tempmin)
                    tempmin = node.val;
                node = node.next;
            }
            min = tempmin;
        } else
            top = top.next;
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return min;
    }

}
