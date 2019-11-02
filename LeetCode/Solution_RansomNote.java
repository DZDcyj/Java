import org.jetbrains.annotations.NotNull;

import java.util.Hashtable;

public class Solution_RansomNote {
    private static boolean canConstruct(String ransomNote, @NotNull String magazine) {
        int[] letters = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            letters[magazine.charAt(i) - 'a']++;
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            int index = ransomNote.charAt(j) - 'a';
            if (letters[index] == 0)
                return false;
            letters[index]--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}
