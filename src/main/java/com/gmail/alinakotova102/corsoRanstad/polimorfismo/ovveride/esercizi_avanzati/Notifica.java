package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_avanzati;

public class Notifica {
    void mostra() {
        System.out.println("Notifica: ");
    }
}

class NotificaPush extends Notifica {
    @Override
    void mostra() {
        super.mostra();
        System.out.println("Push ricevuta");
    }
}