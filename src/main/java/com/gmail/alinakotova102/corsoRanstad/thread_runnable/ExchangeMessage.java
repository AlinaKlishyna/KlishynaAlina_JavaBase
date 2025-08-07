package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class ExchangeMessage{
    public static void main(String[] args) {
        final Object user1 = new Object();
        final Object user2 = new Object();

        String[] questions = {"How are u?", "How are doing?"};

        Thread user1Thread = new Thread(() -> {
        try {
            for (String question : questions) {
                synchronized (user1) {
                    System.out.println("User 1" + question);
                    synchronized (user2) {
                        user2.notify();
                    }
                    user1.wait();
                }
            }
        } catch (InterruptedException e ) {
            Thread.currentThread().interrupt();
        }
        });

        String[] responses = {"Everything is fine, thank you!", "Nothing :("};
        Thread user2Thread = new Thread(() -> {
            try {
                for (String response : responses) {
                    synchronized (user2) {
                        user2.wait();
                        System.out.println("User 2" + response);

                        synchronized (user1) {
                            user1.notify();
                        }
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        user1Thread.start();
        user2Thread.start();
    }
}
