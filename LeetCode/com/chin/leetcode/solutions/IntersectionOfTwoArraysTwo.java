package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Chin
 */
public class IntersectionOfTwoArraysTwo {
    @NotNull
    private static int[] intersect(@NotNull int[] nums1, int[] nums2) {
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
}
