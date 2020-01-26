package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class RobotReturnToOrigin {
    private static boolean judgeCircle(@NotNull String moves) {
        int[] directions = {0, 0};
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    directions[0]++;
                    break;
                case 'D':
                    directions[0]--;
                    break;
                case 'L':
                    directions[1]--;
                    break;
                case 'R':
                    directions[1]++;
                    break;
                default:
            }
        }
        return directions[0] == 0 && directions[1] == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }
}
