package com.gmail.alinakotova102.corsoRanstad.overloading.sezione3;

public class Person {

    public static int click;
    public static int contatore;

    public Person() {
        contatore++;
    }

    public static int countReturnObjects() {
        return contatore;
    }

    public static void saluta(String nome) {
        System.out.println("Ciao! " + nome + ", come va?");
        click++;
    }

    protected static void info() {
        System.out.println("I'm person! :)");
    }
}
