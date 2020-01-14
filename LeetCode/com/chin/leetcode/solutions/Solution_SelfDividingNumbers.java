package com.chin.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution_SelfDividingNumbers {
    private static boolean isSelfDividingNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int test = num;
        while (test > 0) {
            if (test % 10 == 0 || num % (test % 10) != 0) {
                return false;
            }
            test /= 10;
        }
        return true;
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
        System.out.println(selfDividingNumbers(2, 9));
    }
}
