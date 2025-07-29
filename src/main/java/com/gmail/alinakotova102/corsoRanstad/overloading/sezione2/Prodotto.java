package com.gmail.alinakotova102.corsoRanstad.overloading.sezione2;

public class Prodotto {
    private String name;
    private int prezzo;
    private String categoria;

    public Prodotto(String name) {
        this.name = name;
    }

    public Prodotto(String name, int prezzo) {
        this.name = name;
        this.prezzo = prezzo;
    }

    public Prodotto(String name, int prezzo, String categoria) {
        this.name = name;
        this.prezzo = prezzo;
        this.categoria = categoria;
    }
}
