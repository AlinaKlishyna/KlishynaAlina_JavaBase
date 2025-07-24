package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.metodo_distanza;

public class Main {
    public static void main(String[] args) {
        Punto first = new Punto(3,16);
        Punto second = new Punto(18, 7);
        System.out.println("x: " + first.distanzaX(second));
        System.out.println("y: " + first.distanzaY(second));
    }
}
