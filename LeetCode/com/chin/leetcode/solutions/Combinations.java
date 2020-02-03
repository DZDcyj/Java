package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Chin
 */
public class Combinations {
    @NotNull
    private static List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i < k + 1; i++) {
            linkedList.add(i);
        }
        linkedList.add(n + 1);
        List<List<Integer>> result = new ArrayList<>();
        int j = 0;
        while (j < k) {
            result.add(new LinkedList<>(linkedList.subList(0, k)));
            j = 0;
            while ((j < k) && (linkedList.get(j + 1) == linkedList.get(j) + 1)) {
                linkedList.set(j, j++ + 1);
            }
            linkedList.set(j, linkedList.get(j) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
        System.out.println(combine(1, 1));
    }
}
