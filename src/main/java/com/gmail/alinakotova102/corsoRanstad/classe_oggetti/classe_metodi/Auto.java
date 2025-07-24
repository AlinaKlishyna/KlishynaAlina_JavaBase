package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.classe_metodi;

public class Auto {
    private String marca;
    private int anno;

    public Auto(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void mostraInfo() {
        System.out.println("Auto: marca(" + marca + "), anno(" + anno + ");");
    }
}
