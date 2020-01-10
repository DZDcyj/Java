package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_BinaryTreeLevelOrderTraversalTwo {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        @Contract(pure = true)
        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * 递归解决，递是发现问题，归是解决问题
     * class com.chin.leetcode.solutions.Solution {
     * public List<List<Integer>> levelOrderBottom(TreeNode root) {
     * List<List<Integer>> res = new ArrayList<>();
     * helper(root, 0, res);
     * Collections.reverse(res);
     * return res;
     * }
     * <p>
     * public void helper(TreeNode root, int depth, List<List<Integer>> res) {
     * if (root == null)
     * return;
     * if (depth + 1 > res.size())
     * res.add(new ArrayList());
     * res.get(depth).add(root.val);
     * if (root.left != null) helper(root.left, depth + 1, res);
     * if (root.right != null) helper(root.right, depth + 1, res);
     * }
     * }
     */
    @NotNull
    private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        putIn(root, 0, result);
        Collections.reverse(result);
        return result;
    }

    private static void putIn(TreeNode root, int depth, List<List<Integer>> result) {
        if (root == null)
            return;
        if (depth + 1 > result.size())
            result.add(new ArrayList<>());
        result.get(depth).add(root.val);
        if (root.left != null)
            putIn(root.left, depth + 1, result);
        if (root.right != null)
            putIn(root.right, depth + 1, result);
    }


    public static void main(String[] args) {
        TreeNode test = new TreeNode(3);
        test.left = new TreeNode(9);
        test.right = new TreeNode(20);
        test.right.left = new TreeNode(15);
        test.right.right = new TreeNode(7);

        System.out.println(levelOrderBottom(test));
    }
}