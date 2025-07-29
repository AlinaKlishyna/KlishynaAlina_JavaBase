package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_base;

public class Auto {
    void parti() {
        System.out.println("Silenziosa");
    }
}

class Elettrica extends Auto {
    @Override
    void parti() {
        System.out.println("Silenziosa partenza...");
    }
}
