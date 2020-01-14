package com.chin.leetcode.solutions;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution_DiStringMatch {
    private static int[] diStringMatch(String S) {
        int sLen = S.length();
        int[] result = new int[sLen + 1];
        int min = 0, max = sLen;
        for (int i = 0; i < sLen; i++) {
            if (S.charAt(i) == 'I') {
                result[i] = min++;
            } else {
                result[i] = max--;
            }
        }
        result[sLen] = min;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
        System.out.println(Arrays.toString(diStringMatch("III")));
        System.out.println(Arrays.toString(diStringMatch("DDI")));
    }
}
