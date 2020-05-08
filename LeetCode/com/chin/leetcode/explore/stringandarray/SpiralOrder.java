package com.chin.leetcode.explore.stringandarray;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chin
 */
public class SpiralOrder {
    private static @NotNull List<Integer> spiralOrder(int[] @NotNull [] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0) {
            return ans;
        }
        int r = matrix.length, c = matrix[0].length;
        boolean[][] seen = new boolean[r][c];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r1 = 0, c1 = 0, di = 0;
        for (int i = 0; i < r * c; i++) {
            ans.add(matrix[r1][c1]);
            seen[r1][c1] = true;
            int cr = r1 + dr[di];
            int cc = c1 + dc[di];
            if (0 <= cr && cr < r && 0 <= cc && cc < c && !seen[cr][cc]) {
                r1 = cr;
                c1 = cc;
            } else {
                di = (di + 1) % 4;
                r1 += dr[di];
                c1 += dc[di];
            }
        }
        return ans;
    }
}
