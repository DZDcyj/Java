public class Solution_ExcelSheetColumnTitle {
    private static String convertToTitle(int n) {
        String Letters = "#ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] Chars = Letters.toCharArray();
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            if (n % 26 == 0) {
                result.append('Z');
                n = n / 26 - 1;
            } else {
                result.append(Chars[n % 26]);
                n = n / 26;
            }
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(702));
    }
}
