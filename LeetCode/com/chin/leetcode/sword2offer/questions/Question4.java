package com.chin.leetcode.sword2offer.questions;

import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class Question4 {
    /**
     * This function returns true if the target exists in the matrix
     *
     * @param matrix The given data matrix
     * @param target The target need to search
     * @return If the target in the matrix
     * <p>
     * Sample input:
     * <p>
     * matrix:
     * [1, 4, 7, 11, 15],
     * [2, 5, 8, 12, 19],
     * [3, 6,  9, 16, 22],
     * [10, 13, 14, 17, 24],
     * [18, 21, 23, 26, 30]
     * <p>
     * target:
     * 5
     * 20
     * <p>
     * Sample output:
     * <p>
     * target == 5
     * true
     * <p>
     * target == 20
     * false
     */
    public boolean findNumberIn2dArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    @TestOnly
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        Question4 question4 = new Question4();
        System.out.println(question4.findNumberIn2dArray(matrix, 5));
        System.out.println(question4.findNumberIn2dArray(matrix, 20));
    }
}
