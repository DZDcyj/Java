package com.chin.leetcode.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */
public class ShortestDistanceToCharacter {
    private static int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        Arrays.fill(result, Integer.MAX_VALUE);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int index = queue.poll();
            for (int i = 0; i < s.length(); i++) {
                result[i] = Math.min(result[i], Math.abs(i - index));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("asdfh", 's')));
    }
}
