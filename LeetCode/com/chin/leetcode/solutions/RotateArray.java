package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class RotateArray {
    /**
     * @param nums -- the array to rotate
     * @param k    -- steps
     *             This function really "rotate" the element in same list (k, 2k, 3k ...)
     *             Put the element at k to 2k, 2k to 3k, 3k to 4k, ... the the last to k
     *             Awesome algorithm!
     * @author LeetCode
     * @date 19/10/7
     */

    private static void rotate(@NotNull int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7};
        rotate(test1, 1);
        System.out.println(Arrays.toString(test1));
        int[] test2 = {-1, -100, 3, 99};
        rotate(test2, 2);
        System.out.println(Arrays.toString(test2));
    }
}
