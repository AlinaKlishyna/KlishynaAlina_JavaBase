package com.gmail.alinakotova102.drafts;

import java.util.Scanner;

public class StepArrays {
    public static void main(String[] args) {
        System.out.println(enterNumber());

    }

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0 && number < 999) {
                    return number;
                } else {
                    System.out.print("Enter a number between [1-999]: ");
                }
            } else {
                System.out.print("Value non valid! Enter again: ");
                scanner.nextLine();
            }
        }
    }
}
