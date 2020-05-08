package com.chin.leetcode.explore.table;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * @author Chin
 */
public class GroupAnagrams {
    private static String getKey(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    private static @NotNull List<List<String>> groupAnagrams(String @NotNull [] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> storage = new HashMap<>(16);
        for (String str : strs) {
            String key = getKey(str);
            List<String> list = storage.get(key);
            if (list != null) {
                list.add(str);
            } else {
                list = new ArrayList<>();
                list.add(str);
                storage.put(key, list);
            }
        }
        for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        String[] test = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(test));
    }
}
