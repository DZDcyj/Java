package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Chin
 */
public class BinaryTreeLevelOrderTraversalTwo {

    @NotNull
    private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        putIn(root, 0, result);
        Collections.reverse(result);
        return result;
    }

    private static void putIn(TreeNode root, int depth, List<List<Integer>> result) {
        if (root == null)
            return;
        if (depth + 1 > result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(depth).add(root.val);
        if (root.left != null) {
            putIn(root.left, depth + 1, result);
        }
        if (root.right != null) {
            putIn(root.right, depth + 1, result);
        }
    }


    public static void main(String[] args) {
        TreeNode test = new TreeNode(3);
        test.left = new TreeNode(9);
        test.right = new TreeNode(20);
        test.right.left = new TreeNode(15);
        test.right.right = new TreeNode(7);

        System.out.println(levelOrderBottom(test));
    }
}
