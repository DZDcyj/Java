package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class DecompressRunLengthEncodedList {
    @NotNull
    @Contract(pure = true)
    private static int[] decompressRleList(@NotNull int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        int[] result = new int[size];
        int index = 0;
        int resultIndex = 0;
        while (index < nums.length) {
            int times = nums[index];
            int elem = nums[index + 1];
            for (int i = 0; i < times; i++) {
                result[resultIndex++] = elem;
            }
            index += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(decompressRleList(nums)));
    }
}
