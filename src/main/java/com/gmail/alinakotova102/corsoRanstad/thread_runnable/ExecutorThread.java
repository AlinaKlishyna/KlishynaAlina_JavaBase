package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int finalI = i;
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " - " + finalI);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executorService.shutdown();
    }
}
