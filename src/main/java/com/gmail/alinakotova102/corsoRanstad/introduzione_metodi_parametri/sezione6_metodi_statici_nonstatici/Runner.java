package com.gmail.alinakotova102.corsoRanstad.introduzione_metodi_parametri.sezione6_metodi_statici_nonstatici;

public class Runner {
    public static void main(String[] args) {
        System.out.println(raddoppia(6));

        Persona persona = new Persona();
        persona.parla();
    }

    public static int raddoppia(int x) {
        return x * 2;
    }
}
