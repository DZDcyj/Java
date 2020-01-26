package com.chin.leetcode.solutions;

import org.jetbrains.annotations.NotNull;

/**
 * @author Chin
 */
public class AvailableCapturesForRook {
    private static int numRookCaptures(@NotNull char[][] board) {
        int rookPosX = 0, rookPosY = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    rookPosX = i;
                    rookPosY = j;
                }
            }
        }
        int posX = rookPosX;
        int posY = rookPosY;
        int count = 0;
        while (posX < board.length) {
            posX++;
            if (board[posX][posY] == 'B') {
                break;
            } else if (board[posX][posY] == 'p') {
                count++;
                break;
            }
        }
        count = getCount(rookPosX, posY, count, board[posX], board);
        posX = rookPosX;
        while (posY < board[0].length) {
            posY++;
            if (board[posX][posY] == 'B') {
                break;
            } else if (board[posX][posY] == 'p') {
                count++;
                break;
            }
        }
        count = getCount(rookPosY, posY, count, board[posX], board);
        return count;
    }

    private static int getCount(int rookPosX, int posY, int count, char[] chars, char[][] board) {
        int posX;
        posX = rookPosX;
        while (posX > 0) {
            posX--;
            if (chars[posY] == 'B') {
                break;
            } else if (chars[posY] == 'p') {
                count++;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] board1 = {{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', 'R', '.', '.', '.', 'p'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}};
        System.out.println(numRookCaptures(board1));
    }
}
