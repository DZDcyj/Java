import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Solution_TriangleOfPascalTwo {
    @NotNull
    private static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        if (rowIndex == 0)
            return result;
        long temp = 1;
        int index = rowIndex;
        for (int i = 1; i <= rowIndex; i++) {
            temp *= index;
            temp /= i;
            result.add(Math.toIntExact(temp));
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
        System.out.println(getRow(30));
    }
}
