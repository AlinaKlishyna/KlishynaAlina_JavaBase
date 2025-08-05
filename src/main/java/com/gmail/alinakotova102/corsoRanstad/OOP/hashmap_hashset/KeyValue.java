package com.gmail.alinakotova102.corsoRanstad.OOP.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KeyValue {
    public static void main(String[] args) {
        // hashset - set without duplicate
        HashSet<String> withoutDuplicate = new HashSet<>();
        withoutDuplicate.add("withoutDuplicate");
        withoutDuplicate.add("withoutDuplicate1");
        withoutDuplicate.add("withoutDuplicate2");
        withoutDuplicate.add("withoutDuplicate");
        withoutDuplicate.add("withoutDuplicate");
        System.out.println(withoutDuplicate);

        HashMap<String, Integer> prodottiPrezzi = new HashMap<>();
        prodottiPrezzi.put("Banana", 12);
        prodottiPrezzi.put("Orange", 10);
        prodottiPrezzi.put("Ciliegia", 11);

        for(String key : prodottiPrezzi.keySet()) {
            System.out.println(key);
        }

        for(Map.Entry<String, Integer> item : prodottiPrezzi.entrySet()) {
            if (item.getKey().equalsIgnoreCase("banana"))
                System.out.println(true);
        }

        System.out.println(prodottiPrezzi.containsKey("Banana"));

        prodottiPrezzi.remove("Banana");
        System.out.println(prodottiPrezzi);
    }
}