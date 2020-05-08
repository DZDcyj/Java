package com.chin.leetcode.solutions;

import com.chin.leetcode.TreeNode;

/**
 * @author Chin
 */
public class SubtreeOfAnotherTree {
    private static boolean isSameTree(TreeNode p, TreeNode q) {
        return (p == q) || (p != null && q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }

    private static boolean isSubtree(TreeNode s, TreeNode t) {

        if (s == null) {
            return false;
        } else if (s.val == t.val && isSameTree(s, t)) {
            return true;
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }


    public static void main(String[] args) {
        TreeNode t11 = TreeNode.constructFromArray("[3,4,5,1,2]");
        TreeNode t12 = TreeNode.constructFromArray("[4,1,2]");
        System.out.println(isSubtree(t11, t12));
    }
}
