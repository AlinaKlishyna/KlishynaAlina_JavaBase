package com.gmail.alinakotova102.leetcode;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,2,3}, 3, new int[]{2,5,6},3)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[]save = nums1;
        nums1 = new int[m + n];
        //объединение массив в nums1
        for (int i = 0; i < m+n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (i < m) {
                    nums1[i] = save[i];
                } else {
                    nums1[i++] = nums2[j];
                }
            }
        }
        //сортировка
        for (int i = 0; i < nums1.length-1; i++) {
            if (nums1[i] > nums1[i+1]){
                int val = nums1[i];
                nums1[i] = nums1[i+1];
                nums1[i+1] = val;
            }
        }
        return nums1;
    }
}
