package com.gmail.alinakotova102.corsoRanstad;

public class Stars {
    public static void main(String[] args) {
        char symbol ='*';
        int n = 5;
        String stars = "";
        for (int i = 1; i<=n; i++){
            for (int k = n-i; k>0; k--) {
                stars += " ";
            }

            for (int j = 0; j<i; j++) {
                stars += symbol + " ";
            }
            System.out.print(stars);
            stars ="";
            System.out.println();
        }
    }
}
