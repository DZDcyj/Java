package com.chin.leetcode.sword2offer.questions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class Question5 {

    /**
     * This function returns string of url, replacing space to %20
     *
     * @param s Given string
     * @return The transformed string. Change " " to "%20"
     *
     * Sample input:
     * We are happy
     *
     * Sample output:
     * We%20are%20happy
     * */
    public String replaceSpace(@NotNull String s) {
        return s.replace(" ", "%20");
    }

    @TestOnly
    public static void main(String[] args) {
        Question5 question5 = new Question5();
        System.out.println(question5.replaceSpace("We are happy"));
    }
}
