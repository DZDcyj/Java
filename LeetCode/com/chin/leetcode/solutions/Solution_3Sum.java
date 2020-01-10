package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_3Sum {
    /**
     * @author 灵魂画师牧码
     * @date 2019/10/9
     *
     * How does this function work?
     * First, we sort the array, making it starts from small to big
     * Then we start from first element to last element, every time we use two pointers
     * Making them from two sides to center, and check whether the sum is zero
     * If the first element is bigger than 0, we can stop the cycle, because the sum will be always bigger than 0
     * */
    @NotNull
    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return result;
        Arrays.sort(nums);          // Here we sort the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break; // If the number bigger than 0, as we sorted the array, the sum must be bigger than 0
            if (i > 0 && nums[i] == nums[i - 1]) continue;   // cross the same number
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {            // Use two pointers
                int sum = nums[i] + nums[lo] + nums[hi];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi - 1]) hi--;   // These 2 steps to skip same element
                    lo++;
                    hi--;
                } else if (sum < 0)
                    lo++;
                else hi--;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] test1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(test1));
    }
}
