package com.chin.leetcode.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_FloodFill {
    private static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Queue<Integer> queue = new LinkedList<>();
        int origin = image[sr][sc];
        if (origin == newColor) {
            return image;
        }
        queue.offer(sr);
        queue.offer(sc);
        while (!queue.isEmpty()) {
            int targetRow = queue.poll();
            int targetLine = queue.poll();
            image[targetRow][targetLine] = newColor;
            if (targetRow > 0 && image[targetRow - 1][targetLine] == origin) {
                queue.offer(targetRow - 1);
                queue.offer(targetLine);
            }
            if (targetRow < image.length - 1 && image[targetRow + 1][targetLine] == origin) {
                queue.offer(targetRow + 1);
                queue.offer(targetLine);
            }
            if (targetLine > 0 && image[targetRow][targetLine - 1] == origin) {
                queue.offer(targetRow);
                queue.offer(targetLine - 1);
            }
            if (targetLine < image[0].length - 1 && image[targetRow][targetLine + 1] == origin) {
                queue.offer(targetRow);
                queue.offer(targetLine + 1);
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));

        int[][] testCase = {{0, 0, 0}, {0, 1, 1}};
        System.out.println(Arrays.deepToString(floodFill(testCase, 1, 1, 1)));
    }
}
