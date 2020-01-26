package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * @author Chin
 */
public class FindAllNumbersDisappearedInArray {

    @NotNull
    private static List<Integer> findDisappearedNumbers(@NotNull int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == i + 1 || nums[i] == nums[nums[i] - 1]) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] test1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(test1));
    }
}
