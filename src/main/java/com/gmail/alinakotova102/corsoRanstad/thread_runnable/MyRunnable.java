package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Ciao dal runnable!");
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        new Thread(runnable).start();
    }
}
