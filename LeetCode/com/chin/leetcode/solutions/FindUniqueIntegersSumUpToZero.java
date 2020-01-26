package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class FindUniqueIntegersSumUpToZero {
    private static final int HALF = 2;

    @NotNull
    @Contract(pure = true)
    private static int[] sumZero(int n) {
        int[] result = new int[n];
        if ((n & 1) == 0) {
            for (int i = 0; i < n / HALF; i++) {
                result[i] = i + 1;
                result[n - i - 1] = -(i + 1);
            }
        } else {
            for (int i = 0; i < n / HALF; i++) {
                result[i] = i + 1;
                result[n - i - 1] = -(i + 1);
            }
            result[n / 2] = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(4)));
        System.out.println(Arrays.toString(sumZero(3)));
        System.out.println(Arrays.toString(sumZero(1)));
    }
}
