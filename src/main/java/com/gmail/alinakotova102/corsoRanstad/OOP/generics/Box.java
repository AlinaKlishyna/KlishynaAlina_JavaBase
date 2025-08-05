package com.gmail.alinakotova102.corsoRanstad.OOP.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box<T> {
    private T item;
    public T get(){
        return item;
    }

    public void set(T element) {
        item = element;
    }

    public void stampaArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

class Pair<K, V> {
    private K k;
    private V v;

    public Pair() {

    }

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public void stampaMap(Map<K, List<V>> map) {
        for (Map.Entry<K, List<V>> item : map.entrySet()) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return k + " - " + v;
    }
}

class Runner {
    public static void main(String[] args) {
        Box<Integer> element = new Box<>();
        element.stampaArray(new Integer[]{3,6,2,5,3});

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("text", List.of(3,41));
        map.put("text2", List.of(2,3,53,5));
        map.put("text3", List.of(5,3,4));
        map.put("text4", List.of(0));

        Pair<String, Integer> pair = new Pair<>();
        pair.stampaMap(map);
    }
}

