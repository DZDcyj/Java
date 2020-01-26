package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class BullsAndCows {
    @NotNull
    private static String getHint(@NotNull String secret, String guess) {
        int[] bucket = new int[10];
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                continue;
            }
            bucket[secret.charAt(i) - '0']++;
            bucket[guess.charAt(i) - '0']--;
        }
        for (int i = 0; i < 10; i++)
            if (bucket[i] > 0)
                cows += bucket[i];
        cows = secret.length() - cows - bulls;
        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("1807", "7810"));
        System.out.println(getHint("1123", "0111"));
        System.out.println(getHint("11", "10"));
    }
}
