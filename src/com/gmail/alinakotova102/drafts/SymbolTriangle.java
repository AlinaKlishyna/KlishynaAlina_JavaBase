package com.gmail.alinakotova102.drafts;

public class SymbolTriangle {
    static String symbol = "+";

    public static void main(String[] args) {
        //createTriangleFor(3);
        //createTriangleWhile(7);
    }

    public static void createTriangleFor(int height) {
        int countSymbols = 1;
        int distance = height;
        for (int i = 0; i < height; i++) {
            for (int d = distance; d > 0; d--) {
                System.out.print(" ");
            }

            for (int j = 0; j < countSymbols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
            countSymbols += 2;
            distance--;
        }
    }

    public static void createTriangleWhile(int height) {
        int countSymbols = 1;
        int counter = 0;
        int j = 0;
        int d = 0;
        int distance = height;
        while (counter < height) {
            while (distance > d) {
                System.out.print(" ");
                distance--;
            }
            while (j < countSymbols) {
                System.out.print(symbol);
                j++;
            }
            countSymbols += 2;
            j = 0;
            System.out.println();
            counter++;
            distance = height - counter;

        }
    }
}
