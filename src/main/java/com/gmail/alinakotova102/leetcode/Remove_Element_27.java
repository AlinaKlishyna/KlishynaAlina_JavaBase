package com.gmail.alinakotova102.leetcode;

public class Remove_Element_27 {
//        int[] nums = [...]; // Input array
//        int val = ...; // Value to remove
//        int[] expectedNums = [...]; // The expected answer with correct length.
//        // It is sorted with no values equaling val.
//
//        int k = removeElement(nums, val); // Calls your implementation
//
//        assert k == expectedNums.length;
//        sort(nums, 0, k); // Sort the first k elements of nums
//        for (int i = 0; i < actualLength; i++) {
//            assert nums[i] == expectedNums[i];

    public int[] removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return nums;
    }
}