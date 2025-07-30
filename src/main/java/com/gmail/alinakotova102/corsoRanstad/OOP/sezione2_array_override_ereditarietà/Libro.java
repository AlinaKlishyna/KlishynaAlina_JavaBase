package com.gmail.alinakotova102.corsoRanstad.OOP.sezione2_array_override_ereditarietà;

public class Libro {
    private String name;
    private int anno;
    private String tipo;

    public Libro(String name, int anno, String tipo) {
        this.name = name;
        this.anno = anno;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public int getAnno() {
        return anno;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "name='" + name + '\'' +
                ", anno=" + anno +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

class Dizionario extends Libro {

    public Dizionario(String name, int anno, String genere) {
        super(name, anno, genere);
    }
}
