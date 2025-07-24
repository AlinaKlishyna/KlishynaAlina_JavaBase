package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.metodo_distanza;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanzaX(Punto altroPunto) {
        return altroPunto.x > this.x ? altroPunto.x - this.x : this.x - altroPunto.x;
    }

    public int distanzaY(Punto altroPunto) {
        return altroPunto.y > this.y ? altroPunto.y - this.y : this.y - altroPunto.y;
    }
}
