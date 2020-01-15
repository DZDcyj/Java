package com.chin.leetcode.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_ShortestDistanceToACharacter {
    private static int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        Arrays.fill(result, Integer.MAX_VALUE);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int index = queue.poll();
            for (int i = 0; i < S.length(); i++) {
                result[i] = Math.min(result[i], Math.abs(i - index));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
    }
}
