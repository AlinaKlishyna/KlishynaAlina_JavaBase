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
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] == null || array[i].length == 0)) {
                if (array.length == array[i].length) {
                    j++;
                }
            }
        }
        if (j == array.length) {
            return true;
        }
        return false;
    }
}