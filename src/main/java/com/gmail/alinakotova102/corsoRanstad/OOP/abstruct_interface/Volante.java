package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

public interface Volante {
    void vola();
}


interface Combattente {
    void fuoco();
}

class Supereroe implements Volante, Combattente {

    @Override
    public void vola() {
        System.out.println("Bz-z-z");
    }

    @Override
    public void fuoco() {
        System.out.println("Hz!");
    }
}

class Aquila implements Volante {

    @Override
    public void vola() {
        System.out.println("Vz-z-z");
    }
}
