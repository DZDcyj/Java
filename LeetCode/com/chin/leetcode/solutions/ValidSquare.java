package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class ValidSquare {
    @Contract(pure = true)
    private static double dist(@NotNull int[] p1, @NotNull int[] p2) {
        return (p2[1] - p1[1]) * (p2[1] - p1[1]) + (p2[0] - p1[0]) * (p2[0] - p1[0]);
    }

    private static boolean check(int[] p1, int[] p2, int[] p3, int[] p4) {
        return dist(p1, p2) > 0 && dist(p1, p2) == dist(p2, p3) && dist(p2, p3) == dist(p3, p4) && dist(p3, p4) == dist(p4, p1) && dist(p1, p3) == dist(p2, p4);
    }

    private static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return check(p1, p2, p3, p4) || check(p1, p3, p2, p4) || check(p1, p2, p4, p3);
    }


    public static void main(String[] args) {
        int[] p1 = {0, 1};
        int[] p2 = {1, 0};
        int[] p3 = {0, 0};
        int[] p4 = {1, 1};
        System.out.println(validSquare(p1, p2, p3, p4));
    }
}
