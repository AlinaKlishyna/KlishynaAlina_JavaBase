package com.gmail.alinakotova102.interview;

import java.math.BigInteger;
import java.util.*;

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
        System.out.println("{3,6,1,0} dominant index --> " + dominantIndex(new int[]{3, 6, 1, 0}));

        //Input: nums = [1,2,3,4]
        //Output: -1
        //Explanation: 4 is less than twice the value of 3, so we return -1.
        System.out.println("{1,2,3,4} dominant index --> " + dominantIndex(new int[]{1, 2, 3, 4}));
        System.out.println("{1,0} dominant index --> " + dominantIndex(new int[]{1, 0}));
        System.out.println("{0,0,1,2} dominant index --> " + dominantIndex(new int[]{0, 0, 1, 2}));

        System.out.println("{9,9,9} plus one -->" + Arrays.toString(plusOne(new int[]{9, 9, 9})));
        System.out.println("{9,9,9,8} plus one -->" + Arrays.toString(plusOne(new int[]{9, 9, 9, 8})));

        System.out.println("12345 reverse--> " + reverse(12345));
        System.out.println("12345 reverse %2--> " + reverseSecond(12345));

        System.out.println("is palindrome? -121 --> " + isPalindrome(-121));
        System.out.println("is palindrome? 121 --> " + isPalindrome(121));

        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
        System.out.println("----" + Arrays.toString(removeDuplicate(new int[]{1,1,2})));

        System.out.println(Arrays.toString(removeDuplicateSecond(new int[]{0,1,1,2,2,3})));
        System.out.println(Arrays.toString(removeDuplicateSecond(new int[]{0,1,2,2,3,3,4,4,4,5,5,6})));
        System.out.println(removeDuplicateThird(new int[]{1,1,2}));
        System.out.println(Arrays.toString(twoSumOther(new int[]{2,1,7,11,15}, 9)));

        System.out.println("a#bc#d буква#--> " + backspace("a#bc#d"));

        System.out.println(addStrings("22", "22"));

        System.out.println("3, 44, 23, 11, 0, 1, 2, 6, 1, 0 --> " + Arrays.toString(bubbleSortOther(new int[]{3, 44, 23, 11, 0, 1, 2, 6, 1, 0})));
    }

    public static int[] bubbleSortOther(int[] nums){
        boolean swap = false;
        while (!swap) {
            swap = true;
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i]>nums[i+1]) {
                    int save = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = save;
                    swap = false;
                }
            }
        }
        return nums;
    }

    public static String addStrings(String num1, String num2) {
        return String.valueOf(new BigInteger(num1).add(new BigInteger(num2)));
    }

    // допустим есть строка a#bc#d --> bd
    public static String backspace(String example) {
        String result = "";
        for (String line : example.split("\\w#+")) {
            result+=line;
        }
        return result;
    }

    public static int[] twoSumOther(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.get(difference) != null) {
                return new int[]{map.get(difference), i};
            }

            map.put(nums[i], i);
        }
        return nums;
    }

    public static int removeDuplicateThird(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j-1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    // Input: nums = [1,1,2]
    // Output: 2, nums = [1,2,_]
    public static int[] removeDuplicateSecond(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        int index = 1;
        for (int num : nums) {
            if (result[index-1]<num) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static int[] removeDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }

        int[] res = new int[set.size()];
        int index = 0;
        for (int num : set) {
            res[index++] = num;
        }
        return res;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i<nums.length; i++) {
            for(int j = 0; j<nums.length-1; j++) {
                if(nums[i] + nums[j+1] == target) {
                    result[0] = i;
                    result[1] = j+1;
                }
            }
        }

        return result;
    }

    public static boolean isPalindrome(int x) {
        var digit = 0;
        var reverse = 0;
        int save = x;
        while(x!=0) {
            digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        System.out.println(reverse);
        System.out.println(save);

        return save==reverse;
    }

    public static int reverse(int num) {
        var result = 0L;
        var digit = 0;

        while (num != 0) {
            digit = num % 10; // take the last number
            result = result * 10 + digit; // add digit
            num = num / 10; //remove the last number
        }
        return (int) result;
    }

    public static int reverseSecond(int num) {
        String[] strs = String.valueOf(Math.abs(num)).split("");
        int index = strs.length - 1;
        String[] res = new String[strs.length];
        for (String str : strs) {
            res[index--] = str;
        }
        String r = "";
        for (String rs : res) {
            r += rs;
        }
        int result = Integer.parseInt(r);
        return num > 0 ? result : Math.negateExact(result);
    }

    public static int[] plusOne(int[] digits) {
        String string = new String();
        for (int num : digits) {
            string += num;
        }
        string = String.valueOf(Long.valueOf(string) + 1);

        int[] numbers = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(string.charAt(i)));
        }
        return numbers;
    }

    public static int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Max Index: " + maxIndex);

        boolean dominant = true;
        for (int num : nums) {
            if (num != max) {
                if (num * 2 > max) {
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
            if (num[i] != 0) {
                num[index++] = num[i];
            }
        }

        while (index < num.length)
            num[index++] = 0;
        return num;
    }

    public static int[] bubbleSortPersonal(int[] num) {
        for (int j = 0; j < num.length - 1; j++) {
            while (num[j] > num[j + 1]) {
                int save = num[j];
                num[j] = num[j + 1];
                num[j + 1] = save;
                j = 0;
            }
        }
        return num;
    }

    public static int[] bubbleSort(int[] num) {
        int size = num.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int save = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = save;
                }
            }
        }

        return num;
    }
}
