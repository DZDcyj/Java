package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;

public class Solution_AddStrings {
    @NotNull
    private static String addStrings(@NotNull String num1, @NotNull String num2) {
//        return String.valueOf(new BigInteger(num1).add(new BigInteger(num2)));
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int temp = n1 + n2 + carry;
            carry = temp / 10;
            result.append(temp % 10);
            i--;
            j--;
        }
        if (carry == 1)
            result.append(1);
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("123", "456"));
        System.out.println(addStrings("3321", "789"));
    }
}
