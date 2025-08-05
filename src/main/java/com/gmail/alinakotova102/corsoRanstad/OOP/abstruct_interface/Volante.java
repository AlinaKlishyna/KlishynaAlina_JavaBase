package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

public interface Volante {
    void vola();
}

class Aquila implements Volante{

    @Override
    public void vola() {
        System.out.println("Vz-z-z");
    }
}
