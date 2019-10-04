public class Solution_LengthOfLastWord {
    private static int lengthOfLastWord(String s) {
        StringBuilder newstr = new StringBuilder(s).reverse();
        boolean characterExist = false;
        int len = 0;
        for (int i = 0; i < newstr.length(); i++) {
            if (!characterExist) {
                if (newstr.charAt(i) != ' ') {
                    characterExist = true;
                    len++;
                }
            } else {
                if (newstr.charAt(i) == ' ')
                    return len;
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String test = " a ";
        System.out.println(lengthOfLastWord(test));
    }
}
