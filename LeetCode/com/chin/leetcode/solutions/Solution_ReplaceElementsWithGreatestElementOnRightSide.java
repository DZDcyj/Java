package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Solution_ReplaceElementsWithGreatestElementOnRightSide {
    @NotNull
    @Contract(pure = true)
    private static int[] replaceElements(@NotNull int[] arr) {
        int max = -1;
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = max;
            max = Math.max(max, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
