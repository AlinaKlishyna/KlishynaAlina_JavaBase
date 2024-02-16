package com.gmail.alinakotova102.drafts;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepArrays {
    public static Integer NOT_DEFINE = null;
    public static void main(String[] args) {
        System.out.println("Creation of a stepped array with random numbers");
        System.out.print("Enter N - the number of lines: ");
        int countRows = enterNumberBetween();
        System.out.print("Enter M - the maximum number of elements in a row: ");
        int maxCount = enterNumber();
        while (!(maxCount >= 0)) {
            System.out.println("Enter a number greater than 0: ");
            maxCount = enterNumber();
        }

        System.out.print("\nEnter number for create array with random numbers\nMin number: ");
        int minRandom = enterNumber();
        System.out.print("Max number: ");
        int maxRandom = enterNumber();
        while (maxRandom - minRandom == 1 || maxRandom == minRandom) {
            System.out.println("Error! There is no range between numbers\nMax number: ");
            maxRandom = enterNumber();
        }

        int[][] array = createArray(countRows, maxCount);
        array = fillArray(array, minRandom, maxRandom);

        System.out.println("\nInitial array");
        displayConsole(array);

        System.out.println("Modified array");
        int[][] arraySorted = sortEvenOdd(array);
        displayConsole(arraySorted);

        int sumElements = sumElements(array);
        System.out.println("Sum of elements: " + sumElements);

        Integer[] minElement = minElementInRow(array);
        System.out.print("\nMinimal element in row: ");
        displayConsole(minElement);

        int absoluteMinElement = absoluteMin(array);
        System.out.println("\nAbsolute minimal element: " + absoluteMinElement);

        System.out.println("\nDividing by the absolute minimum: ");
        System.out.print(divideByAbsoluteMin(array, absoluteMinElement));
    }

    public static boolean divisionCheck(int number, int divisionNumber) {
        if (number % divisionNumber == 0) {
            return true;
        }
        return false;
    }

    public static String divideByAbsoluteMin(int[][] array, int absoluteMin) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!(array[i].length == 0) && !(absoluteMin == 0) || array[i][j]!=0) {
                    if (divisionCheck(array[i][j], absoluteMin)) {
                        array[i][j] /= absoluteMin;
                    } else {
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }
        String message = "";
        if (!(count > 0)) {
            displayConsole(array);
            return message = "Possible!";
        }
        return message = "Impossible";
    }

    public static int absoluteMin(int[][] array) {
        Integer[] arrayMinNumbers = minElementInRow(array);
        int init = arrayMinNumbers[0];
        for (int i = 0; i < arrayMinNumbers.length; i++) {
            if (arrayMinNumbers[i] == null) {
                i++;
            } else {
                if (arrayMinNumbers[i] < init) {
                    init = arrayMinNumbers[i];
                }
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

    public static Integer[] minElementInRow(int[][] array) {
        Integer[] modArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length == 0) {
                modArray[i] = NOT_DEFINE;
            } else {
                int init = array[i][0];
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] < init) {
                        init = min(array[i]);
                    }
                }
                modArray[i] = init;
            }
        }
        return modArray;
    }

    public static int sumElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += Math.abs(array[i][j]);
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

    public static void displayConsole(Integer[] array) {
        System.out.print("[");
        int count = 0;
        for (Integer element : array) {
            System.out.print(element);
            if (count < array.length - 1) {
                System.out.print(", ");
            }
            count++;
        }
        System.out.println("]");
    }

    public static int[][] createArray(int countInRow, int length) {
        int[][] numbersRandom = new int[countInRow][];
        for (int i = 0; i < numbersRandom.length; i++) {
            if (length == 0) {
                numbersRandom[i] = new int[0];
            } else {
                numbersRandom[i] = new int[ThreadLocalRandom.current().nextInt(length)];
            }
        }
        return numbersRandom;
    }

    public static int[][] fillArray(int[][] numbersRandom, int minRandom, int maxRandom) {
        if (minRandom > maxRandom) {
            int save = minRandom;
            minRandom = maxRandom;
            maxRandom = save;
        }
        for (int i = 0; i < numbersRandom.length; i++) {
            for (int j = 0; j < numbersRandom[i].length; j++) {
                numbersRandom[i][j] = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
            }
        }
        return numbersRandom;
    }

    public static int enterNumberBetween() {
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

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print("Value non valid! Enter again: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}