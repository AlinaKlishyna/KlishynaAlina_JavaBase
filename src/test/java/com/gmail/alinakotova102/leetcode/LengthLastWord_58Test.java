package com.gmail.alinakotova102.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthLastWord_58Test {
    LengthLastWord_58 test;

    @BeforeEach
    void setUp() {
        test = new LengthLastWord_58();
    }

    @Test
    void lengthOfLastWordCase01() {
        int actual = test.lengthOfLastWord("Hello World");

        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLastWordCase02() {
        int actual = test.lengthOfLastWord("   fly me   to   the moon  ");

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLastWordCase03() {
        int actual = test.lengthOfLastWord("luffy is still joyboy");

        int expected = 6;

        assertEquals(expected, actual);
    }
}