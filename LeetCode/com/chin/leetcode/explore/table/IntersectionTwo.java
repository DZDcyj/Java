package com.chin.leetcode.explore.table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Chin
 */
public class IntersectionTwo {
    private static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(16);
        for (int item : nums1) {
            if (hashMap.containsKey(item)) {
                hashMap.put(item, hashMap.get(item) + 1);
            } else {
                hashMap.put(item, 1);
            }
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int value : nums2) {
            if (hashMap.containsKey(value) && hashMap.get(value) > 0) {
                linkedList.add(value);
                hashMap.put(value, hashMap.get(value) - 1);
            }
        }
        int count = linkedList.size();
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            assert !linkedList.isEmpty();
            result[i] = linkedList.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums11 = {1, 2, 2, 1};
        int[] nums21 = {2, 2};
        int[] nums12 = {4, 9, 5};
        int[] nums22 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums11, nums21)));
        System.out.println(Arrays.toString(intersect(nums12, nums22)));
    }
}
