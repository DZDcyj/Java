package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class SumOfLeftLeaves {

    private static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null) {
            if (isLeaf(root.left)) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }
        if (root.right != null && !isLeaf(root.right)) {
            sum += sumOfLeftLeaves(root.right);
        }
        return sum;
    }

    @Contract(pure = true)
    private static boolean isLeaf(@NotNull TreeNode node) {
        return node.left == null && node.right == null;
    }
}
