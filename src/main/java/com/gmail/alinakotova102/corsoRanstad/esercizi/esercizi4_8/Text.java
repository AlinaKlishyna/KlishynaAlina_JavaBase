package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi4_8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Text {

    public Map<Character, Integer> countSymbols(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            result.put(text.charAt(i), result.getOrDefault(text.charAt(i), 0) + 1);
        }
        return result;
    }

    public Map<String, Integer> countWord(String text) {
        String[] words = text.split("[^A-Za-z]+");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        return map;
    }

    public Integer frequently(Map<String, Integer> map) {
        return Collections.max(map.values());
    }

    public void displayWordFrequently(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue().equals(frequently(map))) {
                System.out.println("max----" + item);
            }
        }
    }


    public static void main(String[] args) {
        Text text = new Text();
        System.out.println(text.countSymbols("Ripasso delle conoscenze"));

        text.displayWordFrequently(text.countWord("London is the capital and largest city of both England and the " +
                "United Kingdom, with a population of 8,945,309 in 2023. Its wider metropolitan area is the largest " +
                "in Western Europe, with a population of 15.1 million"));
    }
}
