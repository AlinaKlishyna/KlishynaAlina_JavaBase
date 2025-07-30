package com.gmail.alinakotova102.corsoRanstad.OOP.sezione4_static_utilityclass_contatori;

import java.util.Arrays;

public class Studente {
    private long id = 0;
    private final int MIN_LIMIT = 1000;
    private final int MAX_LIMIT = 9999;

    public Studente() {
        this.id = nextId();
    }

    public int nextId() {
        return (int) Math.abs((Math.random() * (MIN_LIMIT - MAX_LIMIT)) + MIN_LIMIT);
    }

    @Override
    public String toString() {
        return "Studente{" +
                "id=" + id +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Studente[] studenti = {
                new Studente(),
                new Studente(),
                new Studente(),
                new Studente(),
                new Studente()
        };

        System.out.println(Arrays.toString(studenti));
    }
}
