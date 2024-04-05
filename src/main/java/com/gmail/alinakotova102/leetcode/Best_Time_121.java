package com.gmail.alinakotova102.leetcode;

public class Best_Time_121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));;
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{1,2}));;
        System.out.println(maxProfit(new int[]{1,2,4}));;
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length-1; j++){
                if (prices[j+1]> prices[i]){
                    profit -=  prices[j+1];
                }
                if (prices[i] < prices[j+1]){
                   profit=prices[i];
                }

                i++;
            }
        }
        return profit;
    }
}