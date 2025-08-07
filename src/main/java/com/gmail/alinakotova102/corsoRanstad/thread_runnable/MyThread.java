package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class MyThread extends Thread {
    private static int count = 1;

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(count);
                count++;
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }
}
