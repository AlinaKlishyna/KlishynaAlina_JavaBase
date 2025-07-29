package com.gmail.alinakotova102.corsoRanstad.polimorfismo.overloade.sezione2;

public class Studente {
    private String name;
    private int età;
    private int voto;

    public Studente(String name) {
        this.name = name;
    }

    public Studente(String name, int età) {
        this.name = name;
        this.età = età;
    }

    public Studente(String name, int età, int voto) {
        this.name = name;
        this.età = età;
        this.voto = voto;
    }
}
