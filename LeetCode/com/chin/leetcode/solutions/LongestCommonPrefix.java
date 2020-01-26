package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class LongestCommonPrefix {
    private static String longestCommonPrefix(@NotNull String[] strings) {
        String result = "";
        if (strings.length == 1) {
            return strings[0];
        } else if (strings.length == 0) {
            return "";
        }
        for (int i = 0; i < strings[0].length(); i++) {
            char temp = strings[0].charAt(i);
            boolean same = true;
            for (int j = 1; j < strings.length; j++) {
                if (strings[j].length() == result.length() || strings[j].charAt(i) != temp) {
                    same = false;
                    break;
                }
            }
            if (same) {
                result += temp;
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] test1 = {"flower", "flow", "flight"};
        String[] test2 = {"dog", "racecar", "car"};
        String[] test3 = {"avcdddd", "avcddddfg", "avcdddde"};
        String[] test4 = {"aa","a"};
        System.out.println(longestCommonPrefix(test1));
        System.out.println(longestCommonPrefix(test2));
        System.out.println(longestCommonPrefix(test3));
        System.out.println(longestCommonPrefix(test4));
    }
}
