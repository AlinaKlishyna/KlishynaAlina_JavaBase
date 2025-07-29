package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_avanzati;

public class Pagamento {
    void esegui() {
        System.out.println("eseguito");
    }

}

class Carta extends Pagamento {
    @Override
    void esegui() {
        System.out.println("eseguito con carta");
    }
}


class Contanti extends Pagamento {
    @Override
    void esegui() {
        System.out.println("eseguito con contanti");
    }
}