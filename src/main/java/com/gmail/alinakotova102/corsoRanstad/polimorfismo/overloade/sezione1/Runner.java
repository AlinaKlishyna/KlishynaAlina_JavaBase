package com.gmail.alinakotova102.corsoRanstad.polimorfismo.overloade.sezione1;

public class Runner {
    public static void main(String[] args) {
        stampa(3);
        stampa(3.0);
        stampa("linea");
        saluta();
        saluta("Maks");
        somma(2,2);
        somma(2,2,2);
        somma(2.0,2.0);
        calcolaArea(5);
        calcolaArea(5,13);
        descrivi("Lolik", "Gatto",2);
        mostra();
        mostra("Okey");
        mostra(false);
        System.out.println(converti(5));
        System.out.println(converti(5.0));
        System.out.println("5");
        System.out.println(isPari(10));
        System.out.println(isPari((long)10));
        System.out.println(stampaData(2000,11,22));
        ripeti(5, "Okey");
        ripeti('e', "Okey");
    }

    public static void ripeti(int n, String stringa) {
        for (int i = 0; i<n;i++) {
            System.out.println(stringa);
        }
    }

    public static void ripeti(char n, String stringa) {
        String[] lettere = stringa.split("");
        for (int i = 0; i<lettere.length;i++) {
            if (!lettere[i].equalsIgnoreCase(String.valueOf(n))) {
                System.out.print(lettere[i]);
            } else {
                break;
            }
        }
    }

    public static String stampaData(int anno) {
        return anno + " anno ";
    }

    public static String stampaData(int anno, int mese) {
        return stampaData(anno) + mese + " mese ";
    }

    public static String stampaData(int anno, int mese, int giorno) {
        return stampaData(anno, mese) + giorno + " giorno";
    }

    public static boolean isPari(int numero) {
        return numero%2==0;
    }

    public static boolean isPari(long numero) {
        return numero%2==0;
    }

    public static int converti(double numero) {
        return (int) numero;
    }

    public static int converti(String line) {
        return Integer.parseInt(line);
    }

    public static String converti(int numero) {
        return String.valueOf(numero);
    }

    public static void mostra() {
        System.out.println("niente");
    }
    public static void mostra(String niente) {
        System.out.println(niente);
    }
    public static void mostra(boolean niente) {
        System.out.println(niente);
    }

    public static void descrivi(String name, String specie, int età) {
        System.out.println("Animal: " + name + ", " + specie + ", " + età);
    }
    public static void calcolaArea(int raggio) {
        System.out.println(raggio/2);
    }

    public static void calcolaArea(int base, int altezza) {
        System.out.println(Math.sqrt((Math.pow(base,2) + Math.pow(altezza,2))/2));
    }

    public static void somma(int a, int b) {
        System.out.println(a+b);
    }

    public static void somma(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void somma(double a, double b) {
        System.out.println(a+b);
    }

    public static void saluta() {
        System.out.println("Hello!");
    }

    public static void saluta(String linea) {
        System.out.println("Hello! " + linea + "!");
    }

    public static void stampa(String line) {
        System.out.println(line);
    }

    public static void stampa(int numero) {
        System.out.println(numero);
    }

    public static void stampa(double numero) {
        System.out.println(numero);
    }
}
