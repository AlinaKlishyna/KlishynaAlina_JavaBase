package com.gmail.alinakotova102.corsoRanstad.linkedlist;

import java.util.LinkedList;

public class Nomi {

    public static LinkedList<String> nomi = new LinkedList<>();
    static {
        nomi.add("Nicolo");
        nomi.add("Francesco");
        nomi.add("Gregory");
    }

    public static void main(String[] args) {
        // Crea una LinkedList di stringhe e aggiungi 3 nomi a tua scelta. Stampala
        System.out.println(nomi);

        // Aggiungi un elemento all'inizio
        nomi.addFirst("Alina");

        // Aggiungi un elemento alla fine
        nomi.addLast("Lyudmila");

        //Stampa il primo elemento
        System.out.println(nomi.get(0));
        System.out.println(nomi.getFirst());
        System.out.println(nomi.peekFirst());

        // Stampa l’ultimo elemento

    }
}
