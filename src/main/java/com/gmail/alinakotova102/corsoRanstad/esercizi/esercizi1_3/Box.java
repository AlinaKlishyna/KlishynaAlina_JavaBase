package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi1_3;

import java.util.List;

public class Box <T>{
    private List<T> listT;

    public Box(List<T> listT) {
        this.listT = listT;
    }

    public double calculateAvarage() {
        if (listT == null || listT.isEmpty()) {
            return Double.NaN;
        }
        double sum = 0;
        for (T item : listT) {
            if (item instanceof Number) {
                sum+=((Number) item).doubleValue();
            }
        }
        return sum/listT.size();
    }
}

class MainRunner {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(List.of(3,5,2,5,3,5));
        System.out.println(box.calculateAvarage());
    }
}