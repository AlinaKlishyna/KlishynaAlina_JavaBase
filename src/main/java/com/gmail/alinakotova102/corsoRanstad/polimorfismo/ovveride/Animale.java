package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride;

public class Animale {
    void faVerso() {
        System.out.println("Verso generico");
    }
}

class Cane extends Animale {
    @Override
    void faVerso() {
        System.out.println("Bau");
    }
}
