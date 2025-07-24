package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.sovraccarico_metodi;

import java.util.Arrays;

public class Calcolatrice {
    public int somma(int a, int b) {
        return Integer.sum(a,b);
    }

    public int somma(int a, int b, int c) {
        return a+b+c;
    }

    public int somma(int[] numeri) {
        return Arrays.stream(numeri).sum();
    }
}
