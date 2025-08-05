package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi4_8;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class BoxUtils{
    public static <T extends Comparable<T>> T min(Box<T> box1, Box<T> box2) {
        if (box1.getValue().compareTo(box2.getValue()) <= 0)
            return box1.getValue();
        else {
            return box2.getValue();
        }
    }

    public static void main(String[] args) {
        System.out.println(min(new Box<>(4), new Box<>(3)));
    }
}
