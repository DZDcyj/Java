package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Chin
 */
public class WordPattern {
    private static boolean wordPattern(@NotNull String pattern, @NotNull String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> hashMap = new HashMap<>(16);
        HashSet<String> hashSet = new HashSet<>();
        int index = 0;
        while (index < words.length) {
            char key = pattern.charAt(index);
            if (hashMap.get(key) == null) {
                if (hashSet.contains(words[index])) {
                    return false;
                }
                hashSet.add(words[index]);
                hashMap.put(key, words[index]);
            } else {
                if (!hashMap.get(key).equals(words[index])) {
                    return false;
                }
            }
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
}
