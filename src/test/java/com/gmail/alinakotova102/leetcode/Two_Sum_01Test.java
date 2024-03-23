package com.gmail.alinakotova102.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Two_Sum_01Test {
    Two_Sum_01 twoSum01;

    @BeforeEach
    void setUp() {
        twoSum01 = new Two_Sum_01();
    }

    @Test
    @DisplayName("Simple values should work with the beginning")
    void case01() {
        int[] actual = twoSum01.twoSum(new int[]{2, 7, 11, 15}, 9);

        int[] expected = {0, 1};

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Simple values should work with the end")
    void case02() {
        int[] actual = twoSum01.twoSum(new int[]{3, 2, 4}, 6);

        int[] expected = {1, 2};

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Simple values with minimum array length")
    void case03() {
        int[] actual = twoSum01.twoSum(new int[]{3, 3}, 6);

        int[] expected = {0, 1};

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Zero values")
    void case04() {
        int[] actual = twoSum01.twoSum(new int[]{3, 2, 3}, 6);

        int[] expected = {0, 2};

        assertArrayEquals(expected, actual);
    }
}