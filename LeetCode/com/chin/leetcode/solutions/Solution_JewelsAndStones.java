package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class Solution_JewelsAndStones {
    private static int numJewelsInStones(@NotNull String J, String S) {
        int count = 0;
        HashMap<Character, Boolean> hashMap = new HashMap<>(16);
        for (int i = 0; i < J.length(); i++) {
            hashMap.putIfAbsent(J.charAt(i), true);
        }
        for (int j = 0; j < S.length(); j++) {
            if (hashMap.get(S.charAt(j)) != null) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
        System.out.println(numJewelsInStones("", ""));
    }
}
