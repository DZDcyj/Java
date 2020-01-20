package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Solution_FindPositiveIntegerSolutionForAGivenEquation {
    static class CustomFunction {
        private int function_id;

        CustomFunction(int id) {
            function_id = id;
        }

        public int f(int x, int y) {
            if (function_id == 1) {
                return x + y;
            }
            return x * y;
        }
    }

    @NotNull
    private static List<List<Integer>> findSolution(CustomFunction customFunction, int z) {
        List<List<Integer>> result = new ArrayList<>();
        int x = 1, y = 1000;
        while (x <= 1000 && y >= 1) {
            int temp = customFunction.f(x, y);
            if (temp == z) {
                List<Integer> res = new ArrayList<>();
                res.add(x);
                res.add(y);
                result.add(res);
                x++;
            } else if (temp > z) {
                y--;
            } else {
                x++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CustomFunction customFunction1 = new CustomFunction(1);
        CustomFunction customFunction2 = new CustomFunction(2);

        System.out.println(findSolution(customFunction1, 5));
        System.out.println(findSolution(customFunction2, 5));
        System.out.println(findSolution(customFunction2, 4));
    }
}
