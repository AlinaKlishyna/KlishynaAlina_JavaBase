package com.gmail.alinakotova102.corsoRanstad.OOP.sezione3_logiche_collezioni_static;

import java.util.*;

public class Text {
    private String text;
    public final Map<Character, Integer> frequencySymbols = new HashMap<>();

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Map<Character, Integer> getFrequencySymbols() {
        Character[] chars = new Character[this.text.length()];

        for (int i=0; i<this.text.length();i++) {
            chars[i] = this.text.charAt(i);
            for (int j = 0; j < this.text.length(); j++) {
                if (chars[i].equals(chars[j])) {
                    this.frequencySymbols.put(chars[i], frequencySymbols.getOrDefault(chars[i], 0)+1);
                }
            }
        }
        return frequencySymbols;
    }
}

class RunnerMain {
    public static void main(String[] args) {
        Text text = new Text("String#toCharArray returns an array of char, what you have is an array of Character. " +
                "In most cases it doesn't matter if you use char or Character as there is autoboxing. The problem " +
                "in your case is that arrays are not autoboxed, I suggest you use an array of char (char[]).");
        System.out.println(text.getFrequencySymbols());
    }
}
