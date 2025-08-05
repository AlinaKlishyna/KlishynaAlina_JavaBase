package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface.comparable;

public class Libro implements Comparable<Libro>{
    private String titolo;

    public Libro(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }


    @Override
    public int compareTo(Libro o) {
        return this.titolo.compareTo(o.titolo);
    }
}
