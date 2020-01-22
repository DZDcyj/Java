package com.chin.leetcode.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_LetterCasePermutation {
    private static List<String> letterCasePermutation(String S) {
        List<StringBuilder> res = new ArrayList<>();
        res.add(new StringBuilder());

        for (char c : S.toCharArray()) {
            int n = res.size();
            if (Character.isLetter(c)) {
                for (int i = 0; i < n; ++i) {
                    res.add(new StringBuilder(res.get(i)));
                    res.get(i).append(Character.toLowerCase(c));
                    res.get(n + i).append(Character.toUpperCase(c));
                }
            } else {
                for (StringBuilder re : res) {
                    re.append(c);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (StringBuilder stringBuilder : res) {
            result.add(stringBuilder.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
        System.out.println(letterCasePermutation("3z4"));
        System.out.println(letterCasePermutation("12345"));
    }
}
