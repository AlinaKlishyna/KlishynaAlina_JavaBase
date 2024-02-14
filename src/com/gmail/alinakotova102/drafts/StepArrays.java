package com.gmail.alinakotova102.drafts;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepArrays {
    public static void main(String[] args) {
        int countRows = enterNumber();
        int maxCount = enterNumber();
        int[][] numbers = createArray(countRows, maxCount);
        displayConsole(numbers);
    }

    public static void displayConsole(int[][] array){
        for (int[] element: array){
            System.out.print(Arrays.toString(element));
        }
        System.out.println();
    }

    public static int[][] createArray(int length, int countInRow){
        int[][] numbersRandom = new int[length][countInRow];
        for (int i =0; i < numbersRandom.length; i++){
            for (int j =0; j<numbersRandom[i].length; j++){
                numbersRandom[i][j] = ThreadLocalRandom.current().nextInt(0, countInRow);
            }
        }
        return numbersRandom;
    }

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0 && number < 999) {
                    return number;
                } else {
                    System.out.print("Enter a number between [1-999]: ");
                }
            } else {
                System.out.print("Value non valid! Enter again: ");
                scanner.nextLine();
            }
        }
    }
}
