package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class StringCompression {
    private static int compress(@NotNull char[] chars) {
        int point = 0, edit = 0;
        for (int curr = 0; curr < chars.length; curr++) {
            if (curr + 1 == chars.length || chars[curr + 1] != chars[curr]) {
                chars[edit++] = chars[point];
                if (curr > point) {
                    for (char c : ("" + (curr - point + 1)).toCharArray()) {
                        chars[edit++] = c;
                    }
                }
                point = curr + 1;
            }
        }
        return edit;
    }
}
