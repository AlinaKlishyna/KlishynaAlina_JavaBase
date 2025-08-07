package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class TimeThread extends Thread {
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        long sum = 0;
        for (int i = 0; i < 100_000; i++) {
            sum += i;
        }

        long endTIme = System.currentTimeMillis();
        System.out.println("Time to process: " + (endTIme - startTime));
        System.out.println("Result: " + sum);
    }

    public static void main(String[] args) {
        TimeThread timeThread = new TimeThread();
        timeThread.start();
    }
}
