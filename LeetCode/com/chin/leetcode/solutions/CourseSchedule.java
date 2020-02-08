package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chin
 */
public class CourseSchedule {
    private static boolean canFinish(int numCourses, @NotNull int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        for (int[] cp : prerequisites) {
            inDegree[cp[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            Integer curr = queue.poll();
            numCourses--;
            for (int[] prerequisite : prerequisites) {
                if (prerequisite[1] != curr) {
                    continue;
                }
                if (--inDegree[prerequisite[0]] == 0) {
                    queue.offer(prerequisite[0]);
                }
            }
        }
        return numCourses == 0;
    }

    public static void main(String[] args) {
        int[][] pre1 = {{1, 0}};
        int[][] pre2 = {{1, 0}, {0, 1}};
        int[][] pre3 = {{0, 0}};
        System.out.println(canFinish(2, pre1));
        System.out.println(canFinish(2, pre2));
        System.out.println(canFinish(1, pre3));
    }
}
