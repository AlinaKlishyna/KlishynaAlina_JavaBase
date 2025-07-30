package com.gmail.alinakotova102.corsoRanstad.OOP.sezione2_array_override_ereditarietà;

public class Animale {
    protected void faVerso() {
        System.out.println("Boom!");
    }
}

class Leone extends Animale {
    @Override
    protected void faVerso() {
        System.out.println("Raaaw!");
    }
}

class Cane extends Animale {
    @Override
    protected void faVerso() {
        System.out.println("Gav-Gav!");
    }
}

class Uccello extends Animale {
    @Override
    protected void faVerso() {
        System.out.println("Cirik-Cirik");
    }
}
