package com.chin.leetcode.solutions;

import java.util.Arrays;

public class Solution_DecompressRunLengthEncodedList {
    private static int[] decompressRleList(int[] nums) {
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
