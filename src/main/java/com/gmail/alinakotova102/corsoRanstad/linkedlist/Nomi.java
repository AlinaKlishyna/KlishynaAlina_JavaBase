package com.gmail.alinakotova102.corsoRanstad.linkedlist;

import java.util.Arrays;
import java.util.Collections;
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

        // Stampa il primo elemento
        System.out.println(nomi.get(0));
        System.out.println(nomi.getFirst());
        System.out.println(nomi.peekFirst());

        // Stampa l’ultimo elemento
        System.out.println(nomi.getLast());
        System.out.println(nomi.peekLast());

        // Controlla se la lista è vuota
        System.out.println(nomi.isEmpty());

        // Crea una LinkedList di numeri interi
        LinkedList<Integer> numeri = new LinkedList<>();
        numeri.add(2);
        numeri.add(-2);
        numeri.add(22);

        // Ordina la LinkedList di numeri
        Collections.sort(numeri);

        // Rimuovi tutti gli elementi
        nomi.clear();

        // Crea una lista nuova e copiala in un’altra
        LinkedList<Integer> numeriCopia = new LinkedList<>();
        numeriCopia.addAll(numeri);

        // Scorri tutti gli elementi
        for (int num : numeriCopia) {
            System.out.println(num);
        }

        // Crea due LinkedList diverse, uniscile in una sola
        LinkedList<Integer> numeriPrima = new LinkedList<>();
        LinkedList<Integer> numeriSecondo = new LinkedList<>();
        LinkedList<Integer> numeriInsieme = new LinkedList<>();
        numeriInsieme.addAll(numeriPrima);
        numeriInsieme.addAll(numeriSecondo);

        // Trova l'indice di un elemento specifico nella lista
        System.out.println(nomi.indexOf("Lyudmila"));

        // Copia una LinkedList in un'altra, poi modifica la seconda. Controlla se sono uguali.
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Vanya");
        list1.add("Sasha");
        list1.add("Gennadiy");
        LinkedList<String> list2 = new LinkedList<>();
        list2.addAll(list1);
        System.out.println(list2.equals(list1));

        // Aggiungi numeri alla lista
        numeriCopia.add(10);
        numeriCopia.add(25);
        numeriCopia.add(19);
        numeriCopia.removeIf(x -> x > 10);
        System.out.println(numeriCopia);

        // Trasforma una LinkedList in array e stampalo
        String[] nomiArray = nomi.toArray(new String[0]);
        System.out.println(Arrays.toString(nomiArray));
    }
}
