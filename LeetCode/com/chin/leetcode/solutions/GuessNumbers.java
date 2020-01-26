package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class GuessNumbers {
    private static final int TIMES = 3;

    private static int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < TIMES; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] guess1 = {1, 2, 3};
        int[] answer1 = {1, 2, 3};
        int[] guess2 = {2, 2, 3};
        int[] answer2 = {3, 2, 1};
        System.out.println(game(guess1, answer1));
        System.out.println(game(guess2, answer2));
    }

}
