package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Chin
 */
public class ImplementRand10UsingRand7 {
    static class SolBase {
        private static Random random = new Random(47);

        public int rand7() {
            return random.nextInt(7);
        }
    }

    static class Solution extends SolBase {
        public int rand10() {
            int row, col, idx;
            do {
                row = rand7();
                col = rand7();
                idx = col + (row - 1) * 7;
            } while (idx > 40);
            return 1 + (idx - 1) % 10;
        }

        @NotNull
        private int[] generate(int times) {
            int[] result = new int[times];
            for (int i = 0; i < times; i++) {
                result[i] = rand10();
            }
            return result;
        }

        public void call(int times) {
            System.out.println(Arrays.toString(generate(times)));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.call(1);
        solution.call(2);
        solution.call(3);
    }
}
