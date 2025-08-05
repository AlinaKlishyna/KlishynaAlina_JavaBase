package com.gmail.alinakotova102.corsoRanstad.esercizi.esercizi4_8;

public interface Stampabile {
    void displayInfo();
}

class Auto implements Stampabile {

    @Override
    public void displayInfo() {
        System.out.println("Auto!");
    }
}

class Aereo implements Stampabile {

    @Override
    public void displayInfo() {
        System.out.println("Aereo!");
    }
}
