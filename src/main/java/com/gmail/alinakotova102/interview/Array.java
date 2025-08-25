package com.gmail.alinakotova102.interview;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("{3,7,0,2,0} --> " + Arrays.toString(moveZero(new int[]{3, 7, 0, 2, 0})));
        System.out.println("{3,7,0,2,0} sort bubble personal --> " + Arrays.toString(bubbleSortPersonal(new int[]{3, 7, 0, 2, 0})));
        System.out.println("{3,7,0,2,0} sort bubble --> " + Arrays.toString(bubbleSort(new int[]{3, 7, 0, 2, 0})));
    }

    // перенести все 0 в конец и сохранить порядок чисел {3,7,0,2,0} -> {3,7,2,0,0}
    public static int[] moveZero(int[] num) {
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0){
                num[index++] = num[i];
            }
        }

        while (index < num.length)
            num[index++] = 0;
        return  num;
    }

    public static int[] bubbleSortPersonal(int[] num) {
            for (int j = 0; j < num.length-1; j++) {
                while (num[j]>num[j+1]) {
                    int save = num[j];
                    num[j] = num[j+1];
                    num[j+1] = save;
                    j=0;
                }
            }
        return num;
    }

    public static int[] bubbleSort(int[] num) {
        int size = num.length;

        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (num[j]> num[j+1]) {
                    int save = num[j];
                    num[j] = num[j+1];
                    num[j+1] = save;
                }
            }
        }

        return num;
    }
}
