package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class IntegerToEnglishWords {
    private static final String[] NUMBERS = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] UNITS = {"Hundred", "Thousand", "Million", "Billion"};
    private static final String[] TENS = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TIES = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private static final int TEN = 10;
    private static final int TWENTY = 20;
    private static final int HUNDRED = 100;
    private static final int THOUSAND = 1000;
    private static final int MILLION = 1000000;
    private static final int BILLION = 1000000000;

    @NotNull
    private static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        } else if (num < TEN) {
            return NUMBERS[num];
        } else if (num < TWENTY) {
            return TENS[num - TEN];
        } else if (num < HUNDRED) {
            int tail = num % 10;
            int head = num / 10;
            if (tail != 0) {
                return TIES[head] + " " + NUMBERS[tail];
            } else {
                return TIES[head];
            }
        } else if (num < THOUSAND) {
            int hundreds = num / 100;
            int units = num % 10;
            int tens = (num % 100 - units) / 10;
            StringBuilder result = new StringBuilder();
            result.append(NUMBERS[hundreds]).append(" ").append(UNITS[0]);
            if (tens > 1) {
                result.append(" ").append(TIES[tens]);
                if (units > 0) {
                    result.append(" ").append(NUMBERS[units]);
                }
            } else if (tens == 1) {
                result.append(" ").append(TENS[units]);
            } else {
                if (units > 0) {
                    result.append(" ").append(NUMBERS[units]);
                }
            }
            return result.toString();
        } else if (num < MILLION) {
            StringBuilder stringBuilder = new StringBuilder();
            String before = numberToWords(num / THOUSAND) + " " + UNITS[1];
            stringBuilder.append(before);
            if (num % THOUSAND != 0) {
                stringBuilder.append(" ").append(numberToWords(num % THOUSAND));
            }
            return stringBuilder.toString();
        } else if (num < BILLION) {
            StringBuilder stringBuilder = new StringBuilder();
            String before = numberToWords(num / MILLION) + " " + UNITS[2];
            stringBuilder.append(before);
            if (num % MILLION != 0) {
                stringBuilder.append(" ").append(numberToWords(num % MILLION));
            }
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        String before = numberToWords(num / BILLION) + " " + UNITS[3];
        stringBuilder.append(before);
        if (num % BILLION != 0) {
            stringBuilder.append(" ").append(numberToWords(num % BILLION));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(12345));
        System.out.println(numberToWords(1234567));
        System.out.println(numberToWords(1234567891));
        System.out.println(numberToWords(100));
        System.out.println(numberToWords(1000));
    }
}
