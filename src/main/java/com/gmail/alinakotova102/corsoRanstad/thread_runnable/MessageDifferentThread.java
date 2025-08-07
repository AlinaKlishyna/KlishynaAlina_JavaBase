package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class MessageDifferentThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + (int)(100* Math.random() + 100));
        }
    }

    public static void main(String[] args) {
        MessageDifferentThread thread1 = new MessageDifferentThread();
        MessageDifferentThread thread2 = new MessageDifferentThread();
        MessageDifferentThread thread3 = new MessageDifferentThread();

        thread1.setName("Thread 1: ");
        thread2.setName("Thread 2: ");
        thread3.setName("Thread 3: ");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
