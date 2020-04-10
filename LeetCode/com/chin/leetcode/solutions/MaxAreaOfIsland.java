package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */
public class MaxAreaOfIsland {
    private static int maxAreaOfIsland(@NotNull int[][] grid) {
        int result = 0;
        for (int i = 0; i != grid.length; i++) {
            for (int j = 0; j != grid[0].length; j++) {
                int curr = 0;
                Queue<Integer> queueI = new LinkedList<>();
                Queue<Integer> queueJ = new LinkedList<>();
                queueI.offer(i);
                queueJ.offer(j);
                while (!queueI.isEmpty()) {
                    int currI = queueI.poll();
                    int currJ = queueJ.poll();
                    if (currI < 0 || currJ < 0) {
                        continue;
                    }
                    if (currI == grid.length || currJ == grid[0].length) {
                        continue;
                    }
                    if (grid[currI][currJ] != 1) {
                        continue;
                    }
                    curr++;
                    grid[currI][currJ] = 0;
                    int[] di = {0, 0, 1, -1};
                    int[] dj = {1, -1, 0, 0};
                    for (int index = 0; index != 4; index++) {
                        int nextI = currI + di[index];
                        int nextJ = currJ + dj[index];
                        queueI.offer(nextI);
                        queueJ.offer(nextJ);
                    }
                }
                result = Math.max(result, curr);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] test1 = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int[][] test2 = {{0, 0, 0, 0, 0, 0, 0, 0}};
        System.out.println(maxAreaOfIsland(test1));
        System.out.println(maxAreaOfIsland(test2));
    }
}
