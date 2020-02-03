package com.chin.leetcode.solutions;

import java.util.Arrays;

/**
 * @author Chin
 */
public class ConvertIntegerToTheSumOfTwoZeroIntegers {
    private static int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int j = n - i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i).append(j);
            if (!stringBuilder.toString().contains("0")) {
                return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(2)));
        System.out.println(Arrays.toString(getNoZeroIntegers(11)));
        System.out.println(Arrays.toString(getNoZeroIntegers(10000)));
        System.out.println(Arrays.toString(getNoZeroIntegers(69)));
        System.out.println(Arrays.toString(getNoZeroIntegers(1010)));
    }
}
