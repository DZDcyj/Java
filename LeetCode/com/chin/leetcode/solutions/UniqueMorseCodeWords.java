package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class UniqueMorseCodeWords {
    private static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    @NotNull
    private static String getMorseWord(@NotNull String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(morse[word.charAt(i) - 'a']);
        }
        return stringBuilder.toString();
    }

    private static int uniqueMorseRepresentations(@NotNull String[] words) {
        HashMap<String, Boolean> hashMap = new HashMap<>(16);
        int count = 0;
        for (String word : words) {
            String morse = getMorseWord(word);
            if (hashMap.get(morse) == null) {
                count++;
                hashMap.put(morse, true);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
