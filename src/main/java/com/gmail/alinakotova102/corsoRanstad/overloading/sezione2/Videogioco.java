package com.gmail.alinakotova102.corsoRanstad.overloading.sezione2;

public class Videogioco {
    private String nome;
    private String piattaforma;
    private String genere;

    public Videogioco(String nome) {
        this.nome = nome;
    }

    public Videogioco(String nome, String piattaforma) {
        this.nome = nome;
        this.piattaforma = piattaforma;
    }

    public Videogioco(String nome, String piattaforma, String genere) {
        this.nome = nome;
        this.piattaforma = piattaforma;
        this.genere = genere;
    }
}
