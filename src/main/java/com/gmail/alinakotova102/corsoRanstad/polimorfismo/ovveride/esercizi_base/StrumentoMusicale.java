package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_base;

public class StrumentoMusicale {
    public void suona() {
        System.out.println("Bz-z-z");
    }
}

class Chitarra extends StrumentoMusicale {
    @Override
    public void suona() {
        System.out.println("Strimp strimp");
    }
}
