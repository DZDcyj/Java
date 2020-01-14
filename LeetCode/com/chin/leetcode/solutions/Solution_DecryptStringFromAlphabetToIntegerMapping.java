package com.chin.leetcode.solutions;

public class Solution_DecryptStringFromAlphabetToIntegerMapping {
    private static String letters = "abcdefghijklmnopqrstuvwxyz";

    private static String freqAlphabets(String s) {
        int i = s.length() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                i -= 2;
                stringBuilder.append(letters.charAt(Integer.parseInt(s.substring(i, i + 2)) - 1));
            } else {
                stringBuilder.append(letters.charAt(Integer.parseInt(s.substring(i, i + 1)) - 1));
            }
            i--;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("abc".substring(0, 1));
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
        System.out.println(freqAlphabets("25#"));
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}
