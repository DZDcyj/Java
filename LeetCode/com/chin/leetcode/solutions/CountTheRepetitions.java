package com.chin.leetcode.solutions;

/**
 * @author Chin
 */
public class CountTheRepetitions {
    /**
     * @param n1 The repeat times of s1
     * @param n2 The repeat times of s2
     *           <p>
     *           Example:
     *           s1 = "abc", n1 = 2
     *           Then the real "s1" is "abcabc"
     */
    private static int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 == 0 || len2 == 0 || n1 == 0 || n2 == 0) {
            return 0;
        }
        char[] characters1 = s1.toCharArray();
        char[] characters2 = s2.toCharArray();

        int index = 0;
        int count = 0;
        int[] countRec = new int[len2 + 1];
        int[] indexRec = new int[len2 + 1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < len1; j++) {
                if (characters1[j] == characters2[index]) {
                    ++index;
                }
                if (index == characters2.length) {
                    index = 0;
                    ++count;
                }
            }
            countRec[i] = count;
            indexRec[i] = index;
            for (int j = 0; j < i && indexRec[j] == index; j++) {
                int pre = countRec[j];
                int pat = (n1 - 1 - j) / (i - j) * (countRec[i] - countRec[j]);
                int remain = countRec[j + (n1 - 1 - j) % (i - j)] - countRec[j];
                return (pre + pat + remain) / n2;
            }
        }
        return countRec[n1 - 1] / n2;
    }

    public static void main(String[] args) {
        System.out.println(getMaxRepetitions("acb", 4, "ab", 2));
    }
}
