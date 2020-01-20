package com.chin.leetcode.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_SortArrayByParityII {
    private static int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2) {
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1) {
                    j += 2;
                }
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] test = {4, 2, 5, 7};
        int[] test2 = {4, 1};
        System.out.println(Arrays.toString(sortArrayByParityII(test)));
        System.out.println(Arrays.toString(sortArrayByParityII(test2)));
    }
}
