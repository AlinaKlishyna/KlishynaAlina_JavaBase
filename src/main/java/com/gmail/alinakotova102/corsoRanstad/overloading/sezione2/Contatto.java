package com.gmail.alinakotova102.corsoRanstad.overloading.sezione2;

public class Contatto {
    private String name;
    private long telefono;
    private String email;

    public Contatto(String name) {
        this.name = name;
    }

    public Contatto(String name, long telefono) {
        this.name = name;
        this.telefono = telefono;
    }

    public Contatto(String name, long telefono, String email) {
        this.name = name;
        this.telefono = telefono;
        this.email = email;
    }
}
