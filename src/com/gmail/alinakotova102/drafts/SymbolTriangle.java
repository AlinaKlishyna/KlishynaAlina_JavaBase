package com.gmail.alinakotova102.drafts;

public class SymbolTriangle {
    static String symbol = "+";

    public static void main(String[] args) {
        createTriangleFor(7);
        //createTriangleWhile(7);
        //createTriangleDoWhile(7);
    }

    public static void createTriangleFor(int height) {
        int countSymbols = 1;
        int count = 0;
        for (int i = 0; i < height; i++) {
            for (int d = height; d > count; d--) {
                System.out.print(" ");
                if (d == count-1){
                    d=height-count;
                }
            }

            for (int j = 0; j < countSymbols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
            countSymbols += 2;
            count++;
        }
    }

    public static void createTriangleWhile(int height) {
        int countSymbols = 1;
        int count = 0;
        int j = 0;
        int d = height;
        while (count < height) {
            while (d > 0) {
                System.out.print(" ");
                d--;
            }
            while (j < countSymbols) {
                System.out.print(symbol);
                j++;
            }
            countSymbols += 2;
            j = 0;
            System.out.println();
            count++;
            d = height - count;

        }
    }

    public static void createTriangleDoWhile(int height){
        int count = 0;
        int countSymbols = 1;
        int j = 0;
        int d = height;
        do {
            do {
                System.out.print(" ");
                d--;
            }while (d>0);
            do {
                System.out.print(symbol);
                j++;
            }while (countSymbols>j);
            j = 0;
            countSymbols+=2;
            count++;
            d = height - count;
            System.out.println();
        }while (count<height);
    }
}