package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

public abstract class Dispositivo {
    abstract void accendi();
}

class Smartphone extends Dispositivo{

    @Override
    void accendi() {
        System.out.println("Mi sto accendendo..");
    }
}
