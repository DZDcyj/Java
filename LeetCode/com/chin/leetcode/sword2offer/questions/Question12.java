package com.chin.leetcode.sword2offer.questions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/**
 * @author Chin
 */
public class Question12 {

    /**
     * This function checks whether the word can be combined with letters in the given board
     *
     * @param board The given board, all letters must be come from it
     * @param word  The target word
     * @return If the word can be found in the board
     * <p>
     * Sample input:
     * <p>
     * 1.
     * board =
     * [
     * ["A","B","C","E"],
     * ["S","F","C","S"],
     * ["A","D","E","E"]
     * ]
     * <p>
     * word = "ABCDEF"
     * <p>
     * 2.
     * board =
     * [
     * ["a","b"],
     * ["c","d"]
     * ]
     * <p>
     * word = "abcd"
     * <p>
     * Sample output:
     * 1. true
     * 2. false
     */
    public boolean exist(@NotNull char[][] board, @NotNull String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(@NotNull char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) {
            return false;
        }
        if (k == word.length - 1) {
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '/';
        boolean result = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1)
                || dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = temp;
        return result;
    }

    @TestOnly
    public static void main(String[] args) {
        char[][] board1 = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        char[][] board2 = {{'a', 'b'}, {'c', 'd'}};
        Question12 question12 = new Question12();
        System.out.println(question12.exist(board1, "ABCCED"));
        System.out.println(question12.exist(board2, "abcd"));
    }
}
