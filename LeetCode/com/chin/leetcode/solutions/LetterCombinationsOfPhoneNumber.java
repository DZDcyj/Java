package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * @author Chin
 */
public class LetterCombinationsOfPhoneNumber {
    private final static String[] LETTERS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    // The letters belong to every button

    @Contract("null -> new")
    @NotNull
    private static List<String> letterCombination(@Nullable String digits) {
        if (digits == null) {
            return new ArrayList<>();
        }
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < digits.length(); i++) {
            int index = digits.charAt(i) - '0';
            if (index >= 2) {
                if (queue.isEmpty()) {
                    for (int j = 0; j < LETTERS[index].length(); j++) {
                        queue.add("" + LETTERS[index].charAt(j));
                    }
                } else {
                    int times = queue.size();
                    for (int a = 0; a < times; a++) {
                        String temp = queue.remove();
                        for (int j = 0; j < LETTERS[index].length(); j++) {
                            queue.add(temp + LETTERS[index].charAt(j));
                        }
                    }
                }
            }
        }
        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.remove());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombination("23"));
        System.out.println(letterCombination("234"));
        System.out.println(letterCombination(null));
    }
}
