package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class RepeatedElementInDoubleSizeArray {
    private static final int POSSIBLE_MAX_DISTANCE = 3;

    private static int repeatedTimes(int[] a) {
        for (int k = 1; k <= POSSIBLE_MAX_DISTANCE; ++k) {
            for (int i = 0; i < a.length - k; ++i) {
                if (a[i] == a[i + k]) {
                    return a[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 3};
        int[] input2 = {2, 1, 2, 5, 3, 2};
        int[] input3 = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(repeatedTimes(input1));
        System.out.println(repeatedTimes(input2));
        System.out.println(repeatedTimes(input3));
    }
}
