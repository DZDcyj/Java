package com.chin.leetcode.solutions;

public class Solution_ReverseInteger {
    private static int reverse(int x) {
        long result = 0;
        int temp = x;
        int flag = -1;
        while ((temp) != 0) {
            temp /= 10;
            flag += 1;
        }
        while ((x) != 0) {
            result += ((x % 10) * (long) (Math.pow(10, flag)));
            if (result > 2147483647 || result < -2147483648)
                return 0;
            x /= 10;
            flag -= 1;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(2147483647));
    }
}
