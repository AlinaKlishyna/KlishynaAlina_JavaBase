package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

public interface Animale {
    void verso();
}

class Gatto implements Animale {

    @Override
    public void verso() {
        System.out.println("Meow");
    }
}

class Cane implements Animale {

    @Override
    public void verso() {
        System.out.println("Gav-gav");
    }
}