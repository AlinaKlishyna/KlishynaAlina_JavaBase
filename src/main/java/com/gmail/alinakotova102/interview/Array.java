package com.gmail.alinakotova102.interview;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("{3,7,0,2,0} --> " + Arrays.toString(moveZero(new int[]{3, 7, 0, 2, 0})));
        System.out.println("{3,7,0,2,0} sort bubble personal --> " + Arrays.toString(bubbleSortPersonal(new int[]{3, 7, 0, 2, 0})));
        System.out.println("{3,7,0,2,0} sort bubble --> " + Arrays.toString(bubbleSort(new int[]{3, 7, 0, 2, 0})));

        //Input: nums = [3,6,1,0]
        //Output: 1
        //Explanation: 6 is the largest integer.
        //For every other number in the array x, 6 is at least twice as big as x.
        //The index of value 6 is 1, so we return 1.
        System.out.println("{3,6,1,0} dominant index --> " + dominantIndex(new int[]{3,6,1,0}));

        //Input: nums = [1,2,3,4]
        //Output: -1
        //Explanation: 4 is less than twice the value of 3, so we return -1.
        System.out.println("{1,2,3,4} dominant index --> " + dominantIndex(new int[]{1,2,3,4}));
        System.out.println("{1,0} dominant index --> " + dominantIndex(new int[]{1,0}));
        System.out.println("{0,0,1,2} dominant index --> " + dominantIndex(new int[]{0,0,1,2}));
    }


    public static int dominantIndex(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num>max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);

        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max == nums[i]) {
                maxIndex = i;
            }
        }
        System.out.println("Max Index: " + maxIndex);

        boolean dominant = true;
        for (int num : nums) {
            if (num != max) {
                if (num*2 > max) {
                    dominant = false;
                }
            }
        }
        return dominant ? maxIndex : -1;
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
