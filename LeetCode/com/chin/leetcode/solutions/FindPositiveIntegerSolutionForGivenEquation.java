package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chin
 */
public class FindPositiveIntegerSolutionForGivenEquation {
    private static final int MAX_VALUE = 1000;
    private static final int MIN_VALUE = 1;

    static class CustomFunction {
        private int functionId;

        CustomFunction(int id) {
            functionId = id;
        }

        public int f(int x, int y) {
            if (functionId == 1) {
                return x + y;
            }
            return x * y;
        }
    }

    @NotNull
    private static List<List<Integer>> findSolution(CustomFunction customFunction, int z) {
        List<List<Integer>> result = new ArrayList<>();
        int x = 1, y = 1000;
        while (x <= MAX_VALUE && y >= MIN_VALUE) {
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
