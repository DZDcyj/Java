package com.chin.leetcode.solutions;

public class Solution_CourseSchedule {
    private static boolean canFinish(int numCourses, int[][] prerequisites) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        int[][] pre1 = {{1, 0}};
        int[][] pre2 = {{1, 0}, {0, 1}};
        System.out.println(canFinish(2, pre1));
        System.out.println(canFinish(2, pre2));
    }
}
