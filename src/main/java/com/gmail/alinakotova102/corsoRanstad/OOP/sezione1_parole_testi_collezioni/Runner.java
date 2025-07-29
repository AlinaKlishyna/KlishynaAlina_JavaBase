package com.gmail.alinakotova102.corsoRanstad.OOP.sezione1_parole_testi_collezioni;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        String text = "A lavorare mia madre è andata a 13 anni, in un negozio di parrucchiera, ha contribuito " +
                "al mantenimento della sua famiglia e già prima di sposarsi, a 19 anni, aveva il suo salone a " +
                "Bergamo… che ha abbandonato per seguire mio padre nel suo lavoro e per crescere 3 figli";
        System.out.println(contaLettere(text));
        statisticheParole(text);
    }

    public static void statisticheParole(String text) {
        if (!text.isEmpty()) {
            System.out.println("Statistiche parole: ");
            System.out.println("Numero totale: " + getNumeroTotale(text));
            System.out.println("Parola più lunga: " + getParolaPiùLunga(text));
            System.out.println("Parola più frequente: " + piùFrequente(text));
        }
    }

    public static String piùFrequente(String text) {
        String[] words = text.trim().toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word.length()>1) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        int max = 0;
        String word = "";
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (max<item.getValue()) {
                max = item.getValue();
                word = item.getKey();
            }
        }
        return "\"" + word + "\"" + " - " + max + " volte";
    }

    public static int getNumeroTotale(String text) {
        return text.trim().split("\\s+").length;
    }

    public static String getParolaPiùLunga(String text) {
        String[] words = text.trim().replace(",", "").split("\\s+");
        int max = words[0].length();
        String word = "";
        for (int i = 0; i < words.length; i++) {
            if (max < words[i].length()) {
                max = words[i].length();
                word = words[i];
                i = 0;
            }
        }
        return word + " - " + max;
    }


    public static Map<Character, Integer> contaLettere(String frase) {
        if (frase.isEmpty() || frase== null) {
            return null;
        }
        Map<Character, Integer> result = new HashMap<>();
        char[] lettere = frase.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < lettere.length; i++) {
            for (int j = 0; j < lettere.length; j++) {
                if (Character.isLetter(lettere[i])) {
                    if (lettere[i] == lettere[j]) {
                        result.put(lettere[i], (count + 1));
                        count++;
                    }
                }
            }
            count = 0;
        }
        return result;
    }
}
