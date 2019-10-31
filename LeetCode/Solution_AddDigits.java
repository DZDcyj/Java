import org.jetbrains.annotations.Contract;

public class Solution_AddDigits {
    /**
     * @author 陈越
     * @date 2019/10/29
     * How does this function work?
     * Why does this function work properly?
     *
     * */

    @Contract(pure = true)
    private static int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
