package com.gmail.alinakotova102.corsoRanstad;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
            sum = 0;
        }
    }
}
