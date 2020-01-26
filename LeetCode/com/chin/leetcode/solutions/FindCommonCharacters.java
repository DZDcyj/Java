package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * @author Chin
 */
public class FindCommonCharacters {
    @NotNull
    private static List<String> commonChars(@NotNull String[] a) {
        List<String> list = new ArrayList<>();
        char[] cs = a[0].toCharArray();
        HashMap<String, Integer> map = new HashMap<>(16);
        for (char c : cs) {
            String t = String.valueOf(c);
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
            list.add(t);
        }
        for (int i = 1; i < a.length; i++) {
            Map<String, Integer> m = new HashMap<>(16);
            for (char cc : a[i].toCharArray()) {
                String tmp = String.valueOf(cc);
                if (m.containsKey(tmp)) {
                    m.put(tmp, m.get(tmp) + 1);
                } else {
                    m.put(tmp, 1);
                }
            }
            int f = 0;
            String str;
            Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Integer> entry = it.next();
                str = entry.getKey();
                int count;
                if (!m.containsKey(str)) {
                    count = map.get(str);
                    it.remove();
                } else {
                    f = Math.min(map.get(str), m.get(str));
                    count = map.get(str) - m.get(str);
                }
                for (int j = 0; j < count; j++) {
                    list.remove(str);
                }
                entry.setValue(f);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] input1 = {"bella", "label", "roller"};
        String[] input2 = {"cool", "lock", "cook"};
        System.out.println(commonChars(input1));
        System.out.println(commonChars(input2));
    }
}
