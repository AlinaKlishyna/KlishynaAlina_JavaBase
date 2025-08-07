package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

import java.util.concurrent.*;

public class CallableFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 0; i <=5; i++) {
                sum+=i;
                Thread.sleep(200);
            }
            return sum;
        };

        Future<Integer> future = executor.submit(task);
        try {
            Integer result = future.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}
