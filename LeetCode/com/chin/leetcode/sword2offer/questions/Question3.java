package com.chin.leetcode.sword2offer.questions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class Question3 {
    /**
     * This function returns a repeated number in the given array
     *
     * @param nums Given an array whose length is n, some numbers are repeated
     * @return A repeated number
     * Sample input:
     * [2, 3, 1, 0, 2, 5, 3]
     * <p>
     * Sample output:
     * 2 or 3
     */
    public int findRepeatNumber(@NotNull int[] nums) {
        int[] sto = new int[nums.length];
        for (int num : nums) {
            if (sto[num] == 0) {
                sto[num]++;
            } else {
                return num;
            }
        }
        return -1;
    }

    @TestOnly
    public static void main(String[] args) {
        Question3 question3 = new Question3();
        int[] testCase = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(question3.findRepeatNumber(testCase));
    }
}
