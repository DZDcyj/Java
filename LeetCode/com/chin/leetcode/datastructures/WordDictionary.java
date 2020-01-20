package com.chin.leetcode.datastructures;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;


/**
 * @author Chin
 */
public class WordDictionary {
    Node root;

    private class Node {
        Node[] children;
        boolean flag;

        Node() {
            children = new Node[26];
            flag = false;
            Arrays.fill(children, null);
        }
    }

    /**
     * Initialize your data structure here.
     */
    @Contract(pure = true)
    public WordDictionary() {
        root = new Node();
    }

    /**
     * Adds a word into the data structure.
     */

    // TODO: Add dot node inside
    public void addWord(@NotNull String word) {
        char[] array = word.toCharArray();
        Node cur = root;
        for (char c : array) {
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new Node();
            }
            cur = cur.children[c - 'a'];
        }
        cur.flag = true;
    }

    /**
     * Returns if the word in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(@NotNull String word) {
        return search(word, root);
    }

    private boolean search(String word, Node root) {
        char[] array = word.toCharArray();
        Node cur = root;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '.') {
                for (int j = 0; j < 26; j++) {
                    if (cur.children[j] != null) {
                        if (search(word.substring(i + 1), cur.children[j])) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (cur.children[array[i] - 'a'] == null) {
                return false;
            }
            cur = cur.children[array[i] - 'a'];
        }
        return cur.flag;
    }
}
