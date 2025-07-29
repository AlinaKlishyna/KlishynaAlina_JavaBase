package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_intermedi;

public class ContoBancario {
    int conto;
    public double preleva(int soldi) {
        return conto-soldi;
    }
}

class ContoSicuro extends ContoBancario {
    @Override
    public double preleva(int soldi) {
        return soldi<=super.conto ? super.preleva(soldi) : 0;
    }
}
