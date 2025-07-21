package com.gmail.alinakotova102.corsoRanstad;

public class Consecutivi {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 5, 7, 8, 9, 0, 0, 6};

        int repeat = numbers[0];
        int count = 0;
        boolean treValoriConsecuitivi = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == repeat) {
                if (count == 2) {
                    System.out.println("Tre valori consecuitivi uguali (" + numbers[i] + ")");
                    treValoriConsecuitivi = true;
                }
                count++;
            } else {
                repeat = numbers[i];
                count = 1;
            }

            if (i == numbers.length - 1 && !treValoriConsecuitivi) {
                System.out.println("NO");
            }
        }
    }
}
