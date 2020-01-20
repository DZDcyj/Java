package com.chin.leetcode.solutions;

public class Solution_SmallestRangeI {
    private static int smallestRange(int[] A, int K) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : A) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int res = max - min - 2 * K;
        return Math.max(res, 0);
    }

    public static void main(String[] args) {
        int[] A1 = {1};
        int[] A2 = {0, 10};
        int[] A3 = {1, 3, 6};
        System.out.println(smallestRange(A1, 0));
        System.out.println(smallestRange(A2, 2));
        System.out.println(smallestRange(A3, 3));
    }
}
