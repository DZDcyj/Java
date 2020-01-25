package com.chin.leetcode.solutions;

public class Solution_BinaryNumberWithAlternatingBits {
    private static boolean hasAlternatingBits(int n) {
        n = (n ^ (n >> 1));
        return (n & ((long) n + 1)) == 0;
    }

    public static void main(String[] args) {
        int[] testCases = {5, 7, 11, 10};
        for (int testCase : testCases) {
            System.out.println(hasAlternatingBits(testCase));
        }
    }
}
