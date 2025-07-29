package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_base;

public class Gioco {
    protected String avvia() {
        return "Giocco";
    }
}

class Videogioco extends Gioco{
    @Override
    protected String avvia() {
        return "Videogioco!";
    }
}