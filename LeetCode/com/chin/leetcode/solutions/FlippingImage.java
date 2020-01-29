package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class FlippingImage {
    private static int[][] flipAndInvertImage(int[][] a) {
        flipImage(a);
        invertImage(a);
        return a;
    }

    private static void flipImage(@NotNull int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                array[i][j] = array[i][array[i].length - 1 - j] ^ array[i][j];
                array[i][array[i].length - 1 - j] = array[i][array[i].length - 1 - j] ^ array[i][j];
                array[i][j] = array[i][array[i].length - 1 - j] ^ array[i][j];
            }
        }
    }

    private static void invertImage(@NotNull int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] testCase1 = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] testCase2 = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(testCase1)));
        System.out.println(Arrays.deepToString(flipAndInvertImage(testCase2)));
    }
}
