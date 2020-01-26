package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class SmallestRangeOne {
    private static int smallestRange(@NotNull int[] a, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : a) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int res = max - min - 2 * k;
        return Math.max(res, 0);
    }

    public static void main(String[] args) {
        int[] a1 = {1};
        int[] a2 = {0, 10};
        int[] a3 = {1, 3, 6};
        System.out.println(smallestRange(a1, 0));
        System.out.println(smallestRange(a2, 2));
        System.out.println(smallestRange(a3, 3));
    }
}
