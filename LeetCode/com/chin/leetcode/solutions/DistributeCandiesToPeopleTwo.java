package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

import java.util.Arrays;

/**
 * @author Chin
 */
public class DistributeCandiesToPeopleTwo {
    @NotNull
    @Contract(pure = true)
    private static int[] distributeCandies(int candies, int numPeople) {
        int[] result = new int[numPeople];
        int curr = 1;
        int index = 0;
        while (candies > 0) {
            result[index] += Math.min(curr, candies);
            candies -= curr;
            curr++;
            index++;
            if (index == numPeople) {
                index = 0;
            }
        }
        return result;
    }

    @TestOnly
    public static void main(String[] args) {
        System.out.println(Arrays.toString(distributeCandies(7, 4)));
        System.out.println(Arrays.toString(distributeCandies(10, 3)));
    }
}
