package com.gmail.alinakotova102.corsoRanstad.OOP.abstruct_interface;

public class Robot implements Movimento, Parlante{

    @Override
    public void move() {
        System.out.println("Moving..");
    }

    @Override
    public void speak() {
        System.out.println("Speaking..");
    }
}

interface Movimento {
    void move();
}

interface Parlante {
    void speak();
}
