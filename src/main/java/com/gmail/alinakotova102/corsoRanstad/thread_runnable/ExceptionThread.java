package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class ExceptionThread extends Thread{
    @Override
    public void run() {
        String example = null;
        System.out.println(example.length());
    }

    public static void main(String[] args) {
        ExceptionThread thread = new ExceptionThread();
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
