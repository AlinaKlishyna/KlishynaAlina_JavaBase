package com.gmail.alinakotova102.task20;

public class Arrays {
    public static double average(int[] array) {
        if (array.length == 0) {
            System.out.println("This is by zero!");
            return 0.0;
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return (double) result / array.length;
    }

    public static boolean square(int[][] array) {
        if (array.length == 0) {
            System.out.println("This is by zero!");
            return false;
        }
        if (array.length == array[0].length) {
            return true;
        }
        return false;
    }
}