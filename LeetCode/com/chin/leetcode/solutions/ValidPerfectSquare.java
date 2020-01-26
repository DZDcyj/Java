package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class ValidPerfectSquare {
    private static boolean isPerfectSquare(int num) {
        if (!isPossibleToBePerfectSquare(num)) {
            return false;
        }
        int left = 1;
        int right = num;
        while (left < right) {
            int mid = (left + right + 1) >> 1;
            if (mid <= num / mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return right * right == num;
    }

    private static boolean isPossibleToBePerfectSquare(int num) {
        return num % 10 != 2 && num % 10 != 3 && num % 10 != 7 && num % 10 != 8;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
        System.out.println(isPerfectSquare(134));
    }
}
