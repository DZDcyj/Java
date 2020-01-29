package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chin
 */
public class TwoSum {
    @NotNull
    @Contract(pure = true)
    public static int[] twoSum(@NotNull int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int currTarget = target - nums[i];
            if (map.containsKey(currTarget)) {
                return new int[]{map.get(currTarget), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
