package com.gmail.alinakotova102;

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
        int maxCount = enterNumberBetween();

        System.out.print("\nEnter number for create array with random numbers\nMin number: ");
        int minRandom = enterNumber();
        System.out.print("Max number: ");
        int maxRandom = enterNumber();
        while (Math.abs(maxRandom - minRandom) == 1 || maxRandom == minRandom) {
            System.out.println("Error! There is no range between numbers\nMax number: ");
            maxRandom = enterNumber();
        }

        int[][] array = createArray(countRows, maxCount);
        array = fillArray(array, minRandom, maxRandom);

        System.out.println("\nInitial array");
        display(array);

        System.out.println("Modified array");
        int[][] arraySorted = sortEvenOdd(array);
        display(arraySorted);

        int sumElements = sumElements(array);
        System.out.println("Sum of elements: " + sumElements);

        Integer[] minElement = minElementInRow(array);
        System.out.print("\nMinimal element in row: ");
        display(minElement);

        int absoluteMinElement = absoluteMin(array);
        System.out.println("\nAbsolute minimal element: " + absoluteMinElement);

        System.out.println("\nDividing by the absolute minimum: ");
        System.out.print(divideByAbsoluteMin(array, absoluteMinElement));
    }

    public static boolean divisionCheck(int number, int divisionNumber) {
        return number % divisionNumber == 0;
    }

    public static String divideByAbsoluteMin(int[][] matrix, int absoluteMin) {
        int count = 0;
        String message = "";
        if (!(absoluteMin == 0)) {
            for (int i = 0; i < matrix.length; i++) {
                if (!(matrix[i].length == 0)) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (divisionCheck(matrix[i][j], absoluteMin)) {
                            matrix[i][j] /= absoluteMin;
                        } else {
                            count++;
                        }
                    }
                } else {
                    count++;
                }
            }
        } else {
            return message = "Impossible";
        }
        if (count <= 0) {
            display(matrix);
            return message = "Possible!";
        }
        return message = "Impossible";
    }

    public static int absoluteMin(int[][] matrix) {
        return min(minElementInRow(matrix));
    }

    public static int min(Integer[] array) {
        int minValue = 0;
        if (array[0] == null) {
            minValue = 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = NOT_DEFINE;
            } else {
                if (array[i] < minValue) {
                    minValue = array[i];
                }
            }
        }
        return minValue;
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

    public static Integer[] minElementInRow(int[][] matrix) {
        Integer[] modArray = new Integer[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 0) {
                modArray[i] = NOT_DEFINE;
            } else {
                int min = matrix[i][0];
                for (int j = 0; j < matrix[i].length; j++) {
                    min = min(matrix[i]);
                }
                modArray[i] = min;
            }
        }
        return modArray;
    }

    public static int sumElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static int[] swap(int[] array, int numberFirst, int numberSecond) {
        int saveNumber = array[numberFirst + 1];
        array[numberFirst + 1] = array[numberSecond];
        array[numberSecond] = saveNumber;
        return array;
    }

    public static int[] sortAsc(int[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = 0; k < array.length - 1; k++) {
                    if (array[k] > array[j + 1]) {
                        swap(array, j, k);
                    }
                }
            }
        }
        return array;
    }

    public static int[] sortDesc(int[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = 0; k < array.length - 1; k++) {
                    if (array[k] < array[j + 1]) {
                        swap(array, j, k);
                    }
                }
            }
        }
        return array;
    }

    public static int[][] sortEvenOdd(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if ((i + 1) % 2 == 0) {
                sortAsc(matrix[i]);
            } else {
                sortDesc(matrix[i]);
            }
        }
        return matrix;
    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]) + "\n");
        }
        System.out.println();
    }

    public static void display(Integer[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[][] createArray(int rowCount, int length) {
        int[][] numbersRandom = new int[rowCount][];
        for (int i = 0; i < numbersRandom.length; i++) {
            if (length <= 0) {
                numbersRandom[i] = new int[0];
            } else {
                numbersRandom[i] = new int[ThreadLocalRandom.current().nextInt(length)];
            }
        }
        return numbersRandom;
    }

    public static int[][] fillArray(int[][] numbers, int min, int max) {
        if (min > max) {
            int save = min;
            min = max;
            max = save;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = ThreadLocalRandom.current().nextInt(min, max);
            }
        }
        return numbers;
    }

    public static int enterNumberBetween() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1 && number < 999) {
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