package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;

import static com.chin.leetcode.solutions.SameTree.isSameTree;

/**
 * @author Chin
 */
public class SymmetricTree {

    private static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return isSameTree(root.left, root.right);
    }


    public static void main(String[] args) {
        TreeNode test1 = new TreeNode(1);
        test1.left = new TreeNode(2);
        test1.left.left = new TreeNode(3);
        test1.left.right = new TreeNode(4);
        test1.right = new TreeNode(2);
        test1.right.left = new TreeNode(4);
        test1.right.right = new TreeNode(3);

        TreeNode test2 = new TreeNode(1);
        test2.left = new TreeNode(2);
        test2.left.right = new TreeNode(3);
        test2.right = new TreeNode(2);
        test2.right.right = new TreeNode(3);

        System.out.println(isSymmetric(test1));
        System.out.println(isSymmetric(test2));
    }
}
