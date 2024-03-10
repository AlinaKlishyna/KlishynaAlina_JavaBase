package com.gmail.alinakotova102.task20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void runAllTests() {
        ArraysTest arraysTest = new ArraysTest();
        arraysTest.averageTest();
        arraysTest.averageNullTest();
    }

    @Test
    void averageTest() {
        int[] array = {2, 4, 6, 8};
        double actual = Arrays.average(array);

        double expected = 5;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageNullTest() {
        int[] array = {};
        double actual = Arrays.average(array);

        double expected = 0.0;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageNegativeElementsTest() {
        int[] array = {2, 4, -6, 8};
        double actual = Arrays.average(array);

        double expected = 2;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageZeroElementsTest() {
        int[] array = {2, 4, 0, 8};
        double actual = Arrays.average(array);

        double expected = 3.5;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void squareTest() {
        int[][] array = {{1, 2}, {1, 2}};
        boolean actual = Arrays.square(array);

        boolean expected = true;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void squareNotTest() {
        int[][] array = {{1, 2, 3}, {1, 2, 3}};
        boolean actual = Arrays.square(array);

        boolean expected = false;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void squareNullTest() {
        int[][] array = {{1, 2, 3}, {}};
        boolean actual = Arrays.square(array);

        boolean expected = false;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void squareAllNullTest() {
        int[][] array = {{}, {}};
        boolean actual = Arrays.square(array);

        boolean expected = false;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }
} 