package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class MaximumNumberOfBalloons {
    private static int maxNumberOfBalloons(@NotNull String text) {
        int[] storage = {0, 0, 0, 0, 0};
        // For b a l o n
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'b':
                    storage[0]++;
                    break;
                case 'a':
                    storage[1]++;
                    break;
                case 'l':
                    storage[2]++;
                    break;
                case 'o':
                    storage[3]++;
                    break;
                case 'n':
                    storage[4]++;
                default:
            }
        }
        storage[2] /= 2;
        storage[3] /= 2;
        int temp = Integer.MAX_VALUE;
        for (int number : storage) {
            temp = Math.min(temp, number);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
    }
}
