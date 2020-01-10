package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Solution_ConstructTheRectangle {
    @NotNull
    @Contract(pure = true)
    private static int[] constructRectangle(int area) {
        int[] result = new int[2];
        int length = area, width = 1;
        while (width <= length) {
            if (width * length == area) {
                result[0] = length;
                result[1] = width;
            }
            width++;
            length = area / width;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(4)));
        System.out.println(Arrays.toString(constructRectangle(6)));
        System.out.println(Arrays.toString(constructRectangle(17)));
    }
}
