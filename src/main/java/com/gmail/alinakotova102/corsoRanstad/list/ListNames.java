package com.gmail.alinakotova102.corsoRanstad.list;

import com.gmail.alinakotova102.corsoRanstad.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListNames {
    static List<String> nomi = new ArrayList<>();

    public static void main(String[] args) {
        // Aggiungere un elemento alla lista
        nomi.add("Marco");

        // Aggiungere più elementi
        nomi.add("Anna");
        nomi.add("Bea");
        nomi.add("Luca");

        // Stampare tutta la lista
        System.out.println(nomi);

        // Recuperare un elemento per indice
        System.out.println(nomi.get(0));

        // Modificare un elemento
        nomi.set(3, "Giulia");

        // Verificare se la lista contiene un elemento
        System.out.println(nomi.contains("Luca"));

        // Rimuovere un elemento per valore
        nomi.remove("Anna");

        // Rimuovere un elemento per indice
        nomi.remove(0);

        // Ottenere la dimensione della lista
        System.out.println(nomi.size());

        // Verificare se la lista è vuota
        System.out.println(nomi.isEmpty());

        // Cancellare tutti gli elementi
        nomi.clear();

        nomi.add("Marco");
        nomi.add("Anna");
        nomi.add("Bea");
        nomi.add("Luca");

        // Scorrere la lista con un ciclo for-each
        System.out.println(nomi);

        // Ordinare una lista
        nomi.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(nomi);

        // Invertire una lista
        Collections.reverse(nomi);
        System.out.println(nomi);

        // Creare una lista da un array
        List<String> listDaArray = List.of(new String[]{"a", "b", "c"});

        // Trovare l’indice di un elemento
        for (int i = 0; i < nomi.size(); i++) {
            if (nomi.get(i).equals("Bea"))
                System.out.println(i);
        }

        // Verificare se due liste sono uguali
        List<String> nomiCopia = List.of("Marco", "Luca", "Bea", "Anna");
        System.out.println(nomi.equals(nomiCopia));

        // Copiare una lista in un’altra
        List<String> newList = nomiCopia;

        // Trasformare una lista in array
        String[] nomiArray = new String[newList.size()];
        int i = 0;
        for (String nome : newList) {
            nomiArray[i] = nome;
            i++;
        }
        System.out.println(Arrays.toString(nomiArray));
    }
}
