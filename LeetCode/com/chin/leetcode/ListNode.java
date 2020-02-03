package com.chin.leetcode;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class ListNode {

    private static final char SIGN = '-';

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Nullable
    public static ListNode constructFromString(@NotNull String str) {
        if ("".equals(str)) {
            return null;
        }
        if (!Character.isDigit(str.charAt(0))) {
            if (str.charAt(0) != SIGN) {
                str = str.substring(1);
            }
        }
        if (!Character.isDigit(str.charAt(str.length() - 1))) {
            str = str.substring(0, str.length() - 1);
        }
        String[] values = str.split("->");
        ListNode root = new ListNode(Integer.parseInt(values[0]));
        ListNode curr = root;
        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(Integer.parseInt(values[i]));
            curr = curr.next;
        }
        return root;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode curr = this;
        boolean first = true;
        while (curr != null) {
            if (first) {
                first = false;
            } else {
                stringBuilder.append("->");
            }
            stringBuilder.append(curr.val);
            curr = curr.next;
        }
        return stringBuilder.toString();
    }

    @TestOnly
    public static void main(String[] args) {
        ListNode listNode = constructFromString("1");
        System.out.println(listNode);
    }
}
