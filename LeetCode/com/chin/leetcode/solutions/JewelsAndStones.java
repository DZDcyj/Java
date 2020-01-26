package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

/**
 * @author Chin
 */
public class JewelsAndStones {
    private static int numJewelsInStones(@NotNull String jewels, String stones) {
        int count = 0;
        HashMap<Character, Boolean> hashMap = new HashMap<>(16);
        for (int i = 0; i < jewels.length(); i++) {
            hashMap.putIfAbsent(jewels.charAt(i), true);
        }
        for (int j = 0; j < stones.length(); j++) {
            if (hashMap.get(stones.charAt(j)) != null) {
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
