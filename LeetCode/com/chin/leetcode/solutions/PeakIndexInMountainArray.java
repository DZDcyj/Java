package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class PeakIndexInMountainArray {
    @Contract(pure = true)
    private static int peakIndexInMountainArray(@NotNull int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test1 = {0, 1, 0};
        int[] test2 = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(test1));
        System.out.println(peakIndexInMountainArray(test2));
    }
}
