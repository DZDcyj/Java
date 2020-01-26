package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;


/**
 * @author Chin
 */
public class ConstructStringFromBinaryTree {
    @NotNull
    private static String tree2str(TreeNode t) {
        StringBuilder stringBuilder = new StringBuilder();
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            stringBuilder.append(t.val);
            return stringBuilder.toString();
        }
        if (t.right == null) {
            stringBuilder.append(t.val).append("(").append(tree2str(t.left)).append(")");
            return stringBuilder.toString();
        }
        stringBuilder.append(t.val).append("(").append(tree2str(t.left)).append(")(").append(tree2str(t.right)).append(")");
        return stringBuilder.toString();
    }


    @TestOnly
    public static void main(String[] args) {
        TreeNode testCase1 = TreeNode.constructFromArray("[1,2,3,4]");
        TreeNode testCase2 = TreeNode.constructFromArray("[1,2,null,3,4]");

        System.out.println(testCase1.toString());
        System.out.println(tree2str(testCase1));
        System.out.println(testCase2.toString());
        System.out.println(tree2str(testCase2));
    }
}
