package com.chin.leetcode.solutions;

public class Solution_SubtractTheProductAndSumOfDigitsOfAnInteger {
    private static int subtractProductAndSum(int n) {
        int sum = 0, mul = 1;
        while (n > 0) {
            sum += n % 10;
            mul *= n % 10;
            n /= 10;
        }
        return mul - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
        System.out.println(subtractProductAndSum(10225));
    }
}
