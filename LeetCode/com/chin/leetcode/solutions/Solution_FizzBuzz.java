package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Solution_FizzBuzz {
    @NotNull
    private static List<String> findBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if (i % 3 == 0) {
                stringBuilder.append("Fizz");
            }
            if (i % 5 == 0) {
                stringBuilder.append("Buzz");
            }
            if (stringBuilder.toString().equals("")) {
                stringBuilder.append(i);
            }
            result.add(stringBuilder.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findBuzz(15));
        System.out.println(findBuzz(2));
    }
}
