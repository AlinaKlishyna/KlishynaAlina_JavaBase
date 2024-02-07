package com.gmail.alinakotova102.drafts;

public class SymbolTriangle {
    static String symbol = "+";
    public static void main(String[] args) {
        createTriangleFor(7);
    }

    public static void createTriangleFor(int height){
            int countSymbols = 1;
            int distance =height;
            for (int i = 0; i < height; i++){
                for (int l = distance; l>0; l--){
                    System.out.print(" ");
                }

                for (int j = 0; j < countSymbols; j++){
                    System.out.print(symbol);
                }
                System.out.println();

                countSymbols+=2;
                distance--;
            }
        }
}
