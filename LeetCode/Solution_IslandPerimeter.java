import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Solution_IslandPerimeter {
    @Contract(pure = true)
    private static int islandPerimeter(@NotNull int[][] grid) {
        int length = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0)
                        length++;
                    if (i == grid.length - 1 || grid[i + 1][j] == 0)
                        length++;
                    if (j == 0 || grid[i][j - 1] == 0)
                        length++;
                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0)
                        length++;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[][] test = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(islandPerimeter(test));
    }

}
