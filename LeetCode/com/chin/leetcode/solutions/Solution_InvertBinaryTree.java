package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;

/**
 * @author Chin
 */
public class Solution_InvertBinaryTree {
    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            root.left = invertTree(root.left);
        }
        if (root.right != null) {
            root.right = invertTree(root.right);
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
