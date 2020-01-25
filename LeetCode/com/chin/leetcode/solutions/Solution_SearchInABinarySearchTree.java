package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;
import org.jetbrains.annotations.Contract;

public class Solution_SearchInABinarySearchTree {


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
