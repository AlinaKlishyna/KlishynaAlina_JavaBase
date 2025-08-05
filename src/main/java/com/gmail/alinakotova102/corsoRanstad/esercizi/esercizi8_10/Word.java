package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi8_10;

import java.util.HashMap;
import java.util.Map;

public class Word {
    public static void main(String[] args) {
        String text = "Bunch of alcohol, we need more options\n" +
                "Need more dancers, oh, we way too poppin'\n" +
                "In love with ice and chains, I'm way too flashy\n" +
                "We movin' fast as hell, no, they can't catch me";
        System.out.println(countWord(text));
    }

    public static Map<String, Integer> countWord(String text) {
        String[] words = text.trim().split("[^A-Za-z]+");
        Map<String, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    map.put(words[i], count++);
                }
            }
            count=1;
        }
        return map;
    }
}
