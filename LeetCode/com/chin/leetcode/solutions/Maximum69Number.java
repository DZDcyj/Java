package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class Maximum69Number {
    private static int maximum69Number(int num) {
        String numStr = String.valueOf(num);
        int index = numStr.indexOf('6');
        if (index >= 0) {
            numStr = numStr.substring(0, index) + '9' + numStr.substring(index + 1);
        }
        return Integer.parseInt(numStr);
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
        System.out.println(maximum69Number(9996));
        System.out.println(maximum69Number(9999));
    }
}
