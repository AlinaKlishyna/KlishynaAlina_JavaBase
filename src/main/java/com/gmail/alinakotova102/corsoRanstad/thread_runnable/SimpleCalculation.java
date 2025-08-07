package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

public class SimpleCalculation extends Thread{
    private int num;

    public SimpleCalculation(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + (Math.pow(num, i)));
        }
    }

    public static void main(String[] args) {
        SimpleCalculation thread1 = new SimpleCalculation(5);
        SimpleCalculation thread2 = new SimpleCalculation(10);
        SimpleCalculation thread3 = new SimpleCalculation(15);
        SimpleCalculation thread4 = new SimpleCalculation(20);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");
        thread4.setName("Thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
