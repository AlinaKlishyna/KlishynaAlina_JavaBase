package com.gmail.alinakotova102.task21;

import java.util.Scanner;

import static com.gmail.alinakotova102.task21.Drinks.menu;

public class Order {

    public static void create() {
        menu();
        System.out.println("7 - Exit");
        int number = 0;
        while (!(number == 7)) {
            System.out.println("Select from the list: ");
            number = selectNumber(0, 7);
            new DrinksMachine(Drinks.select(number));
        }
        System.out.printf("Ready!\nYour order quantity %d and total amount - %.2f$", DrinksMachine.getCount(),
                DrinksMachine.getTotalPrice());
    }

    public static int selectNumber(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                number = Integer.parseInt(scanner.next());
                if (number <= max && number >= min) {
                    return number;
                }
                System.out.println("Enter a number between 1-6: ");
                scanner.nextLine();
            } else {
                System.out.println("It's non number!");
                scanner.nextLine();
            }
        }
    }
}