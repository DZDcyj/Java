package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Chin
 */
public class MergeIntervals {
    @NotNull
    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int[][] result = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            if (idx == -1 || interval[0] > result[idx][1]) {
                result[++idx] = interval;
            } else {
                result[idx][1] = Math.max(result[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(result, idx + 1);
    }

    public static void main(String[] args) {
        int[][] interval1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] interval2 = {{1, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(interval1)));
        System.out.println(Arrays.deepToString(merge(interval2)));
    }
}
