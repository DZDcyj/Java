package com.chin.leetcode.solutions;

import com.chin.leetcode.Node;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chin
 */
public class Solution_NaryTreePreorderTraversal {


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
