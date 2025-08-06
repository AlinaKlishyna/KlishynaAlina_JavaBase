package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class VolatileExample {
    private volatile boolean flag = false;

    public void writer() {
        System.out.println("Writer thread started");
        flag = true;
    }

    public void reader() {
        System.out.println("Reader thread started");
        if (flag) {
            System.out.println("Flag is true");
        }
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();

        Thread writerThread = new Thread(() -> example.writer());
        Thread readerThread = new Thread(() -> example.reader());

        readerThread.start();
        writerThread.start();
    }
}
