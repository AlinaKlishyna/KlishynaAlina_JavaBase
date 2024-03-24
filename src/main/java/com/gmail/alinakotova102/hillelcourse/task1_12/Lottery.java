package com.gmail.alinakotova102.hillelcourse.task1_12;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static int lengthValues = 7;
    public static int minValue = 0;
    public static int maxValue = 9;

    public static void main(String[] args) {
        System.out.println("Lottery!");
        int[] ticketUser = createRandomTicket(lengthValues, minValue, maxValue);
        System.out.println("Your numbers: ");
        displayConsole(ticketUser);

        int[] ticketOrganizer = createRandomTicket(lengthValues, minValue, maxValue);
        System.out.println("Numbers wished by the organizing company: ");
        displayConsole(ticketOrganizer);

        System.out.println("\nSorted array(your numbers): ");
        int[] ticketUserSorted = sortTicket(ticketUser);
        displayConsole(ticketUserSorted);

        System.out.println("Sorted array(organizing company):");
        int[] ticketOrganizerSorted = sortTicket(ticketOrganizer);
        displayConsole(ticketOrganizerSorted);

        System.out.println();
        generalMatches(ticketOrganizerSorted, ticketUserSorted);
    }

    public static void generalMatches(int[] ticketOrganization, int[] ticketUser) {
        int sumCoincidence = 0;
        for (int i = 0; i < lengthValues; i++) {
            if (ticketOrganization[i] == ticketUser[i]) {
                sumCoincidence++;
                System.out.printf("Number #%d - Value %d - coincided!\n", (i + 1), ticketOrganization[i]);
            }
        }
        System.out.println("The total coincided: " + sumCoincidence);
    }

    public static int[] sortTicket(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                while (array[j] > array[i + 1]) {
                    int save = array[i + 1];
                    array[i + 1] = array[j];
                    array[j] = save;
                }
            }
        }
        return array;
    }

    public static int[] createRandomTicket(int length, int minValue, int maxValue) {
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