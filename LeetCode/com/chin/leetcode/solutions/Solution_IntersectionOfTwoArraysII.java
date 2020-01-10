package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.LinkedList;

public class Solution_IntersectionOfTwoArraysII {
    @NotNull
    private static int[] intersect(@NotNull int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(16);
        for (int i = 0; i < nums1.length; i++) {
            if (hashMap.containsKey(nums1[i])) {
                hashMap.put(nums1[i], hashMap.get(nums1[i]) + 1);
            } else {
                hashMap.put(nums1[i], 1);
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
            result[i] = linkedList.poll();
        }
        return result;
    }
}
