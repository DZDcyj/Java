package com.chin.leetcode;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */
public class TreeNode {
    private static final int ARRAY_MIN_LENGTH = 2;

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * This function transform the array format like [1,2,null,3,4] to binary tree
     * The tree structure is below:(With the given array)
     * 1
     * |
     * 2
     * / \
     * 3   4
     *
     * @param array The given array
     * @return The root node of the binary tree
     */

    @NotNull
    public static TreeNode constructFromArray(String array) {
        array = array.substring(1, array.length() - 1);
        String[] values = array.split(",");
        if (values.length <= 0) {
            return new TreeNode(-1);
        }
        TreeNode root = new TreeNode(-1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 0;
        TreeNode curr;
        while (index < values.length) {
            curr = queue.poll();
            assert curr != null;
            if (!"null".equals(values[index])) {
                curr.val = Integer.parseInt(values[index]);
                if (index * 2 + 1 < values.length) {
                    curr.left = new TreeNode(0);
                    queue.offer(curr.left);
                } else {
                    curr.left = null;
                }
                if (index * 2 + 2 < values.length) {
                    curr.right = new TreeNode(0);
                    queue.offer(curr.right);
                } else {
                    curr.right = null;
                }
            } else {
                curr.val = -1;
            }
            index++;
        }
        root.removeNegativeNodes();
        return root;
    }

    /**
     * This function is used to resolve the negative value temp nodes during constructing the binary tree
     */

    private void removeNegativeNodes() {
        TreeNode curr;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this);
        while (!queue.isEmpty()) {
            curr = queue.poll();
            if (curr.left != null) {
                if (curr.left.val <= 0) {
                    curr.left = null;
                    continue;
                } else {
                    queue.offer(curr.left);
                }
            }
            if (curr.right != null) {
                if (curr.right.val <= 0) {
                    curr.right = null;
                } else {
                    queue.offer(curr.right);
                }
            }
        }
    }

    /**
     * We transform the TreeNode to String in preOrder format
     *
     * @return The preOrder of the binary tree, using "," to split. Covered with brace like "[" and "]"
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this);
        TreeNode curr;
        boolean first = true;
        while (!queue.isEmpty()) {
            if (first) {
                first = false;
            } else {
                stringBuilder.append(",");
            }
            curr = queue.poll();
            if (curr == null) {
                stringBuilder.append("null");
                continue;
            }
            stringBuilder.append(curr.val);
            if (!(curr.left == null && curr.right == null)) {
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
        }
        stringBuilder.append("]");
        for (int i = stringBuilder.length() - ARRAY_MIN_LENGTH; i >= 0; i--) {
            if (Character.isDigit(stringBuilder.charAt(i))) {
                return stringBuilder.substring(0, i + 1) + "]";
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        TreeNode testCase = constructFromArray("[1,2,3,null,4,5,6]");
        System.out.println(testCase.toString());
    }
}
