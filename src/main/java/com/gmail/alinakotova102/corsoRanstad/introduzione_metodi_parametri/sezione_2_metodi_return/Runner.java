package com.gmail.alinakotova102.corsoRanstad.introduzione_metodi_parametri.sezione_2_metodi_return;

public class Runner {
    public static void main(String[] args) {
        System.out.println("somma: 3 + 4 = " + somma(3, 4));
        System.out.println("massimo: 3 e 4 -> " + massimo(3, 4));
        System.out.println("unisci: Fazz e Bazz -> " + unisci("Fazz", "Bazz"));
        System.out.println("media: 3.45 e 22.1 e 34.44 -> " + media(3.45, 22.1, 34.44));
        System.out.println("lunghezzaParola: Ciao -> " + lunghezzaParola("Ciao"));
    }

    public static int lunghezzaParola(String parola) {
        return parola.length();
    }

    public static double media(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static String unisci(String a, String b) {
        return a + b;
    }

    public static int massimo(int a, int b) {
        return Integer.max(a, b);
    }

    public static int somma(int a, int b) {
        return Integer.sum(a, b);
    }
}