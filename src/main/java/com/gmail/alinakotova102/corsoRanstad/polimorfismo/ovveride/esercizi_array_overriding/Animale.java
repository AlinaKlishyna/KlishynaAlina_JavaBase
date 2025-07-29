package com.gmail.alinakotova102.corsoRanstad.polimorfismo.ovveride.esercizi_array_overriding;

public class Animale {
    void faVerso() {
        System.out.println("Boo");
    }

    @Override
    public String toString() {
        return "Animale";
    }
}

class Cane extends Animale {

    @Override
    void faVerso() {
        System.out.println("Gav-gav");
    }

    @Override
    public String toString() {
        return "Cane";
    }
}

class Gatto extends Animale {

    @Override
    void faVerso() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Gatto";
    }
}

class Uccello extends Animale {

    @Override
    void faVerso() {
        System.out.println("Chik-chik");
    }

    @Override
    public String toString() {
        return "Uccello";
    }
}

class Runner {
    public static void main(String[] args) {
        Animale[] animali = {new Gatto(), new Cane(), new Uccello(), new Gatto()};
        for (Animale animale : animali) {
            System.out.println(animale);
        }
    }
}