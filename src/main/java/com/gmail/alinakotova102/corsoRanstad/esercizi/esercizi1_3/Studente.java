package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi1_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Studente implements Comparable<Studente>{
    private String name;
    private String lastname;
    private int voto;

    public Studente(String name, String lastname, int voto) {
        this.name = name;
        this.lastname = lastname;
        this.voto = voto;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getVoto() {
        return voto;
    }

    @Override
    public int compareTo(Studente o) {
        return this.voto - o.voto;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", voto=" + voto +
                '}';
    }

    public static void main(String[] args) {
        List<Studente> studenti = new ArrayList<>();
        studenti.add(new Studente("Alina", "Klishyna", 23));
        studenti.add(new Studente("Borya", "Klishyna", 20));
        studenti.add(new Studente("Faina", "Lor", 26));
        studenti.add(new Studente("Bekky", "Finik", 14));
        Collections.sort(studenti);
        System.out.println(studenti);
    }

}

