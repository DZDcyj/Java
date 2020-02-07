package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chin
 */
public class FractionToRecurringDecimal {
    @NotNull
    private static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }

        StringBuilder fraction = new StringBuilder();
        if (numerator < 0 ^ denominator < 0) {
            fraction.append("-");
        }

        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        fraction.append(dividend / divisor);
        long remainder = dividend % divisor;
        if (remainder == 0) {
            return fraction.toString();
        }
        fraction.append(".");
        Map<Long, Integer> map = new HashMap<>(16);
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                fraction.insert(map.get(remainder), "(");
                fraction.append(")");
                break;
            }
            map.put(remainder, fraction.length());
            remainder *= 10;
            fraction.append(remainder / divisor);
            remainder %= divisor;
        }
        return fraction.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1, 2));
        System.out.println(fractionToDecimal(2, 1));
        System.out.println(fractionToDecimal(437, 999));
    }
}
