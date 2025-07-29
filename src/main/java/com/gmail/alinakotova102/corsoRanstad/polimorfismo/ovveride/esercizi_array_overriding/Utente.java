package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_array_overriding;

public class Utente {
    void accedi() {
        System.out.println("Standard Edition");
    }
}

class UtentePremium extends Utente {
    String vantaggio;
    @Override
    void accedi() {
        super.accedi();
        vantaggio = "incluso";
    }
}
