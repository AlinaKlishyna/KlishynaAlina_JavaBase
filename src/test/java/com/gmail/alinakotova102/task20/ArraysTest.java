package com.gmail.alinakotova102.task20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void runAllTests(){
        ArraysTest arraysDemoTest = new ArraysTest();
        arraysDemoTest.averageTest();
        arraysDemoTest.averageZeroTest();
    }

    @Test
    void averageTest(){
        int[] array = {2, 4, 6, 8};
        double actual = Arrays.average(array);

        double expected = 5;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageZeroTest(){
        int[] arr = {};
        double actual = Arrays.average(arr);

        double expected = 0.0;
        System.out.println("Actual value: " + actual + " - Expected: " + expected);
        Assertions.assertEquals(expected, actual);
    }
}