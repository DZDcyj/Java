package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * @author Chin
 */
public class DiStringMatch {
    @NotNull
    private static int[] diStringMatch(@NotNull String s) {
        int sLen = s.length();
        int[] result = new int[sLen + 1];
        int min = 0, max = sLen;
        for (int i = 0; i < sLen; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = min++;
            } else {
                result[i] = max--;
            }
        }
        result[sLen] = min;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("DID")));
        System.out.println(Arrays.toString(diStringMatch("III")));
        System.out.println(Arrays.toString(diStringMatch("DDI")));
    }
}
