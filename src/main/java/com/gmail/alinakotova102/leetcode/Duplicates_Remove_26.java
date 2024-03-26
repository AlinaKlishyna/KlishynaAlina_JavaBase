package com.gmail.alinakotova102.leetcode;

import java.util.Arrays;

public class Duplicates_Remove_26 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{2, 3, 4, 4})));
        System.out.println(Arrays.toString(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4})));
    }
    public static int[] removeDuplicates(int[] nums) {
        int count = nums.length;
        System.out.println(count);
        for(int i = 0; i< nums.length; i++){
            for(int j = i; j < nums.length-1; j++){
                if(nums[i] == nums[j]){
                    nums[i+1] = nums[j+1];
                    count++;
                }

            }
        }
        System.out.println(count);
//        int[] expectedNums = new int[count];
//        for (int i = 0; i< expectedNums.length; i++){
//            if (nums[i] <=count){
//                expectedNums[i] = nums[i];
//            }
//
//        }
        return nums;
    }
}
