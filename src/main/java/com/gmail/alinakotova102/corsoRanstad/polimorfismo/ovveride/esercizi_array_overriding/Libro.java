package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_array_overriding;

public class Libro {
    protected String name;

    public Libro(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Runner3 {
    public static void main(String[] args) {
        System.out.println(new Libro("Maugli"));
    }
}