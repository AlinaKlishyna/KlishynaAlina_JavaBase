package com.gmail.alinakotova102.leetcode;

public class LengthLastWord_58 {
    /**
     *Given a string s consisting of words and spaces, return the length of the last word in the string.
     *
     * A word is a maximal substring consisting of non-space characters only.
     */

    public int lengthOfLastWord(String s) {
        char[] newText = s.trim().toCharArray();
        int index = 0;
        for (int i = 0; i < newText.length; i++) {
            if (newText[i] == ' ') {
                index = i;
            }
        }
        if (!(index > 0)) {
            return s.trim().length();
        }
        return s.trim().substring((index + 1)).length();
    }
}