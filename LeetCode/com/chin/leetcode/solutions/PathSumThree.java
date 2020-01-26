package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;

/**
 * @author Chin
 */
public class PathSumThree {

    private static int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return paths(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private static int paths(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        if (root.val == sum) {
            result += 1;
        }
        result += paths(root.left, sum - root.val);
        result += paths(root.right, sum - root.val);
        return result;
    }
}
