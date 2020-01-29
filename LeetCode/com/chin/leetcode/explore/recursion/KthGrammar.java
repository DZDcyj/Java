package com.chin.leetcode.explore.recursion;

/**
 * @author Chin
 */
public class KthGrammar {
    private static int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (~k & 1) ^ kthGrammar(n - 1, (k + 1) / 2);
    }


    public static void main(String[] args) {
        System.out.println(kthGrammar(1, 1));
        System.out.println(kthGrammar(2, 1));
        System.out.println(kthGrammar(2, 2));
        System.out.println(kthGrammar(4, 5));
    }
}
