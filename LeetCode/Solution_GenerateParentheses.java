import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Solution_GenerateParentheses {
    private static List<String> generateParenthesis(int n) {
        List<String> list = new CopyOnWriteArrayList<>();
        if (n == 0)
            return list;
        list.add("()");
        for (int i = 1; i < n; i++) {
            for (String str : list) {
                list.add("()" + str);
                list.add("(" + str + ")");
                list.add(str + "()");
                list.remove(str);
            }
        }
        HashSet<String> hashSet = new HashSet<>(list);

        list.clear();
        list.addAll(hashSet);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(4));
    }
}
