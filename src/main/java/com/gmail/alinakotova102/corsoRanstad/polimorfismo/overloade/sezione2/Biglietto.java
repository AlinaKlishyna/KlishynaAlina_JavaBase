package com.gmail.alinakotova102.corsoRanstad.polimorfismo.overloade.sezione2;

import javax.xml.crypto.Data;

public class Biglietto {
    private String destinazione;
    private double prezzo;
    private Data data;

    public Biglietto(String destinazione) {
        this.destinazione = destinazione;
    }

    public Biglietto(String destinazione, double prezzo) {
        this.destinazione = destinazione;
        this.prezzo = prezzo;
    }

    public Biglietto(String destinazione, double prezzo, Data data) {
        this.destinazione = destinazione;
        this.prezzo = prezzo;
        this.data = data;
    }
}
