package com.gmail.alinakotova102.drafts;

public class SymbolTriangle {
    static String symbol = "+";

    public static void main(String[] args) {
        createTriangleFor(7);
        createTriangleWhile(7);
        createTriangleDoWhile(7);
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
        int count = 0;
        int j = 0;
        int d = 0;
        int distance = height;
        while (count < height) {
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
            count++;
            distance = height - count;

        }
    }

    public static void createTriangleDoWhile(int height){
        int count = 0;
        int countSymbols = 1;
        int j = 0;
        int distance = height;
        do {
            do {
                System.out.print(" ");
                distance--;
            }while (distance>0);
            do {
                System.out.print(symbol);
                j++;
            }while (countSymbols>j);
            j = 0;
            countSymbols+=2;
            count++;
            distance = height - count;
            System.out.println();
        }while (count<height);
    }
}