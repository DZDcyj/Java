package com.chin.leetcode.datastructures;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**
 * @author Chin
 */
public class ShuffleArray {
    private int[] nums;
    private int[] origin;
    private Random random;

    private int rangeFrom(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    private void swapAt(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public ShuffleArray(@NotNull int[] nums) {
        this.nums = nums;
        this.origin = nums.clone();
        random = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        nums = origin;
        origin = origin.clone();
        return this.origin;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        for (int i = 0; i < nums.length; i++) {
            swapAt(i, rangeFrom(i, nums.length));
        }
        return nums;
    }
}
