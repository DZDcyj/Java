package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * @author Chin
 */
public class CourseScheduleTwo {
    @NotNull
    private static int[] findOrder(int numCourses, @NotNull int[][] prerequisites) {
        Map<Integer, List<Integer>> adjList = new HashMap<>(16);
        int[] inDegree = new int[numCourses];
        int[] topologicalOrder = new int[numCourses];

        // Create the adjacency list representation of the graph
        for (int[] prerequisite : prerequisites) {
            int dest = prerequisite[0];
            int src = prerequisite[1];
            List<Integer> lst = adjList.getOrDefault(src, new ArrayList<>());
            lst.add(dest);
            adjList.put(src, lst);

            // Record in-degree of each vertex
            inDegree[dest] += 1;
        }

        // Add all vertices with 0 in-degree to the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        int i = 0;
        // Process until the Q becomes empty
        while (!q.isEmpty()) {
            int node = q.remove();
            topologicalOrder[i++] = node;

            // Reduce the in-degree of each nei***or by 1
            if (adjList.containsKey(node)) {
                for (Integer neighbor : adjList.get(node)) {
                    inDegree[neighbor]--;

                    // If in-degree of a nei***or becomes 0, add it to the Q
                    if (inDegree[neighbor] == 0) {
                        q.add(neighbor);
                    }
                }
            }
        }

        // Check to see if topological sort is possible or not.
        if (i == numCourses) {
            return topologicalOrder;
        }

        return new int[0];
    }
}