package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Chin
 */
public class BinaryTreeLevelOrderTraversal {
    @NotNull
    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            result.add(new ArrayList<>());
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode curr = queue.poll();
                assert curr != null;
                result.get(level).add(curr.val);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            level++;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode testCase = TreeNode.constructFromArray("[3,9,20,null,null,15,7]");
        System.out.println(levelOrder(testCase));
    }
}
