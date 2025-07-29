package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_avanzati;

public class Giocattolo {
    void gioca() {
        System.out.println("Gioca..");
    }
}

class Puzzle extends Giocattolo {
    @Override
    void gioca() {
        System.out.println("Monta i pezzi");
    }
}