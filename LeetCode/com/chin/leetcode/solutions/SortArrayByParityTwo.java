package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class SortArrayByParityTwo {
    private static final int STEP = 2;

    @Contract("_ -> param1")
    private static int[] sortArrayByParity(@NotNull int[] a) {
        int j = 1;
        for (int i = 0; i < a.length; i += STEP) {
            if (a[i] % 2 == 1) {
                while (a[j] % STEP == 1) {
                    j += 2;
                }
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] test = {4, 2, 5, 7};
        int[] test2 = {4, 1};
        System.out.println(Arrays.toString(sortArrayByParity(test)));
        System.out.println(Arrays.toString(sortArrayByParity(test2)));
    }
}
