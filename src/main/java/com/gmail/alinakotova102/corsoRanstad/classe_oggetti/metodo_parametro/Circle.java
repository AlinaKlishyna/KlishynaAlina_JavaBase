package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.metodo_parametro;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (double) radius/2;
    }
}
