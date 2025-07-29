package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_intermedi;

public class Browser {
    public void apriPagina() {
        System.out.println("Apro..");
    }
}

class Chrome extends Browser {
    @Override
    public void apriPagina() {
        System.out.println("Apro Chrome..");
    }
}