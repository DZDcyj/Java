package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class ValidPalindrome {
    private static boolean isPalindrome(@NotNull String s) {
        if (s.length() <= 1) {
            return true;
        }
        s = s.toLowerCase();
        int lo = 0, hi = s.length() - 1;
        boolean allSymbol = true;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isLowerCase(s.charAt(i))) {
                allSymbol = false;
                break;
            }
        }
        if (allSymbol) {
            return true;
        }
        while (lo < hi) {
            while (!(Character.isDigit(s.charAt(lo)) || Character.isLowerCase(s.charAt(lo)))) {
                if (lo >= hi) {
                    break;
                }
                lo++;

            }
            while (!(Character.isDigit(s.charAt(hi)) || Character.isLowerCase(s.charAt(hi)))) {
                if (lo >= hi) {
                    break;
                }
                hi--;
            }
            if (s.charAt(hi) != s.charAt(lo)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(".,"));
        System.out.println(isPalindrome("Telegram, Margelet!"));
        System.out.println(isPalindrome(",; W;:GlG:;l ;,"));
    }
}
