package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_base;

public class Forma {

    protected static double PI = Math.PI;

    public double calcolaArea(int radius) {
        return 0;
    }
}

class Cerchio extends Forma {
    @Override
    public double calcolaArea(int radius) {
        return PI * Math.pow(radius,2);
    }
}
