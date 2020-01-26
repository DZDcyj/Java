package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author Chin
 */
public class UncommonWordsFromTwoSentences {
    @NotNull
    private static String[] uncommonFromSentences(String a, String b) {
        String c = a + " " + b;
        String[] words = c.split(" ");
        HashSet<String> hashSet = new HashSet<>();
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (!hashSet.contains(word)) {
                hashSet.add(word);
                res.add(word);
            } else {
                res.remove(word);
            }
        }
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }
}
