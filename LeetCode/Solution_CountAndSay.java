public class Solution_CountAndSay {
    public static String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = Solution_CountAndSay.getNewString(result);
        }
        return result;
    }

    private static String getNewString(String prev) {
        // TODO
        if (prev.length() == 0)
            return "";
        else if (prev.length() == 1)
            return "1" + prev;
        String result = "";
        char curr = prev.charAt(0);
        int num = 1;
        int index = 1;
        while (index < prev.length()) {
            if (prev.charAt(index) == curr) {
                num++;
            } else {
                result = "" + num + curr;
                num = 1;
                curr = prev.charAt(index);
            }
            index++;
        }
        result = "" + num + curr;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(4));
    }
}
