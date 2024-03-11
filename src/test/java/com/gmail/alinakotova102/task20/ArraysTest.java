package com.gmail.alinakotova102.task20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    @Test
    public void runAllTests() {
        ArraysTest arraysTest = new ArraysTest();
        arraysTest.averageTest();
        arraysTest.averageEmptyTest();
        arraysTest.averageNegativeElementsTest();
        arraysTest.averageNull();
        arraysTest.squareTest();
        arraysTest.squareNotTest();
        arraysTest.squareEmptyElementTest();
        arraysTest.squareAllEmptyTest();
        arraysTest.squareNull();
    }

    @Test
    void averageTest() {
        int[] array = {2, 4, 6, 8};

        double actual = Arrays.average(array);

        Assertions.assertEquals(5, actual);
    }

    @Test
    void averageEmptyTest() {
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
    void averageNull() {
        double actual = Arrays.average(null);

        Assertions.assertEquals(0.0, actual);
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
    void squareEmptyElementTest() {
        int[][] array = {{1, 2, 3}, {}};

        boolean actual = Arrays.square(array);

        Assertions.assertFalse(actual);
    }

    @Test
    void squareAllEmptyTest() {
        int[][] array = {{}, {}};

        boolean actual = Arrays.square(array);

        Assertions.assertFalse(actual);
    }

    @Test
    void squareNull() {
        boolean actual = Arrays.square(null);

        Assertions.assertFalse(actual);
    }

    @Test
    void squareNullElements() {
        int[][] array = {{1, 2}, null};

        boolean actual = Arrays.square(array);

        Assertions.assertFalse(actual);
    }

    @Test
    void squareNotSquare() {
        int[][] array = {{1, 2, 3}, {4}, {5, 6, 7}};

        boolean actual = Arrays.square(array);

        Assertions.assertFalse(actual);
    }
} 