package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_base;

public class Documento {
    public void stampa() {
        System.out.println("Stampa..");
    }
}

class PDF extends Documento {
    @Override
    public void stampa() {
        super.stampa();
        System.out.println("PDF");
    }
}
