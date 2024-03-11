package com.gmail.alinakotova102.task20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    @Test
    public void runAllTests() {
        ArraysTest arraysTest = new ArraysTest();
        arraysTest.averageTest();
        arraysTest.averageNullTest();
        arraysTest.averageNegativeElementsTest();
        arraysTest.averageZeroElementsTest();
        arraysTest.squareTest();
        arraysTest.squareNotTest();
        arraysTest.squareNullTest();
        arraysTest.squareAllNullTest();
    }

    @Test
    void averageTest() {
        int[] array = {2, 4, 6, 8};

        double actual = Arrays.average(array);

        Assertions.assertEquals(5, actual);
    }

    @Test
    void averageNullTest() {
        int[] array = {};

        double actual = Arrays.average(array);

        Assertions.assertEquals(0.0, actual);
    }

    @Test
    void averageNegativeElementsTest() {
        int[] array = {2, 4, -6, 8};

        double actual = Arrays.average(array);

        Assertions.assertEquals(2, actual);
    }

    @Test
    void averageZeroElementsTest() {
        int[] array = {2, 4, 0, 8};

        double actual = Arrays.average(array);

        Assertions.assertEquals(3.5, actual);
    }

    @Test
    void squareTest() {
        int[][] array = {{1, 2}, {1, 2}};

        boolean actual = Arrays.square(array);

        Assertions.assertTrue(actual);
    }

    @Test
    void squareNotTest() {
        int[][] array = {{1, 2, 3}, {1, 2, 3}};

        boolean actual = Arrays.square(array);

        Assertions.assertFalse(actual);
    }

    @Test
    void squareNullTest() {
        int[][] array = {{1, 2, 3}, {}};

        boolean actual = Arrays.square(array);

        Assertions.assertFalse(actual);
    }

    @Test
    void squareAllNullTest() {
        int[][] array = {{}, {}};

        boolean actual = Arrays.square(array);

        Assertions.assertFalse(actual);
    }
} 