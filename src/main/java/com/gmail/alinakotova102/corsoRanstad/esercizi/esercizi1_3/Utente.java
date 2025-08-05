package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi1_3;

import java.util.HashMap;

public class Utente {
    private String nome;
    private int età;

    public Utente(String nome, int età) {
        this.nome = nome;
        this.età = età;
    }

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return età;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", età=" + età +
                '}';
    }
}

class Runner {
    public static void main(String[] args) {
        HashMap<String, Utente> map = new HashMap<>();
        map.put("text", new Utente("Jiba", 12));
        map.put("text1", new Utente("Alina", 35));
        map.put("text2", new Utente("Bodya", 5));
        map.put("text3", new Utente("Vlad", 23));
        for (Utente utente : map.values()) {
            if (utente.getNome().equalsIgnoreCase("Alina")) {
                System.out.println(utente);
            }
        }
    }
}