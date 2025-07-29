package com.gmail.alinakotova102.corsoRanstad.overloading.sezione2;

public class Libro {
    private String titolo;
    private String autore;
    private int anno;

    public Libro(String titolo) {
        this.titolo = titolo;
    }

    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public Libro(String titolo, String autore, int anno) {
        this.titolo = titolo;
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", anno=" + anno +
                '}';
    }
}
