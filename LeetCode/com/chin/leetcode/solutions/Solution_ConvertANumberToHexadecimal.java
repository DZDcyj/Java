package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

public class Solution_ConvertANumberToHexadecimal {
    @NotNull
    private static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        String hexNumbers = "0123456789abcdef";
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0 && stringBuilder.length() < 8) {
            stringBuilder.insert(0, hexNumbers.charAt(num & 0xf));
            num >>= 4;
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(toHex(26));
        System.out.println(toHex(-1));
    }
}
