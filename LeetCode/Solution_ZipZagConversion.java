import java.util.ArrayList;
import java.util.List;

public class Solution_ZipZagConversion {
    /**
     * @author LeetCode
     * @date 2019/10/9
     * @param s The origin String
     * @param numRows The number of Rows transformed
     * @return The Transformed String
     *
     * How does this function work?
     * First, if numRows equals 1, we just return the origin String
     * Otherwise, we start to deal with the String s
     * We uses an arraylist to storage every row's String
     * Then we add every letter to every String
     * In the end, we add every String and return the result
     * */
    private static String convert(String s, int numRows) {
        /*
         * Here is my own algorithm, using hashtable
         * I put the hashtable to <index, String>
         * Then organize the string from index
         * Runs 42ms in Online Judge platform
         * There's a faster below
         *
        if (numRows == 1 || s.length() < numRows)
            return s;
        StringBuilder result = new StringBuilder();
        int index = 0;
        int flag = 1;
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(index) == null)
                hashMap.put(index, "" + s.charAt(i));
            else
                hashMap.put(index, hashMap.get(index) + s.charAt(i));
            index += flag;
            if (index == 0)
                flag = 1;
            else if (index == numRows - 1)
                flag = -1;
        }
        for (int i = 0; i < numRows; i++) {
            result.append(hashMap.get(i));
        }
        return result.toString();
        */

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

    public static void main(String[] args) {
        final String testString = "LEETCODEISHIRING";
        System.out.println(convert(testString, 3));
        System.out.println(convert(testString, 4));
        System.out.println(convert("TEST", 1));
        System.out.println(convert("TEST", 2));
        System.out.println(convert("A", 2));
    }
}
