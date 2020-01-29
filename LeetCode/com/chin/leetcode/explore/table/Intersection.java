package com.chin.leetcode.explore.table;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Chin
 */
public class Intersection {
    @NotNull
    private static int[] intersection(@NotNull int[] nums1, int[] nums2) {
        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();
        for (int num : nums1) {
            setA.add(num);
        }
        for (int num : nums2) {
            setB.add(num);
        }
        Set<Integer> res = new TreeSet<>();
        for (int num : setA) {
            if (setB.contains(num)) {
                res.add(num);
            }
        }
        int[] result = new int[res.size()];
        int index = 0;
        for (int num : res) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums11 = {1, 2, 2, 1};
        int[] nums21 = {2, 2,};
        int[] nums12 = {4, 9, 5};
        int[] nums22 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums11, nums21)));
        System.out.println(Arrays.toString(intersection(nums12, nums22)));
    }
}
