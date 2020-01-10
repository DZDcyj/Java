package com.chin.leetcode.solutions;

import java.util.Arrays;

public class Solution_MergeIntervals {
    private static int[][] merge(int[][] intervals) {
        // TODO:finish the function
        return intervals;
    }

    public static void main(String[] args) {
        int[][] interval1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] interval2 = {{1, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(interval1)));
        System.out.println(Arrays.deepToString(merge(interval2)));
    }
}
