package com.gmail.alinakotova102.leetcode;

public class Two_Sum_01 {
//    1. Two Sum

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same
//    element twice.
//    You can return the answer in any order.

//            Example 1:
//    Input: nums = [2,7,11,151, target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums [1] = 9, we return [0, 1].

//            Example 2:
//    Input: nums = [3,2,41, target = 6
//    Output: [1,2]

    //            Example 3:
//    Input: nums = [3,31, target = 6
//    Output: [0,1]
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] + nums[j + 1] == target) {
                    return new int[]{i, j + 1};
                }
            }
        }
        return null;
    }
}