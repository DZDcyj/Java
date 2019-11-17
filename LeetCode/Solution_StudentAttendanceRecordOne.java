import org.jetbrains.annotations.NotNull;

public class Solution_StudentAttendanceRecordOne {
    private static boolean checkRecord(@NotNull String s) {
        int absentTime = 0;
        int lateTime = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                    absentTime++;
                    lateTime = 0;
                    break;
                case 'L':
                    lateTime++;
                    break;
                default:
                    lateTime = 0;
            }
            if (absentTime > 1 || lateTime > 2)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
        System.out.println(checkRecord("LALL"));
    }
}
