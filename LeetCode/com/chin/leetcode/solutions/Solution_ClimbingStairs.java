package com.chin.leetcode.solutions;

public class Solution_ClimbingStairs {
    private static int climbStairs(int n) {
        /*
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
        recursion function*/
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        int first = 1, second = 2, curr = 3;
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
