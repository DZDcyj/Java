import org.jetbrains.annotations.NotNull;

public class Solution_NumberOfSegmentsInAString {
    private static int countSegments(@NotNull String s) {
        String[] list = s.split(" ");
        int count = 0;
        for (String str : list) {
            if (!str.equals(""))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello,   my name is John"));
    }
}
