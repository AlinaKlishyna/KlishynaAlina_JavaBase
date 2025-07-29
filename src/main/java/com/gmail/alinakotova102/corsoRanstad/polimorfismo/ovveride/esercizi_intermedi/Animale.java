package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_intermedi;

public class Animale {
    void faVerso() {
        System.out.println("Verso generico");
    }

    void muoviti() {
        System.out.println("Clock-clock");
    }
}

class Uccello extends Animale {
    @Override
    void muoviti() {
        System.out.println("Chik-chik");
    }
}


class Cane extends Animale {
    @Override
    void faVerso() {
        super.faVerso(); // chiama metodo della superclasse
        System.out.println("Bau");
    }
}
