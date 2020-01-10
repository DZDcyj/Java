package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

public class Solution_IntegerToRoman {
    // TODO:finish the function considering the coin problem
    private static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        while (num >= 1000) {
            num -= 1000;
            result.append("M");
        }
        while (num >= 900) {
            num -= 900;
            result.append("CM");
        }
        while (num >= 500) {
            num -= 500;
            result.append("D");
        }
        while (num >= 400) {
            num -= 400;
            result.append("CD");
        }
        while (num >= 100) {
            num -= 100;
            result.append("C");
        }
        while (num >= 90) {
            num -= 90;
            result.append("XC");
        }
        while (num >= 50) {
            num -= 50;
            result.append("L");
        }
        while (num >= 40) {
            num -= 40;
            result.append("XL");
        }
        while (num >= 10) {
            num -= 10;
            result.append("X");
        }
        while (num >= 9) {
            num -= 9;
            result.append("IX");
        }
        while (num >= 5) {
            num -= 5;
            result.append("V");
        }
        while (num >= 4) {
            num -= 4;
            result.append("IV");
        }
        while (num >= 1) {
            num -= 1;
            result.append("I");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(1));
        System.out.println(intToRoman(3999));
    }
}
