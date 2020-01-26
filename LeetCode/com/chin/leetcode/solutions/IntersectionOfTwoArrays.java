package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * @author Chin
 */
public class IntersectionOfTwoArrays {
    @NotNull
    private static int[] intersection(@NotNull int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        if (nums1.length <= nums2.length) {
            for (int num : nums1) {
                set.add(num);
            }
            for (int num : nums2) {
                if (set.contains(num)) {
                    result.add(num);
                }
            }
        } else {
            for (int num : nums2) {
                set.add(num);
            }
            for (int num : nums1) {
                if (set.contains(num)) {
                    result.add(num);
                }
            }
        }
        List<Integer> list = new ArrayList<>(result);
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = list.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        System.out.println(Arrays.toString(intersection(nums3, nums4)));
    }
}
