package com.gmail.alinakotova102.corsoRanstad;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Scrivi la dimensione di un array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i<numbers.length;i++) {
            numbers[i] = scanner.nextInt();
        }


        for (int i = 0; i<numbers.length-1;i++) {
           if (numbers[i] < numbers[i+1]) {
               int save = numbers[i];
               numbers [i] = numbers[i+1];
               numbers[i+1] = save;
               i=0;
           }
        }

        System.out.println(Arrays.toString(numbers) + " - max: " + numbers[0] + " min: " + numbers[numbers.length-1]);
    }
}
