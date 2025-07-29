package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_intermedi;

public class Telefono {
    void chiama (int numero) {
        System.out.println(numero);
    }
}

class Smartphone extends Telefono {
    @Override
    void chiama(int numero) {
        System.out.println("Chiamata vocale IP");
    }
}
