package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class Search2dMatrix {
    @Contract(pure = true)
    private static boolean searchMatrix(@NotNull int[][] matrix, int target) {
        int rowNum = matrix.length;
        if (rowNum == 0) {
            return false;
        }
        int lineNum = matrix[0].length;
        if (lineNum == 0) {
            return false;
        }

        int lo = 0, hi = rowNum * lineNum - 1;
        int pivotIndex, pivotElement;
        while (lo <= hi) {
            pivotIndex = lo + (hi - lo) / 2;
            pivotElement = matrix[pivotIndex / lineNum][pivotIndex % lineNum];
            if (target == pivotElement) {
                return true;
            } else {
                if (target < pivotElement) {
                    hi = pivotIndex - 1;
                } else {
                    lo = pivotIndex + 1;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] testCase = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println(searchMatrix(testCase, 3));
        System.out.println(searchMatrix(testCase, 13));
    }
}
