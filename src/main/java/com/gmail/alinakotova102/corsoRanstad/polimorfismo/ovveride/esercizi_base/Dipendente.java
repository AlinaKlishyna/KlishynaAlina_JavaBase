package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_base;

public class Dipendente {
    public double getStipendio() {
        return 1000;
    }
}

class Manager extends Dipendente {
    @Override
    public double getStipendio() {
        return super.getStipendio() + 500;
    }
}