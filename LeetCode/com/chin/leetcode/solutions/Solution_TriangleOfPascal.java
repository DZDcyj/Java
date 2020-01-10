package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Solution_TriangleOfPascal {
    @NotNull
    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> thisLine = new ArrayList<>();
            if (i > 0) {
                List<Integer> previous = result.get(i - 1);
                for (int j = 0; j < i + 1; j++) {
                    int temp;
                    if (j == 0 || j == i) {
                        temp = 1;
                    } else {
                        temp = previous.get(j - 1) + previous.get(j);
                    }
                    thisLine.add(temp);
                }
            } else {
                thisLine.add(1);
            }
            result.add(thisLine);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(10));
        System.out.println(generate(1));
    }

}
