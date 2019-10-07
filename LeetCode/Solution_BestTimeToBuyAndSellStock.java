import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution_BestTimeToBuyAndSellStock {
    @Contract(pure = true)
    private static int maxProfit(@NotNull int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (price < min)
                min = price;
            else if (price - min > profit)
                profit = price - min;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] stocks1 = {7, 1, 5, 3, 6, 4};
        int[] stocks2 = {7, 6, 4, 3, 1};
        int[] stocks3 = {2, 1};
        System.out.println(maxProfit(stocks1));
        System.out.println(maxProfit(stocks2));
        System.out.println(maxProfit(stocks3));
    }
}
