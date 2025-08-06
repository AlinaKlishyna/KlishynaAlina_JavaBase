package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class RaceSimulation {
    public static void main(String[] args) {
        Thread racer1 = new Thread(new Racer("Alina", 100));
        Thread racer2 = new Thread(new Racer("Anna", 200));
        Thread racer3 = new Thread(new Racer("Angelina", 150));

        System.out.println("Start!");

        racer1.start();
        racer2.start();
        racer3.start();
    }
}

class Racer implements Runnable {
    private final String name;
    private final int delay;

    public Racer(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
        for (int meter = 1; meter <= 10; meter++) {
            System.out.println(name + " ran through " + meter * 10 + " meters");
                Thread.sleep(delay);
        }
            System.out.println(name + " - finished!");
        } catch (InterruptedException e) {
            System.out.println(name + " dropped out of the race!");
        }
    }
}