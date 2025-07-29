package com.gmail.alinakotova102.corsoRanstad.OOP.sezione1_parole_testi_collezioni;

public abstract class Testo {
    public abstract void analizza(String text);
}

class Example1 extends Testo {

    @Override
    public void analizza(String text) {
        System.out.println("length: " + text.length());
    }
}

class Example2 extends Testo {

    @Override
    public void analizza(String text) {
        System.out.println("length to the text without space: " + text.replace(" ", "").length());
    }
}