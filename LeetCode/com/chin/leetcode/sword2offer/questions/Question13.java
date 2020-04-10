package com.chin.leetcode.sword2offer.questions;

import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class Question13 {

    /**
     * @param m The length of the sheet
     * @param n The width of the sheet
     * @param k The max sum of plot sum
     * @return The plot can reach
     *
     * Sample input:
     * 1. 2, 3, 1
     * 2. 3, 1, 0
     *
     * Sample output:
     * 1. 3
     * 2. 1
     * */
    public int movingCount(int m, int n, int k) {
        int[][] vis = new int[m][n];
        int count = 1;
        vis[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (getDigitSum(i) + getDigitSum(j) > k) {
                    continue;
                }
                if (i - 1 >= 0) {
                    vis[i][j] |= vis[i - 1][j];
                }
                if (j - 1 >= 0) {
                    vis[i][j] |= vis[i][j - 1];
                }
                count += vis[i][j];
            }
        }
        return count;
    }

    /**
     * @param num The input, range from 1 to 100
     * @return The sum of each digit
     * <p>
     * Sample input:
     * 1. 1
     * 2. 15
     * 3. 100
     * <p>
     * Sample output:
     * 1. 1
     * 2. 6
     * 3. 1
     */
    private static int getDigitSum(int num) {
        if (num == 100) {
            return 1;
        }
        return num / 10 + num % 10;
    }

    @TestOnly
    public static void main(String[] args) {
        Question13 question13 = new Question13();
        System.out.println(question13.movingCount(2, 3, 1));
        System.out.println(question13.movingCount(3, 1, 0));
    }
}
