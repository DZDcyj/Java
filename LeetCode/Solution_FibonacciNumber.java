import org.jetbrains.annotations.Contract;

public class Solution_FibonacciNumber {
    @Contract(pure = true)
    private static int fib(int N) {
        int[] fibs = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040};
        return fibs[N];
    }

    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(2));
    }
}
