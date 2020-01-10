package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Solution_NaryTreePreorderTraversal {
    class Node {
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

    @NotNull
    private static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        for (Node node : root.children) {
            result.addAll(preorder(node));
        }
        return result;
    }
}
