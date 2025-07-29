package com.gmail.alinakotova102.corsoRanstad.enums;

import java.util.Scanner;

public class Example {
    Scanner scanner = new Scanner(System.in);
    Level level;
    public void example1() {
        level = Level.EASY;
        System.out.println("2 + 5 = ");
        int answer = scanner.nextInt();
        if (answer == 7)
            System.out.println("Correctly!");
        else System.out.println("Wrong");
    }
}
