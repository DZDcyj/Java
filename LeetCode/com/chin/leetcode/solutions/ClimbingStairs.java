package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class ClimbingStairs {
    private static final int FIRST = 1;
    private static final int SECOND = 2;

    private static int climbStairs(int n) {
        if (n == FIRST) {
            return 1;
        } else if (n == SECOND) {
            return 2;
        }
        int first, second = 2, curr = 3;
        for (int i = 3; i < n; i++) {
            first = second;
            second = curr;
            curr = second + first;
        }
        return curr;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(45));
    }
}
