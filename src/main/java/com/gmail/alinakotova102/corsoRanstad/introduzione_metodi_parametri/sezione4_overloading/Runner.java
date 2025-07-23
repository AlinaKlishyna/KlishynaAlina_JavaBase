package com.gmail.alinakotova102.corsoRanstad.introduzione_metodi_parametri.sezione4_overloading;

public class Runner {
    public static void main(String[] args) {
        stampa();
        stampa("Ciao! :)");
        System.out.println("Somma: 2 e 3 = " + somma(2, 3));
        System.out.println("Somma: 2 e 3 e 5 = " + somma(2, 3, 5));
        System.out.printf("il quadrato(lato %d) -> area: %d\n" +
                "il rettangolo(base %d, altezza %d) - > area: %d\n", 6, area(6), 4, 13, area(4, 13));
    }

    public static int area(int lato) {
        return (int) Math.pow(lato, 2);
    }

    public static int area(int base, int altezza) {
        return Math.multiplyExact(base, altezza);
    }

    public static int somma(int a, int b) {
        return Integer.sum(a, b);
    }

    public static int somma(int a, int b, int c) {
        return a + b + c;
    }

    public static void stampa() {
        System.out.println("Ciao!");
    }

    public static void stampa(String messaggio) {
        System.out.println(messaggio);
    }
}
