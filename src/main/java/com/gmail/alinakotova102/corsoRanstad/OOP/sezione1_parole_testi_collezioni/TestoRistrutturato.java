package com.gmail.alinakotova102.corsoRanstad.OOP.sezione1_parole_testi_collezioni;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestoRistrutturato {
    public static void main(String[] args) {
        removeDuplicate("Vladik Alina, pam pam Laptop banana fiori laptop");
    }

    public static void removeDuplicate(String text) {
        SortedSet set = new TreeSet<>();
        String[] words = text.trim().toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").split(" ");
        for(String word : words) {
            set.add(word);
        }
        System.out.println(set);
    }
}
