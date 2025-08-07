package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class EverySecond extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 100; i+=10) {
                System.out.println("Downloading.. " + i + "%");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        EverySecond everySecond = new EverySecond();
        everySecond.start();
    }
}