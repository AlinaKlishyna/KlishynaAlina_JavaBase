package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_base;

public class Computer {
    public void accendi() {
        System.out.println("Mi sto accendendo..");
    }
}

class Laptop extends Computer {
    @Override
    public void accendi() {
        System.out.println("Laptop acceso!");
    }
}