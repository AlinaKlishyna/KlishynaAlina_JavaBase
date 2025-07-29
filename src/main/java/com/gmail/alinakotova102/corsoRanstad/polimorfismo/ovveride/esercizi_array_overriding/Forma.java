package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_array_overriding;

public class Forma {
    public static final double PI = Math.PI;
    double calcolaArea(int r) {
        return 0;
    }
}

class Cerchio extends Forma {
    @Override
    double calcolaArea(int r) {
        return PI * Math.pow(r, 2);
    }
}

class Quadrato extends Forma {
    @Override
    double calcolaArea(int r) {
        return Math.pow(r, 2);
    }
}

class Runner2 {
    public static void main(String[] args) {
        System.out.println(new Cerchio().calcolaArea(5));
        System.out.println(new Quadrato().calcolaArea(5));
    }
}