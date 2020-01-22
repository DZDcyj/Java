package com.chin.leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_OccurrencesAfterBigram {
    private static String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                res.add(words[i + 2]);
            }
        }
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("alice is a good girl she is a good student", "a", "good")));
        System.out.println(Arrays.toString(findOcurrences("we will we will rock you", "we", "will")));
    }
}
