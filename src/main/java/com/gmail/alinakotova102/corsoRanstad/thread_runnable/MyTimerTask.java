package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    private int count = 0;
    @Override
    public void run() {
        count++;
        System.out.println("Task " + count + ": " + Thread.currentThread().getName());

        if (count>=10) {
            System.out.println("Task finished..");
            this.cancel();
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        MyTimerTask task = new MyTimerTask();

        timer.schedule(task, 1000);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Stop!");
                timer.cancel();
            }
        }, 10000);
    }
}
