package com.chin.leetcode.solutions;

import java.util.Arrays;

public class Solution_AddBinary {
    private static String addBinary(String a, String b) {
        char[] res = new char[(Math.max(a.length(), b.length())) + 1];
        int i = a.length() - 1, j = b.length() - 1, k = res.length - 1;
        res[0] = '0';
        while (i >= 0 || j >= 0) {
            if (i < 0) {
                res[k--] = b.charAt(j--);
            } else {
                if (j < 0) {
                    res[k--] = a.charAt(i--);
                } else {
                    char c1 = a.charAt(i--);
                    char c2 = b.charAt(j--);
                    if ((c1 == '1' && c2 == '0') || (c1 == '0' && c2 == '1')) {
                        res[k--] = '1';
                    } else {
                        if (c1 == '1' && c2 == '1') {
                            res[k--] = '2';
                        } else {
                            res[k--] = '0';
                        }
                    }
                }
            }
        }

        for (int x = res.length - 1; x >= 1; x--) {
            if (res[x] == '2') {
                res[x] = '0';
                res[x - 1] += 1;
            }
            if (res[x] == '3') {
                res[x] = '1';
                res[x - 1] += 1;
            }
        }
        String str = new String(res);
        if (res[0] == '0') {
            return str.substring(1);
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }
}
