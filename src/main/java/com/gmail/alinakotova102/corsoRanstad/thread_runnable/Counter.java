package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class Counter implements Runnable {
    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    @Override
    public  void run() {
        for (int i = 0; i < 5; i++) {
            increment();
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Counter());
        Thread thread2 = new Thread(new Counter());
        Thread thread3 = new Thread(new Counter());

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count);
    }
}
