package com.gmail.alinakotova102.corsoRanstad.polimorfismo.overloade.sezione3;

public class Runner {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(Person.contatore);
        Person.info();
        System.out.println(somma(2,4));
        Runner.info();
        System.out.println(Runner.PI);
        System.out.println(Matematica.moltiplica(2,7));
        System.out.println(Matematica.dividi(2,7));
        System.out.println("factorial 3 = " + Matematica.factorial(3));
        System.out.println("factorial 4 = " + Matematica.factorial(4));
    }

    private static void info() {
        System.out.println("Un metodo statico");
    }

    private static int somma(int a, int b) {
        return a+b;
    }
}
