package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Chin
 */
public class ContainsDuplicateTwo {
    private static boolean containsNearbyDuplicate(@NotNull int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 0, 1, 1};
        int[] test3 = {1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(test1, 3));
        System.out.println(containsNearbyDuplicate(test2, 1));
        System.out.println(containsNearbyDuplicate(test3, 2));
    }
}
