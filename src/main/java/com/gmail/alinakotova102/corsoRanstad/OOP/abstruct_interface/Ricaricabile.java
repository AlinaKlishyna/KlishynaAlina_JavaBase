package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

public interface Ricaricabile {
    void ricarica();
}

class AutoElettrica implements Ricaricabile{

    @Override
    public void ricarica() {
        System.out.println("Start!");
    }
}
