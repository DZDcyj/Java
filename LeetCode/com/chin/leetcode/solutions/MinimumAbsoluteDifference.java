package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Chin
 */
public class MinimumAbsoluteDifference {
    @NotNull
    private static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int minDif = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            minDif = Math.min(Math.abs(arr[i] - arr[i + 1]), minDif);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) == minDif) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 1, 3};
        int[] arr2 = {1, 3, 6, 10, 15};
        int[] arr3 = {3, 8, -10, 23, 19, -4, -14, 27};
        System.out.println(minimumAbsDifference(arr1));
        System.out.println(minimumAbsDifference(arr2));
        System.out.println(minimumAbsDifference(arr3));
    }
}
