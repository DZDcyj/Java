package com.chin.leetcode.sword2offer.questions;

import com.chin.leetcode.TreeNode;
import org.jetbrains.annotations.TestOnly;

import java.util.Stack;

/**
 * @author Chin
 */
public class Question7 {

    /**
     * This function build a binary tree from preOrder and inOrder
     *
     * @param preorder The preOrder of the tree
     * @param inorder  The inOrder of the tree
     * @return The binary tree
     * <p>
     * Sample input:
     * preOrder = [3, 9, 20, 15, 7]
     * inOrder = [9, 3, 15, 20, 7]
     * Sample output:
     * [3, 9, 20, null, null, 15, 7]
     * *            3
     * *         /    \
     * *        9     20
     * *            /    \
     * *           15    7
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int length = preorder.length;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int inorderIndex = 0;
        for (int i = 1; i < length; i++) {
            int preorderVal = preorder[i];
            TreeNode node = stack.peek();
            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }
        return root;
    }

    @TestOnly
    public static void main(String[] args) {
        int[] pre = {3, 9, 20, 15, 7};
        int[] in = {9, 3, 15, 20, 7};
        Question7 question7 = new Question7();
        TreeNode root = question7.buildTree(pre, in);
        System.out.println(root);
        System.out.println(TreeNode.toString(root));
    }
}
