package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClockSimulation implements Runnable {
    private static final int MILLIS = 1000;
    private static volatile boolean running = false;

    @Override
    public void run() {
        while (running) {
            LocalDateTime now = LocalDateTime.now();

            String time = now.format(DateTimeFormatter.ISO_TIME);

            System.out.println("Current time: " + time);

            try {
                Thread.sleep(MILLIS);
            } catch (InterruptedException e) {
                System.out.println("Stop..");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Thread thread = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:\n");
            System.out.println("1. Start the clock");
            System.out.println("2. Stop the clock");
            System.out.println("3. Exit");

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    if (!running) {
                        running = true;
                        thread = new Thread(new ClockSimulation());
                        thread.start();
                    }
                    break;
                case "2":
                    if (running) {
                        running = false;
                        thread.interrupt(); //завершение потока
                    }
                    break;
                case "3":
                    if (running) {
                        running = false;
                        thread.interrupt();
                    }
                    exit = true;
                    break;

            }
        }
        scanner.close();
    }
}
