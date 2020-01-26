package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;
import org.jetbrains.annotations.Contract;

/**
 * @author Chin
 */
public class SearchInBinarySearchTree {


    @Contract("null, _ -> null")
    private static TreeNode searchBst(TreeNode root, int val) {
        TreeNode res;
        if (root == null) {
            return null;
        } else if (root.val == val) {
            res = root;
        } else if (root.val > val) {
            res = searchBst(root.left, val);
        } else {
            res = searchBst(root.right, val);
        }
        return res;
    }
}
