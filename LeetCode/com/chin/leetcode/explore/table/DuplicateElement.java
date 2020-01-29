package com.chin.leetcode.explore.table;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Chin
 */
public class DuplicateElement {
    private static boolean containsDuplicate(@NotNull int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testCase1 = {1, 2, 3, 1};
        int[] testCase2 = {1, 2, 3, 4};
        int[] testCase3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(testCase1));
        System.out.println(containsDuplicate(testCase2));
        System.out.println(containsDuplicate(testCase3));
    }
}
