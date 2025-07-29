package com.gmail.alinakotova102.corsoRanstad.overloading.sezione2;

public class Auto {
    private String modello;
    private int anno;
    private String colore;

    public Auto(String modello) {
        this.modello = modello;
    }

    public Auto(String modello, int anno) {
        this.modello = modello;
        this.anno = anno;
    }

    public Auto(String modello, int anno, String colore) {
        this.modello = modello;
        this.anno = anno;
        this.colore = colore;
    }

}
