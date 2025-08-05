package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

public class Stampante implements Periferica{
    @Override
    public void connetti() {
        System.out.println("Connect!");
    }
}

interface Periferica {
    void connetti();
}