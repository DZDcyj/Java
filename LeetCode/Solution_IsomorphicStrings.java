import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Solution_IsomorphicStrings {
    private static boolean isIsomorphic(@NotNull String s, String t) {
        if (s.length() == 0 && t.length() == 0)
            return true;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charOfs = s.charAt(i);
            char charOft = t.charAt(i);
            if (map.containsKey(charOfs)) {
                if (map.get(charOfs) != charOft)
                    return false;
            } else {
                if (map.containsValue(charOft))
                    return false;
                map.put(charOfs, charOft);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("ab", "aa"));
    }
}
