package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_base;

public class Persona {
    private String nome;

    public Persona(String nome) {
        this.nome = nome;
    }

    protected void saluta() {
        System.out.println("Ciao! ");
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Persona: " + nome;
    }
}

class Studente extends Persona {
    public Studente(String nome) {
        super(nome);
    }

    @Override
    public void saluta() {
        super.saluta();
    }

    @Override
    public String toString() {
        return "Studente: " + super.getNome();
    }
}