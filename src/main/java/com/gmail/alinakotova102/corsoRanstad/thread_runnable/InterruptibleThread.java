package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class InterruptibleThread extends Thread {
    private volatile boolean run = false;

    public void stopRunning() {
        run = false;
        this.interrupt();
    }

    @Override
    public void run() {
        while (run) {
            try {
                Thread.sleep(200);

                System.out.println("I work..");
            } catch (InterruptedException e) {
                System.out.println("The flow was interrupted during sleep");
                run = false;
            }
        }

        System.out.println("The thread has completed its work.");
    }


    public static void main(String[] args) throws InterruptedException {
        InterruptibleThread thread = new InterruptibleThread();
        thread.start();

        Thread.sleep(2000);

        System.out.println("Stop..");

        thread.stopRunning();

        thread.join();
    }
}
