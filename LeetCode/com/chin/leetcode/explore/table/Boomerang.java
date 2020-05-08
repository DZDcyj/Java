package com.chin.leetcode.explore.table;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chin
 */
public class Boomerang {
    private static int getDistance(int @NotNull [] points1, int @NotNull [] points2) {
        return (points1[0] - points2[0]) * (points1[0] - points2[0]) + (points1[1] - points2[1]) * (points1[1] - points2[1]);
    }

    private static int numberOfBoomerangs(int[] @NotNull [] points) {
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    int distance = getDistance(points[i], points[j]);
                    map.put(distance, map.getOrDefault(distance, 0) + 1);
                }
            }
            for (int dis : map.keySet()) {
                result += map.get(dis) * (map.get(dis) - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{0, 0}, {1, 0}, {2, 0}};
        System.out.println(numberOfBoomerangs(points));
    }
}
