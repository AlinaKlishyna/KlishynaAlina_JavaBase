package com.gmail.alinakotova102.corsoRanstad.introduzione_metodi_parametri.sezione5_metodi_chiamano_altri_metodi;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Triplica ->" + triplica(5));
        dettagliUtente("Maks", 19);
        System.out.println("Somma media: 3 e 4 -> " + sommaMedia(3, 4));
    }

    public static double sommaMedia(int a, int b) {
        return (double) somma(a, b) / 2;
    }

    public static int somma(int a, int b) {
        return Integer.sum(a, b);
    }

    public static void dettagliUtente(String nome, int età) {
        System.out.printf("Utente -> \nnome: %s\nage: %d\nmaggiorenne: %b", nome, età, èMaggiorenne(età));
    }

    public static boolean èMaggiorenne(int age) {
        return age >= 18;
    }

    public static int triplica(int n) {
        return raddoppia(n) + n;
    }

    public static int raddoppia(int n) {
        return n * 2;
    }
}
