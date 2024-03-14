package com.gmail.alinakotova102.task20;

public class Arrays {

    public static double average(int[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return (double) result / array.length;
    }

    public static boolean square(int[][] array) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == null || array[i + 1] == null) {
                return false;
            }
            if (array[i].length == 0) {
                return false;
            }
            if (array[i + 1].length == array[i].length) {
                return true;
            }
        }
        return false;
    }
}