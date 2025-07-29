package com.gmail.alinakotova102.corsoRanstad.polimorfismo.overloade.sezione2;

public class Animale {
    private String specie;
    private int età;
    private String name;

    public Animale(String specie) {
        this.specie = specie;
    }

    public Animale(String specie, int età) {
        this.specie = specie;
        this.età = età;
    }

    public Animale(String specie, int età, String name) {
        this.specie = specie;
        this.età = età;
        this.name = name;
    }
}
