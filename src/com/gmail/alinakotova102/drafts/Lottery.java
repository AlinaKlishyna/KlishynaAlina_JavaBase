package com.gmail.alinakotova102.drafts;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static int lengthValues = 7;
    public static int minValue = 0;
    public static int maxValue = 9;

    public static void main(String[] args) {
        System.out.println("Guess numbers from 0-9 with only 7 numbers!");
        int[] numbersUser = createArrayUser(lengthValues, minValue, maxValue);
        System.out.print("Your numbers: ");
        displayConsole(numbersUser);

        System.out.print("Sorted array(your numbers): ");
        int[] numbersUserSorted = sortArray(sortArray(numbersUser));
        displayConsole(numbersUserSorted);

        int[] numbersOrganizer = createArrayRandomNumbers(lengthValues, minValue, maxValue);
        System.out.print("Numbers wished by the organizing company: ");
        displayConsole(numbersOrganizer);

        System.out.print("Sorted array(organizing company):");
        int[] numbersOrganizerSorted = sortArray(sortArray(numbersOrganizer));
        displayConsole(numbersOrganizerSorted);

        int[][] arraysNumber = {numbersOrganizerSorted, numbersUserSorted};
        System.out.println("Coincidences: " + generalMatches(arraysNumber));
    }

    public static int generalMatches(int[][] array) {
        int sumCoincidence = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < array.length - 1) {
                    if (array[i][j] == array[i + 1][j]) {
                        sumCoincidence++;
                    }
                }
            }
        }
        return sumCoincidence;
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                while (array[i] > array[i + 1]) {
                    int c = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = c;
                    i = 0;
                }
            }
        }
        return array;
    }

    public static int[] createArrayUser(int length, int minValue, int maxValue) {
        int[] numbersUser = new int[length];
        Scanner numbers = new Scanner(System.in);
        for (int i = 0; i < numbersUser.length; i++) {
            System.out.printf("Enter number #%d: ", (i + 1));
            while (!numbers.hasNextInt()) {
                System.out.printf("Non valid! Enter number #%d: ", (i + 1));
                numbers.next();
            }
            numbersUser[i] = numbers.nextInt();
            while (numbersUser[i] < minValue || numbersUser[i] > maxValue) {
                System.out.printf("Numbers must be in range [0-9]. Enter number #%d: ", (i + 1));
                if (!numbers.hasNextInt()) {
                    System.out.printf("Non valid! Enter number #%d: ", (i + 1));
                    numbers.next();
                } else {
                    numbersUser[i] = numbers.nextInt();
                }
            }
        }
        return numbersUser;
    }

    public static int[] createArrayRandomNumbers(int length, int minValue, int maxValue) {
        int[] randomNumbers = new int[length];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(minValue, maxValue);
        }
        return randomNumbers;
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
        System.out.print("]\n");
    }
}