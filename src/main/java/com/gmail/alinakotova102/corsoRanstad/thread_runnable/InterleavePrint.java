package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class InterleavePrint implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);

            Thread.yield(); // по очереди
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new InterleavePrint());
        Thread thread2 = new Thread(new InterleavePrint());

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}

