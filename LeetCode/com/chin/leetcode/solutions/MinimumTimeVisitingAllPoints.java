package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class MinimumTimeVisitingAllPoints {
    private static int getTime(@NotNull int[] point1, @NotNull int[] point2) {
        int dx = Math.abs(point1[0] - point2[0]);
        int dy = Math.abs(point1[1] - point2[1]);
        return Math.min(dx, dy) + Math.abs(dx - dy);
    }

    private static int minTimeToVisitAllPoints(@NotNull int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length - 1; i++) {
            time += getTime(points[i], points[i + 1]);
        }
        return time;
    }

    public static void main(String[] args) {
        int[][] testPoints1 = {{1, 1}, {3, 4}, {-1, 0}};
        int[][] testPoints2 = {{3, 2}, {-2, 2}};

        System.out.println(minTimeToVisitAllPoints(testPoints1));
        System.out.println(minTimeToVisitAllPoints(testPoints2));
    }
}
