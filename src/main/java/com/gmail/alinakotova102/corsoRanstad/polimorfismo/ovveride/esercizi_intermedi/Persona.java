package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_intermedi;

public class Persona {
    void cammina() {
        System.out.println("Vado..");
    }
}

class Atleta extends Persona {
    @Override
    void cammina() {
        System.out.println("Corre veloce");
    }
}