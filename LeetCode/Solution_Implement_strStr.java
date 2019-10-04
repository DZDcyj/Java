public class Solution_Implement_strStr {
    private static int strStr(String haystack, String needle) {
        if (needle.equals(""))
            return 0;
        if (haystack.length() < needle.length())
            return -1;
        if (haystack.equals(needle))
            return 0;
        int index = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(index) && haystack.length() - i >= needle.length()) {
                boolean complete = true;
                while (index < needle.length()) {
                    if (haystack.charAt(i + index) != needle.charAt(index)) {
                        complete = false;
                    }
                    index++;
                }
                if (complete)
                    return i;
            }
            index = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] test1 = {"hello", "ll"};
        String[] test2 = {"aaaaa", "bba"};
        System.out.println(strStr(test1[0], test1[1]));
        System.out.println(strStr(test2[0], test2[1]));
        System.out.println(strStr("asda", "aa"));
        System.out.println(strStr("mississippi", "pi"));
        System.out.println(strStr("a", "a"));
    }
}
