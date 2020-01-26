package com.chin.leetcode.solutions;

import java.util.Arrays;

/**
 * @author Chin
 */
public class AssignCookies {
    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0, cookie = 0;
        int result = 0;
        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                result++;
                child++;
            }
            cookie++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] childrenOne = {1, 2, 3};
        int[] childrenTwo = {1, 2};
        int[] cookies1 = {1, 1};
        int[] cookies2 = {1, 2, 3};

        System.out.println(findContentChildren(childrenOne, cookies1));
        System.out.println(findContentChildren(childrenTwo, cookies2));
    }
}
