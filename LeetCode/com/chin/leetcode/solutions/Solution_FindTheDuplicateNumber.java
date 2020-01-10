package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution_FindTheDuplicateNumber {
    @Contract(pure = true)
    private static int findDuplicate(@NotNull int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 3, 4, 2, 2};
        int[] test2 = {3, 1, 3, 4, 2};
        int[] test3 = {2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        System.out.println(findDuplicate(test1));
        System.out.println(findDuplicate(test2));
        System.out.println(findDuplicate(test3));
    }
}
