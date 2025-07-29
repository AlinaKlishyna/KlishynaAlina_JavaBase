package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_intermedi;

public class Elettrodomestico {
    protected void accendi() {
        System.out.print("Accendo --> ");
    }
}

class Lavatrice extends Elettrodomestico {
    @Override
    protected void accendi() {
        super.accendi();
        System.out.print("Lavatrice");
    }
}