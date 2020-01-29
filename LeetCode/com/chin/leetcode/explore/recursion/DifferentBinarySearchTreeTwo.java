package com.chin.leetcode.explore.recursion;

import com.chin.leetcode.TreeNode;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Chin
 */
public class DifferentBinarySearchTreeTwo {
    @NotNull
    private static List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<>();
        }
        return generate(1, n);
    }

    @NotNull
    private static LinkedList<TreeNode> generate(int start, int end) {
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        if (start > end) {
            treeNodes.add(null);
            return treeNodes;
        }
        for (int i = start; i <= end; i++) {
            LinkedList<TreeNode> left = generate(start, i - 1);
            LinkedList<TreeNode> right = generate(i + 1, end);

            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode curr = new TreeNode(i);
                    curr.left = l;
                    curr.right = r;
                    treeNodes.add(curr);
                }
            }
        }
        return treeNodes;
    }

    public static void main(String[] args) {
        System.out.println(generateTrees(3));
    }
}
