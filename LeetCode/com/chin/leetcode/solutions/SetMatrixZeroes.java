package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */
public class SetMatrixZeroes {
    private static void setZeroes(@NotNull int[][] matrix) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(i);
                    queue.offer(j);
                }
            }
        }
        while (!queue.isEmpty()) {
            int x = queue.poll();
            assert !queue.isEmpty();
            int y = queue.poll();
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[x][i] = 0;
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][y] = 0;
            }
        }
    }
}
