package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.controllo_attributi_costruttore;

public class Prodotto {
    private double prezzo;

    public Prodotto(int prezzo) {
        if (prezzo>0)
            this.prezzo=prezzo;
    }
}
