package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_intermedi;

public class Veicolo {
    int velocitàMax() {
        return 60;
    }
}

class Bicicletta extends Veicolo {

    @Override
    int velocitàMax() {
       return 45;
    }
}