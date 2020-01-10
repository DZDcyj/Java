package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

/**
 * @author Chin
 */
public class Solution_SimplifyPath {
    @NotNull
    private static String simplifyPath(@NotNull String path) {
        String[] dirs = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String dir : dirs) {
            if (!stack.isEmpty() && "..".equals(dir)) {
                stack.pop();
            } else if (!"".equals(dir) && !".".equals(dir) && !"..".equals(dir)) {
                stack.push(dir);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder result = new StringBuilder();
        for (String s : stack) {
            result.append("/").append(s);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/a/../../b/../c//.//"));
        System.out.println(simplifyPath("/a/../../b/../c//.//"));
        System.out.println(simplifyPath("/a//b////c/d//././/.."));
    }
}
