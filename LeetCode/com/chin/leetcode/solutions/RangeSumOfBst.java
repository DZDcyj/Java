package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;

public class RangeSumOfBst {

    private static int rangeSumBst(TreeNode root, int l, int r) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.val >= l && root.val <= r) {
            sum += root.val;
        }
        sum += rangeSumBst(root.left, l, r);
        sum += rangeSumBst(root.right, l, r);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
    }
}
