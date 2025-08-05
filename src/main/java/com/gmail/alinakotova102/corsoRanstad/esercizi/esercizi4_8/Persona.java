package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi4_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persona {
    private String name;
    private int età;

    private static List<Persona> persons = new ArrayList<>();

    public Persona(String name, int età) {
        this.name = name;
        this.età = età;
        persons.add(this);
    }

    public String getName() {
        return name;
    }

    public int getEtà() {
        return età;
    }

    public static List<Persona> listMaggiorenne() {
        return persons.stream().filter(n -> n.getEtà()>18).toList();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", età=" + età +
                '}';
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Bob", 23);
        Persona persona2 = new Persona("Lok", 14);
        Persona persona3 = new Persona("Vok", 13);
        Persona persona4 = new Persona("Dok", 18);
        Persona persona5 = new Persona("Pol", 56);

        System.out.println(Persona.listMaggiorenne());
    }
}
