package com.gmail.alinakotova102.corsoRanstad.polimorfismo.overloade.sezione2;

public class Corso {
    private String nome;
    private String docente;
    private int ore;

    public Corso(String nome) {
        this.nome = nome;
    }

    public Corso(String nome, String docente) {
        this.nome = nome;
        this.docente = docente;
    }

    public Corso(String nome, String docente, int ore) {
        this.nome = nome;
        this.docente = docente;
        this.ore = ore;
    }
}
