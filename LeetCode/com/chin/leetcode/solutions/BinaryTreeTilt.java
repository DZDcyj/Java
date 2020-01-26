package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */
public class BinaryTreeTilt {
    private static int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
            sum += getNodeTilt(curr);
        }
        return sum;
    }

    private static int getNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = root.val;
        sum += getNodes(root.left);
        sum += getNodes(root.right);
        return sum;
    }

    private static int getNodeTilt(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int sum = 0;
        int left = getNodes(node.left);
        int right = getNodes(node.right);
        sum += Math.abs(left - right);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println(findTilt(root));
    }
}