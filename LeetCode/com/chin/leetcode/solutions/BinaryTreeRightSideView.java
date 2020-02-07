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
public class BinaryTreeRightSideView {
    @NotNull
    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode curr;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                curr = queue.poll();
                assert curr != null;
                if (i == size - 1) {
                    result.add(curr.val);
                }
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.constructFromArray("[1,2,3,null,5,null,4]");
        System.out.println(rightSideView(root));

        TreeNode error1 = TreeNode.constructFromArray("[1,2,3,4]");
        System.out.println(rightSideView(error1));
    }
}
