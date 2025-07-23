package com.gmail.alinakotova102.corsoRanstad.introduzione_metodi_parametri.sezione1_metodi_semplici;

public class Runner {
    public static void main(String[] args) {
        stampa();
        saluta("Nicolo");
        stampaSomma(3, 5);
        stampaTabellina(2);
        stampaQuadrato(3);
    }

    public static void stampaTabellina(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, i * n);
        }
    }

    public static void stampaQuadrato(int n) {
        System.out.println((int) Math.pow(n, 2));
    }

    public static void stampaSomma(int a, int b) {
        System.out.printf("somma:  %d + %d = %d\n", a, b, Integer.sum(a, b));
    }

    public static void saluta(String nome) {
        System.out.printf("Ciao, %s!\n", nome);
    }

    public static void stampa() {
        System.out.println("Ciao mondo!");
    }
}
