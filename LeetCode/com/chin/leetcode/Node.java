package com.chin.leetcode;

import org.jetbrains.annotations.Contract;

import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    @Contract(pure = true)
    public Node() {
    }

    @Contract(pure = true)
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
