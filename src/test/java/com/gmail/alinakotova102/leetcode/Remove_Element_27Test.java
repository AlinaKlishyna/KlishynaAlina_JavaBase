package com.gmail.alinakotova102.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Remove_Element_27Test {
    Remove_Element_27 removeElement27;

    @BeforeEach
    void setUp() {
        removeElement27 = new Remove_Element_27();
    }

    @Test
    void removeElementCase01() {
        int[] actual = removeElement27.removeElement(new int[]{3, 2, 2, 3}, 3);

        int[] expected = {2, 2, 2, 3};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeElementCase02() {
        int[] actual = removeElement27.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);

        int[] expected = {0, 1, 3, 0, 4, 0, 4, 2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeElementCase03() {
        int[] actual = removeElement27.removeElement(new int[]{5, 4}, 5);

        int[] expected = {4, 4};

        assertArrayEquals(expected, actual);
    }
}