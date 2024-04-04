package com.gmail.alinakotova102.leetcode;

import java.util.Arrays;

public class Duplicates_Remove_26 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{2, 3, 4, 4})));
        System.out.println(Arrays.toString(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4})));
    }
    public static int[] removeDuplicates02(int[] nums) {
        int count = 0;
        int[] expectedNums = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            for(int j = i; j < nums.length-1; j++) {
//                if(nums[i] == nums[j] ){
//                    nums[i+1] = nums[j+1];
//                    expectedNums[i] = nums[i];
//
//                }

                if (nums[i] == nums[j+1]) {
                    j+=1;
                    expectedNums[i] = nums[i];
                }
                if (nums[i] >= nums[j+1]){
                    count++;
                }
            }
        }
        System.out.println(count);
        return nums;
    }









    public static int[] removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length-1; j++) {
                if (nums[i++] == nums[j++]) {
                    int save  = nums[i++];
                    count++;
                    System.out.println(save);
                }
            }
        }
        return nums;
    }
}
