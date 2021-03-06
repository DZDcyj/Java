package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;
import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class ValidateBinarySearchTree {

    @Contract("null -> true")
    private static boolean isValidBst(TreeNode root) {
        return helper(root, null, null);
    }

    @Contract("null, _, _ -> true")
    private static boolean helper(TreeNode node, Integer lower, Integer higher) {
        if (node == null) {
            return true;
        }
        int val = node.val;
        if (lower != null && val <= lower) {
            return false;
        }
        if (higher != null && val >= higher) {
            return false;
        }
        if (!helper(node.right, val, higher)) {
            return false;
        }
        return helper(node.left, lower, val);
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(2);
        tree1.left = new TreeNode(1);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(5);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(4);
        tree2.right.left = new TreeNode(3);
        tree1.right.right = new TreeNode(6);

        System.out.println(isValidBst(tree1));
        System.out.println(isValidBst(tree2));
    }
}
