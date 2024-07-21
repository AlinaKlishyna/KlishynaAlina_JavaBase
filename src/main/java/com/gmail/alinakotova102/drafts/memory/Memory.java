package com.gmail.alinakotova102.drafts.memory;

import java.util.concurrent.TimeUnit;

public class Memory {
    public static void main(String[] args) throws InterruptedException {
        var value = new byte[1_000_000_000];
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            value[i] = 1;

            //slow down by 1 sec
            if (i % 10000 == 0) {
                Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            }

            if (i % 100_000 == 0) {
                System.gc(); //garbage collector
            }
        }
        System.out.println(value.length);
    }
}

