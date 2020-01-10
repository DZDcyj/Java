package com.chin.leetcode.solutions;

public class Solution_ValidPerfectSquare {
    private static boolean isPerfectSquare(int num) {
        if (num % 10 == 2 || num % 10 == 3 || num % 10 == 7 || num % 10 == 8)
            return false;
        int left = 1;
        int right = num;
        while (left < right) {
            int mid = (left + right + 1) >> 1;
            if (mid <= num / mid) left = mid;
            else right = mid - 1;
        }
        return right * right == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
        System.out.println(isPerfectSquare(134));
    }
}
