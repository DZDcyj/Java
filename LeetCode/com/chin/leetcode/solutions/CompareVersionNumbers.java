package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Chin
 */
public class CompareVersionNumbers {
    private static int compareVersion(@NotNull String version1, @NotNull String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int maxLength = Math.max(ver1.length, ver2.length);
        int diff = Math.abs(ver1.length - ver2.length);
        List<String> verList1 = new ArrayList<>(Arrays.asList(ver1));
        List<String> verList2 = new ArrayList<>(Arrays.asList(ver2));
        if (ver1.length > ver2.length) {
            for (int j = 0; j < diff; j++) {
                verList2.add("0");
            }
        } else {
            for (int j = 0; j < diff; j++) {
                verList1.add("0");
            }
        }
        for (int i = 0; i < maxLength; i++) {
            int v1 = Integer.parseInt(verList1.get(i));
            int v2 = Integer.parseInt(verList2.get(i));
            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("0.1", "0.2"));
        System.out.println(compareVersion("1.0.1", "1"));
        System.out.println(compareVersion("7.5.2.4", "7.5.3"));
        System.out.println(compareVersion("01", "1"));
        System.out.println(compareVersion("1.0", "1"));
    }
}
