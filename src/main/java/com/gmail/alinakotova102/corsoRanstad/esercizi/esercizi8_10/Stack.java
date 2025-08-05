package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi8_10;

import java.util.List;

public class Stack <T>{
    private List<T> list;

    void push(T value) {
        System.out.println("Push.. " + value);
        list.add(value);
    }

    void pop() {
        System.out.println("Pop.. " );
        list.remove(list.size()-1);
    }
}
