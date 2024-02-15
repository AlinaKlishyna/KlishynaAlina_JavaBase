package com.gmail.alinakotova102.drafts;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepArrays {
    public static void main(String[] args) {
        System.out.println("Creation of a stepped array with random numbers");
        System.out.print("Enter N - the number of lines: ");
        int countRows = enterNumber();
        System.out.print("Enter M - the maximum number of elements in a row: ");
        int maxCount = enterNumber();

        int[][] array = createArray(countRows, maxCount);
        System.out.println("\nInitial array");
        displayConsole(array);

        System.out.println("\nModified array");
        int[][] arraySorted = sortEvenOdd(array);
        displayConsole(arraySorted);

        int sumElements = sumElements(array);
        System.out.println("Sum of elements: " + sumElements);

        int[] minElement = minElementInRow(array);
        System.out.println("Minimal element in row: ");
        displayConsole(minElement);
    }

    public static int[] minElementInRow(int[][] array) {
        int[] min = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min[i])
                    min[i] = array[i][j];
            }
        }
        return min;
    }

    public static int sumElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static int[][] sortEvenOdd(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                for (int k = 0; k < array[i].length - i; k++) {
                    if ((i + 1) % 2 == 0) {
                        while (array[i][k] > array[i][j + 1]) {
                            int saveNumber = array[i][j + 1];
                            array[i][j + 1] = array[i][k];
                            array[i][k] = saveNumber;
                        }
                    } else {
                        while (array[i][k] < array[i][j + 1]) {
                            int saveNumber = array[i][j + 1];
                            array[i][j + 1] = array[i][k];
                            array[i][k] = saveNumber;
                        }
                    }
                }
            }
        }
        return array;
    }

    public static void displayConsole(int[][] array) {
        for (int[] element : array) {
            System.out.print(Arrays.toString(element) + "\n");
        }
        System.out.println();
    }

    public static void displayConsole(int[] array) {
        System.out.print("[");
        int count = 0;
        for (int element : array) {
            System.out.print(element);
            if (count < array.length - 1) {
                System.out.print(", ");
            }
            count++;
        }
        System.out.println("]");
    }

    public static int[][] createArray(int length, int countInRow) {
        int[][] numbersRandom = new int[length][countInRow];
        for (int i = 0; i < numbersRandom.length; i++) {
            for (int j = 0; j < numbersRandom[i].length; j++) {
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
                if (number >= 0 && number < 999) {
                    return number;
                } else {
                    System.out.print("Enter a number between [1-999]: ");
                }
            } else {
                System.out.print("Value non valid! Enter again: ");
            }
            scanner.nextLine();
        }
    }
}