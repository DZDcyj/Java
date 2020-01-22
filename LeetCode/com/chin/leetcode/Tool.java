package com.chin.leetcode;

import java.util.Scanner;

/**
 * @author Chin
 */
public class Tool {
    private static String arrayConverter(String array) {
        if (array.contains("[")) {
            array = array.replace("[", "{");
        } else {
            array = "{" + array;
        }
        if (array.contains("]")) {
            array = array.replace("]", "}");
        } else {
            array = array + "}";
        }
        return array;
    }

    private static String arrayConverter(String array, boolean stringArrayConvertToCharArray) {
        array = arrayConverter(array);
        if (stringArrayConvertToCharArray) {
            array = array.replace("\"", "'");
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array below:");
        String array = scanner.next();
        boolean needToChar = false;
        if (array.contains("\"")) {
            System.out.println("Need change String Array to Char Array？(Y/N)");
            String choice = scanner.next();
            if ("Y".equals(choice)) {
                needToChar = true;
            }
        }
        System.out.println("Copy the text below:");
        System.out.println(arrayConverter(array, needToChar));
    }
}
