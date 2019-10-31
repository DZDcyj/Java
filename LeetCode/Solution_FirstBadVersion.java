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

public class Solution_FirstBadVersion extends VersionControl {
    public Solution_FirstBadVersion(int badversion) {
        super(badversion);
    }

    private int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int res;
        while (true) {
            res = hi + (lo - hi) / 2;
            if (isBadVersion(res)) {
                if (!isBadVersion(res - 1))
                    break;
                hi = res - 1;
            } else {
                lo = res + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution_FirstBadVersion solution_firstBadVersion = new Solution_FirstBadVersion(4);
        System.out.println(solution_firstBadVersion.firstBadVersion(5));
        Solution_FirstBadVersion solution_firstBadVersion1 = new Solution_FirstBadVersion(1150769282);
        System.out.println(solution_firstBadVersion1.firstBadVersion(1420736637));
    }
}
