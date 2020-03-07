package com.chin.leetcode.sword2offer.questions;

import org.jetbrains.annotations.TestOnly;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Chin
 */
public class Question17 {
    /**
     * This function returns a list with numbers whose length isn't bigger than the given length
     *
     * @param n The max length
     * @return A list with number shorter than n
     * <p>
     * Sample input:
     * 1
     * <p>
     * Sample output:
     * [1, 2, 3, 4, 5, 6, 7, 8, 9]
     */
    public int[] printNumbers(int n) {
        int max = 1;
        for (int i = 0; i < n; i++) {
            max *= 10;
        }
        int[] result = new int[max - 1];
        for (int i = 0; i < max - 1; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    @TestOnly
    public static void main(String[] args) {
        Question17 question17 = new Question17();
        System.out.println(Arrays.toString(question17.printNumbers(3)));
    }
}
