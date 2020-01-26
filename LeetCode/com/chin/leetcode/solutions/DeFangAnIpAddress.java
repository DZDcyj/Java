package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class DeFangAnIpAddress {
    @Contract(pure = true)
    @NotNull
    private static String deFangIpAddr(@NotNull String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        System.out.println(deFangIpAddr("1.1.1.1"));
        System.out.println(deFangIpAddr("255.100.50.0"));
    }
}
