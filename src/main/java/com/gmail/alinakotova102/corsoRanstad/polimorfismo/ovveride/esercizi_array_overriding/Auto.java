package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_array_overriding;

public class Auto {
    void parti() {
        System.out.println("-");
    }
}

class Elettrica extends Auto {
    @Override
    void parti() {
        System.out.println("Ps-s-s");
    }
}

class Diesel extends Auto {
    @Override
    void parti() {
        System.out.println("Bzh-zh-zh");
    }
}
