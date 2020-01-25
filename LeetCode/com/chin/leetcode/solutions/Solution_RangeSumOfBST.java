package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;

public class Solution_RangeSumOfBST {

    private static int rangeSumBst(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        sum += rangeSumBst(root.left, L, R);
        sum += rangeSumBst(root.right, L, R);
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
