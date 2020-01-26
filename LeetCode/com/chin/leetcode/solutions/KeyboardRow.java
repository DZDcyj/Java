package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Chin
 */
public class KeyboardRow {
    private final static int FIRST = 0;
    private final static int SECOND = 1;
    private final static int LAST = 2;

    @NotNull
    private static String[] findWords(@NotNull String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (canPrint(word)) {
                list.add(word);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static boolean canPrint(@NotNull String word) {
        word = word.toLowerCase();
        String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        int type;
        String firstChar = word.substring(0, 1);
        if (keyboard[0].contains(firstChar)) {
            type = FIRST;
        } else if (keyboard[1].contains(firstChar)) {
            type = SECOND;
        } else {
            type = LAST;
        }
        for (int i = 1; i < word.length(); i++) {
            String curr = word.substring(i, i + 1);
            if (!keyboard[type].contains(curr)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] test1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] test2 = {"abdfs", "cccd", "a", "qwwewm"};
        System.out.println(Arrays.toString(findWords(test1)));
        System.out.println(Arrays.toString(findWords(test2)));
    }
}
