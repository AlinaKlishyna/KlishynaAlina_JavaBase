package com.gmail.alinakotova102.hillelcourse.task1_12;

import java.util.concurrent.ThreadLocalRandom;

public class ShuttleNumbers {
    public static void main(String[] args) {
        System.out.println("Shuttle numbering without unlucky numbers(4 and 9) filled with random numbers:");
        int[] valueRandomShuttle = createRandomValue();
        displayNumberShuttleConsole(valueRandomShuttle);
    }

    public static int[] createRandomValue() {
        int[] valueRandom = new int[100];
        for (int i = 0; i < valueRandom.length; i++) {
            valueRandom[i] = ThreadLocalRandom.current().nextInt(1, 100);
            while (String.valueOf(valueRandom[i]).contains("4") || String.valueOf(valueRandom[i]).contains("9")) {
                valueRandom[i] = ThreadLocalRandom.current().nextInt(1, 100);
            }
        }
        return valueRandom;
    }

    public static void displayNumberShuttleConsole(int[] valuesInt) {
        for (int i = 0; i < valuesInt.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("№%d - %d  \t", (i + 1), valuesInt[i]);
        }
    }
}
