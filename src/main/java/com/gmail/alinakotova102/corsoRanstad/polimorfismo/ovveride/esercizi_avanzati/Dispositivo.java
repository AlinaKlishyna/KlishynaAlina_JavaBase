package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_avanzati;

public class Dispositivo {
    void riavvia() {
        System.out.print("accendo -->");
    }
}

class SmartTV extends Dispositivo {
    @Override
    void riavvia() {
        super.riavvia();
        System.out.println("SmartTV");
    }
}
