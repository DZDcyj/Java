package com.chin.leetcode.sword2offer.questions;

import org.jetbrains.annotations.TestOnly;

import java.util.*;

/**
 * @author Chin
 */
public class Question57Two {

    /**
     * This function returns a list of list whose all elements sum to target
     *
     * @param target The target number
     * @return The list
     * <p>
     * Sample input:
     * 1. 9
     * 2. 15
     * <p>
     * Sample output:
     * 1. [[2, 3, 4], [4, 5]]
     * 2. [[1, 2, 3, 4, 5], [4, 5, 6], [7, 8]]
     */
    public int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<>();
        int i = 1;
        while (target > 0) {
            target -= i++;
            if (target > 0 && target % i == 0) {
                int[] array = new int[i];
                for (int k = target / i, j = 0; k < target / i + i; k++, j++) {
                    array[j] = k;
                }
                result.add(array);
            }
        }
        Collections.reverse(result);
        return result.toArray(new int[0][]);
    }

    @TestOnly
    public static void main(String[] args) {
        Question57Two question57Two = new Question57Two();
        System.out.println(Arrays.deepToString(question57Two.findContinuousSequence(9)));
        System.out.println(Arrays.deepToString(question57Two.findContinuousSequence(15)));
    }
}
