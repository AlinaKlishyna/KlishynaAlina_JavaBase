package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SharedQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try {
            for (int i = 0; i <=10; i++) {
                System.out.println("The manufacturer produces: " + i);
                queue.put(i);

                    Thread.sleep(100);

            }

            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i <=10; i++) {
                    System.out.println("The consumer consumes: " + queue.take());
                    Thread.sleep(200);

                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
