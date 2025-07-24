package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.due_costruttori;

public class Auto {
    private String marca;
    private int anno;

    public Auto() {

    }

    public Auto(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", anno=" + anno +
                '}';
    }
}
