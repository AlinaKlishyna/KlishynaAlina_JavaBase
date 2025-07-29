package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_avanzati;

public class Dipendente {
    protected double bonus = 100.0;

    protected double calcolaBonus() {
        return bonus;
    }
}

class Manager extends Dipendente {
    @Override
    protected double calcolaBonus() {
        return super.bonus * 0.2;
    }
}
