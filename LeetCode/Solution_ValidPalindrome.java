public class Solution_ValidPalindrome {
    private static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        s = s.toLowerCase();
        int lo = 0, hi = s.length() - 1;
        boolean allSymbol = true;
        for (int i = 0; i < s.length(); i++) {
            if ((((s.charAt(i) >= '0' && s.charAt(i) <= '9') || ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))))) {
                allSymbol = false;
                break;
            }
        }
        if (allSymbol)
            return true;
        while (lo < hi) {
            while (!((s.charAt(lo) >= '0' && s.charAt(lo) <= '9') || ((s.charAt(lo) >= 'a' && s.charAt(lo) <= 'z')))) {
                if (!(lo < hi))
                    break;
                lo++;

            }
            while (!((s.charAt(hi) >= '0' && s.charAt(hi) <= '9') || (s.charAt(hi) >= 'a' && s.charAt(hi) <= 'z'))) {
                if (!(lo < hi))
                    break;
                hi--;
            }
            if (s.charAt(hi) != s.charAt(lo)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(".,"));
        System.out.println(isPalindrome("Telegram, Margelet!"));
        System.out.println(isPalindrome(",; W;:GlG:;l ;,"));
    }
}
