package com.gmail.alinakotova102.leetcode;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] save = nums1;
        nums1=new int[m+n];
        if (m<n){
            int val = n;
            n=m;
            m=val;
        }

        for (int i =0; i<m+n;i++){
            for (int j = 0; j < n; j++) {
                if (save[j] > nums2[j]){
                    nums1[i++]= save[j];
                }
            }
        }
        return nums1;
    }
}