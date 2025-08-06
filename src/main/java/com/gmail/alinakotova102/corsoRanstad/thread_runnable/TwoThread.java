package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class TwoThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Ciao dal Runnable!");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new TwoThread());
        Thread thread2 = new Thread(new TwoThread());

        thread1.start();
        thread2.start();
    }
}
