package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

public class Solution_SearchInABinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        @Contract(pure = true)
        TreeNode(int x) {
            val = x;
        }
    }

    @Contract("null, _ -> null")
    private static TreeNode searchBST(TreeNode root, int val) {
        TreeNode res;
        if (root == null)
            return null;
        else if (root.val == val)
            res = root;
        else if (root.val > val)
            res = searchBST(root.left, val);
        else res = searchBST(root.right, val);
        return res;
    }
}
