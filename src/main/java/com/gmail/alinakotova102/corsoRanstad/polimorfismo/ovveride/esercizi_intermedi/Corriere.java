package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_intermedi;

public class Corriere {
    void consegna(String nome) {
        System.out.println("Consegna " + nome);
    }
}

class AmazonCorriere extends Corriere {
    @Override
    void consegna(String nome) {
        System.out.println("Prime delivery " + nome);
    }
}