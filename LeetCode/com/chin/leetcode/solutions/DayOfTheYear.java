package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class DayOfTheYear {
    private static final int[] DAY_OF_MONTHS = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int MARCH = 3;

    private static int dayOfYear(@NotNull String date) {
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        boolean isLeap = isLeapYear(year);
        if (isLeap && (month >= MARCH)) {
            day++;
        }
        for (int i = 1; i < month; i++) {
            day += DAY_OF_MONTHS[i];
        }
        return day;
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));
        System.out.println(dayOfYear("2003-03-01"));
        System.out.println(dayOfYear("2004-03-01"));
        System.out.println(dayOfYear("2000-01-09"));
        System.out.println(dayOfYear("1900-03-01"));
    }
}
