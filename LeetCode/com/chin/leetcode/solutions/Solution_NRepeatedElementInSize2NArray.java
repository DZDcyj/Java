package com.chin.leetcode.solutions;

public class Solution_NRepeatedElementInSize2NArray {
    private static int repeatedNTimes(int[] A) {
        for (int k = 1; k <= 3; ++k) {
            for (int i = 0; i < A.length - k; ++i) {
                if (A[i] == A[i + k]) {
                    return A[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 3};
        int[] input2 = {2, 1, 2, 5, 3, 2};
        int[] input3 = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(repeatedNTimes(input1));
        System.out.println(repeatedNTimes(input2));
        System.out.println(repeatedNTimes(input3));
    }
}
