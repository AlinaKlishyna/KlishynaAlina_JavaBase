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
        System.out.println("\nMinimal element in row: ");
        displayConsole(minElement);

        int absoluteMinElement = absoluteMin(array);
        System.out.println("\nAbsolute minimal element: " + absoluteMinElement);
    }

    public static int absoluteMin(int[][] array) {
        int[] arrayMinNumbers = minElementInRow(array);
        int init = arrayMinNumbers[0];
        for (int i = 0; i < arrayMinNumbers.length; i++) {
            if (arrayMinNumbers[i] < init) {
                init = arrayMinNumbers[i];
            }
        }
        return init;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int[] minElementInRow(int[][] array) {
        int[] modArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int init = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < init) {
                    init = min(array[i]);
                }
            }
            modArray[i] = init;
        }
        return modArray;
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

    public static int[][] swap(int[][] array, int row, int column, int newColumn) {
        int saveNumber = array[row][column + 1];
        array[row][column + 1] = array[row][newColumn];
        array[row][newColumn] = saveNumber;
        return array;
    }

    public static int[][] sortGrowth(int[][] array, int index) {
        for (int j = 0; j < array[index].length - 1; j++) {
            for (int k = 0; k < array[index].length - 1; k++) {
                if (array[index][k] > array[index][j + 1]) {
                    swap(array, index, j, k);
                }
            }
        }
        return array;
    }

    public static int[][] sortDecline(int[][] array, int index) {
        for (int j = 0; j < array[index].length - 1; j++) {
            for (int k = 0; k < array[index].length - 1; k++) {
                if (array[index][k] < array[index][j + 1]) {
                    swap(array, index, j, k);
                }
            }
        }
        return array;
    }

    public static int[][] sortEvenOdd(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0) {
                sortGrowth(array, i);
            } else {
                sortDecline(array, i);
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
                numbersRandom[i][j] = ThreadLocalRandom.current().nextInt(10, 20);
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