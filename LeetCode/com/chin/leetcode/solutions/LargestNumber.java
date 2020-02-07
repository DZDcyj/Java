package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Chin
 */
public class LargestNumber {
    @NotNull
    private static String largestNumber(@NotNull int[] nums) {
        StringBuilder result = new StringBuilder();
        String[] strings = new String[nums.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        if ("0".equals(strings[0])) {
            return "0";
        }
        for (String string : strings) {
            result.append(string);
        }
        return result.toString();
    }


    public static void main(String[] args) {
        int[] test1 = {10, 2};
        int[] test2 = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(test1));
        System.out.println(largestNumber(test2));
    }
}
