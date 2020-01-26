package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class ValidateIpAddress {
    private static final String[] SPLITS = {":", "."};
    private static final int LENGTH_OF_IPV4 = 4;
    private static final int LENGTH_OF_IPV6 = 8;

    @NotNull
    private static String validIpAddress(@NotNull String ip) {
        if (ip.startsWith(SPLITS[0]) || ip.startsWith(SPLITS[1])
                || ip.endsWith(SPLITS[0]) || ip.endsWith(SPLITS[1])) {
            return "Neither";
            //防止开头和结尾是“：”和“.”，会扰乱后面split的判断：52 / 79 "2001:0db8:85a3:0:0:8A2E:0370:7334:"
        }
        String[] splits = ip.split("\\.");
        if (splits.length == LENGTH_OF_IPV4) {
            int num;
            for (int i = 0; i < LENGTH_OF_IPV4; i++) {
                try {
                    num = Integer.parseInt(splits[i]);
                } catch (NumberFormatException e) {
                    return "Neither";
                }
                if (num < 0 || num > 255) {
                    return "Neither";
                }
                if (splits[i].length() > 1) {
                    if (splits[i].startsWith("0") || splits[i].startsWith("-")) {
                        return "Neither";
                    }
                    //防止IPv4中的0开头的情况：65 / 79 "01.01.01.01"；还有防止-0的情况：76 / 79 "15.16.-0.1"
                }
            }
            return "IPv4";
        } else {
            splits = ip.split(":");
            if (splits.length == LENGTH_OF_IPV6) {
                for (int i = 0; i < LENGTH_OF_IPV6; i++) {
                    int len = splits[i].length();
                    if (splits[i] == null
                            || len > 4
                            || len == 0) {
                        return "Neither";
                    }
                    for (int j = 0; j < len; j++) {
                        char c = splits[i].charAt(j);
                        if (!isHexCharacter(c)) {
                            return "Neither";
                        }
                    }
                }
                return "IPv6";
            } else {
                return "Neither";
            }
        }
    }

    private static boolean isHexCharacter(char c) {
        if (Character.isDigit(c)) {
            return true;
        } else if (Character.isUpperCase(c)) {
            return c >= 'a' && c <= 'f';
        } else if (Character.isLowerCase(c)) {
            return c >= 'A' && c <= 'F';
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validIpAddress("172.16.254.1"));
        System.out.println(validIpAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        System.out.println(validIpAddress("256.256.256.256"));
        System.out.println(validIpAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
        System.out.println(validIpAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }
}
