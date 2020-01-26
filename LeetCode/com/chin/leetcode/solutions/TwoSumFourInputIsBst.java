package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chin
 */
public class TwoSumFourInputIsBst {

    private static boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    private static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode testCase = new TreeNode(2);
        testCase.left = new TreeNode(1);
        testCase.right = new TreeNode(3);

        System.out.println(findTarget(testCase, 1));
        System.out.println(findTarget(testCase, 2));
    }
}
