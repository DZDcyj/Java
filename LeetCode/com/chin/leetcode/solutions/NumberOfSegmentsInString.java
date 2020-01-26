package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class NumberOfSegmentsInString {
    private static int countSegments(@NotNull String s) {
        String[] list = s.split(" ");
        int count = 0;
        for (String str : list) {
            if (!"".equals(str)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello,   my name is John"));
        System.out.println(countSegments("Test"));
    }
}
