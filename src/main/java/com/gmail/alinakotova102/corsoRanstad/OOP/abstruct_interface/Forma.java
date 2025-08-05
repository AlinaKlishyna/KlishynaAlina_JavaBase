package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

public abstract class Forma {
    public static final double PI = Math.PI;

    public double area(int r) {
        return r;
    }

    public double area(int a, int b) {
        return 0;
    }
}

class Cerchio extends Forma {
    @Override
    public double area(int r) {
        return Math.pow(r, 2);
    }
}

class Rettangolo extends Forma {
    @Override
    public double area(int a, int b) {
        return a * b;
    }
}
