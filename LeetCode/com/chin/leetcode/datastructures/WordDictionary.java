package com.chin.leetcode.datastructures;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;


/**
 * @author Chin
 */
public class WordDictionary {

    private Node root;

    private class Node {
        private char letter;
        private List<Node> nodes;

        @Contract(pure = true)
        Node(char letter) {
            this.letter = letter;
            this.nodes = new ArrayList<>();
        }
    }

    /**
     * Initialize your data structure here.
     */
    @Contract(pure = true)
    public WordDictionary() {
        root = new Node('.');
    }

    /**
     * Adds a word into the data structure.
     */

    // TODO: Add dot node inside

    public void addWord(@NotNull String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            Node nextNode = null;
            for (Node node : curr.nodes) {
                if (node.letter == letter) {
                    nextNode = node;
                }
            }
            if (nextNode == null) {
                nextNode = new Node(letter);
            }
            curr.nodes.add(nextNode);
            curr = nextNode;
        }
    }

    /**
     * Returns if the word in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(@NotNull String word) {
        if (word.length() == 0) {
            return true;
        }
        char letter = word.charAt(0);
        Node curr = root;
        Node realRoot = root;

        for (Node node : curr.nodes) {
            if (node.letter == letter) {
                root = node;
                boolean result = search(word.substring(1));
                if (result) {
                    root = realRoot;
                    return true;
                }
            }
        }
        root = realRoot;
        return false;
    }
}
