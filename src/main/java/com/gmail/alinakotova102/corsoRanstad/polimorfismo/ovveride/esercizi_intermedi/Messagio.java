package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_intermedi;

public class Messagio {
    void invia(String testo) {
        System.out.println(testo);
    }
}

class Email extends Messagio {
    @Override
    void invia(String testo) {
        System.out.println("\"" + testo + "\"");
    }
}
