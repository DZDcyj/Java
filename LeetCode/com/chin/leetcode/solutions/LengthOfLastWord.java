package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class LengthOfLastWord {
    private static int lengthOfLastWord(String s) {
        StringBuilder newStr = new StringBuilder(s).reverse();
        boolean characterExist = false;
        int len = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (!characterExist) {
                if (newStr.charAt(i) != ' ') {
                    characterExist = true;
                    len++;
                }
            } else {
                if (newStr.charAt(i) == ' ') {
                    return len;
                }
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String test = " a ";
        System.out.println(lengthOfLastWord(test));
    }
}
