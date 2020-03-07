package com.chin.leetcode.sword2offer.questions;

import com.chin.leetcode.sword2offer.datastructures.CQueue;
import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class Question9 {
    @TestOnly
    public static void main(String[] args) {
        CQueue queue1 = new CQueue();
        queue1.appendTail(3);
        System.out.println(queue1.deleteHead());
        System.out.println(queue1.deleteHead());

        CQueue queue2 = new CQueue();
        System.out.println(queue2.deleteHead());
        queue2.appendTail(5);
        queue2.appendTail(2);
        System.out.println(queue2.deleteHead());
        System.out.println(queue2.deleteHead());
    }
}
