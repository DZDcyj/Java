package com.chin.leetcode.explore.stringandarray;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class FindDiagonalOrder {
    @Contract(value = "null -> new", pure = true)
    private static int @NotNull [] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0, column = 0;
        int direction = 1;
        int[] result = new int[n*m];
        int r = 0;
        while (row < n && column < m) {
            result[r++] = matrix[row][column];
            int newRow = row + (direction == 1 ? -1 : 1);
            int newColumn = column + (direction == 1 ? 1 : -1);
            if (newRow < 0 || newRow == n || newColumn < 0 || newColumn == m) {
                if (direction == 1) {
                    row += (column == m - 1 ? 1 : 0) ;
                    column += (column < m - 1 ? 1 : 0);
                } else {
                    column += (row == n - 1 ? 1 : 0);
                    row += (row < n - 1 ? 1 : 0);
                }
                direction = 1 - direction;
            } else {
                row = newRow;
                column = newColumn;
            }
        }
        return result;
    }
}
