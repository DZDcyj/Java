package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class FindWordsThatCanBeFormedByCharacters {
    private static final int SIZE_OF_ALPHABET = 26;

    private static int countCharacters(@NotNull String[] words, String chars) {
        int length = 0;
        for (String str : words) {
            if (canMatch(str, chars)) {
                length += str.length();
            }
        }
        return length;
    }

    private static boolean canMatch(@NotNull String word, @NotNull String chars) {
        if (word.length() > chars.length()) {
            return false;
        }
        int[] wordChars = new int[26];
        int[] charsChars = new int[26];
        for (int i = 0; i < word.length(); i++) {
            wordChars[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < chars.length(); i++) {
            charsChars[chars.charAt(i) - 'a']++;
        }
        for (int i = 0; i < SIZE_OF_ALPHABET; i++) {
            if (charsChars[i] < wordChars[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words1 = {"cat", "bt", "hat", "tree"};
        String[] words2 = {"hello", "world", "leetcode"};
        System.out.println(countCharacters(words1, "atach"));
        System.out.println(countCharacters(words2, "welldonehoneyr"));
    }
}
