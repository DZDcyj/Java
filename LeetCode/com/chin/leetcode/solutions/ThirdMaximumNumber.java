package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Chin
 */
public class ThirdMaximumNumber {
    private static final int THREE = 3;
    private static final int TWO = 2;


    private static int thirdMax(@NotNull int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max;
        for (int i = 1; i <= Math.min(THREE, nums.length); i++) {
            max = Integer.MIN_VALUE;
            boolean changed = false;
            for (int num : nums) {
                if (num >= max && !set.contains(num)) {
                    max = num;
                    changed = true;
                }
            }
            if (changed) {
                set.add(max);
            }
        }
        Object[] objects = set.toArray();
        if (set.size() == THREE) {
            return (Integer) objects[0];
        }
        if (set.size() == TWO) {
            return Math.max((Integer) objects[0], (Integer) objects[1]);
        }
        return (Integer) objects[0];
    }

    public static void main(String[] args) {
        int[] test1 = {3, 2, 1};
        int[] test2 = {1, Integer.MIN_VALUE, 2};
        int[] test3 = {2, 2, 3, 1};
        System.out.println(thirdMax(test1));
        System.out.println(thirdMax(test2));
        System.out.println(thirdMax(test3));
    }
}
