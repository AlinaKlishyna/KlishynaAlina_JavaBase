package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi4_8;

import java.util.*;

public class Città {
    private String titolo;

    public Città(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Città città = (Città) o;
        return Objects.equals(titolo, città.titolo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo);
    }

    @Override
    public String toString() {
        return "Città{" +
                "titolo='" + titolo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HashSet<Città> città = new HashSet<>();
        città.add(new Città("London"));
        città.add(new Città("Napoli"));
        città.add(new Città("London"));
        città.add(new Città("Roma"));
        città.add(new Città("Kotonop"));
        città.add(new Città("London"));
        città.add(new Città("Roma"));

        System.out.println(città);


        Map<Integer, String> prodotti = new HashMap<>();
        prodotti.put(1441, "Arancia");
        prodotti.put(4145, "Banana");
        prodotti.put(1453, "Ciliegia");
        prodotti.put(3533, "Mela");

        for (Map.Entry<Integer, String> item : prodotti.entrySet()) {
            System.out.println(item);
        }

        String numbers = "41 24 2";
        Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).forEach(System.out::println);

        Map<String,Integer> prodotto = new HashMap<>();
        prodotto.put("Arancia", 5);
        prodotto.put("Banana", 15);
        prodotto.put("Mela", 10);
        prodotto.put("Ciliegia", 11);

        prodotto.values().stream().sorted().forEach(System.out::println);
    }

    public static boolean checkObject(String string) {
        return string instanceof String;
    }

    public <K, V> Map<K, V> mergeMap(Map<K,V> first, Map<K,V> second) {
        Map<K, V> map = new HashMap<>(first);
        second.forEach((k,v) -> map.merge(k, v, (v1, v2) -> v));
        return map;
    }

    public List<Integer> filterList(List<Integer> list) {
        return list.stream().filter(n -> n > 10).sorted().toList();
    }
}
