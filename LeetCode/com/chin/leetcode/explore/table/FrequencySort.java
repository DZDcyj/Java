package com.chin.leetcode.explore.table;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Chin
 */
public class FrequencySort {
    @NotNull
    private static String frequencySort(@NotNull String s) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (treeMap.get(s.charAt(i)) == null) {
                treeMap.put(s.charAt(i), 1);
            } else {
                treeMap.put(s.charAt(i), treeMap.get(s.charAt(i)) + 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(treeMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<Character, Integer> entry : list) {
            stringBuilder.append(String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue())));
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("cccaaa"));
        System.out.println(frequencySort("Aabb"));
    }
}
