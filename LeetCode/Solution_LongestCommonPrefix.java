public class Solution_LongestCommonPrefix {
    private static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 1)
            return strs[0];
        else if (strs.length == 0)
            return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char temp = strs[0].charAt(i);
            boolean same = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == result.length() || strs[j].charAt(i) != temp) {
                    same = false;
                    break;
                }
            }
            if (same)
                result += temp;
            else
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] test1 = {"flower", "flow", "flight"};
        String[] test2 = {"dog", "racecar", "car"};
        String[] test3 = {"avcdddd", "avcddddfg", "avcdddde"};
        String[] test4 = {"aa","a"};
        System.out.println(longestCommonPrefix(test1));
        System.out.println(longestCommonPrefix(test2));
        System.out.println(longestCommonPrefix(test3));
        System.out.println(longestCommonPrefix(test4));
    }
}
