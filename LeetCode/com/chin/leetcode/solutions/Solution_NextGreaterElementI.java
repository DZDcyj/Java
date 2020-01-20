package com.chin.leetcode.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Solution_NextGreaterElementI {
    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>(16);
        for (int value : nums2) {
            while (!stack.empty() && value > stack.peek()) {
                map.put(stack.pop(), value);
            }
            stack.push(value);
        }
        while (!stack.empty()) {
            map.put(stack.pop(), -1);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums11 = {4, 1, 2};
        int[] nums21 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums11, nums21)));

        int[] nums12 = {2, 4};
        int[] nums22 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(nums12, nums22)));

    }
}
