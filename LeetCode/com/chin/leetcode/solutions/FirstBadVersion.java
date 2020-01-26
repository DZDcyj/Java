package com.chin.leetcode.solutions;

import org.jetbrains.annotations.Contract;

class VersionControl {
    private int badVersion;

    @Contract(pure = true)
    VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    @Contract(pure = true)
    boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

/**
 * @author Chin
 */
public class FirstBadVersion extends VersionControl {
    public FirstBadVersion(int badVersion) {
        super(badVersion);
    }

    private int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int res;
        while (true) {
            res = hi + (lo - hi) / 2;
            if (isBadVersion(res)) {
                if (!isBadVersion(res - 1)) {
                    break;
                }
                hi = res - 1;
            } else {
                lo = res + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FirstBadVersion firstBadVersion = new FirstBadVersion(4);
        System.out.println(firstBadVersion.firstBadVersion(5));
        FirstBadVersion firstBadVersion1 = new FirstBadVersion(1150769282);
        System.out.println(firstBadVersion1.firstBadVersion(1420736637));
    }
}
