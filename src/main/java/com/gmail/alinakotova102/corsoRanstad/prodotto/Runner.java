package com.gmail.alinakotova102.corsoRanstad.prodotto;

import java.util.Scanner;


public class Runner {
    static String[] titleProduct = new String[]{"BMW 2014 4v", "Audi 2010 4v", "Fiat 2019 5v"};
    static double[] priceProduct = new double[]{6500, 4000, 10500};
    static Scanner scanner = new Scanner(System.in);
    static double sum = 0.0;
    static int quantityTotal = 0;

    public static void main(String[] args) {
        selectProduct();
        selectMoreProduct();
    }

    public static void selectMoreProduct() {
        System.out.println("Would you like to order more goods?\n1 - Yes\n2 - No");
        int select = scanner.nextInt();

        if (select == 1) {
            selectProduct();
            selectMoreProduct();
        } else if (select == 2) {
            System.out.println("Your check: " + sum);
        }
    }

    public static void selectProduct() {
        System.out.println("Select a product: ");
        int i = 0;
        for (String title : titleProduct) {
            System.out.println((i + 1) + " - " + title + " - " + priceProduct[i]);
            i++;
        }
        int product = scanner.nextInt();
        while (product < 0) {
            product = scanner.nextInt();
        }
        System.out.println("Select a quantity: ");
        int quantityProduct = scanner.nextInt();
        while (quantityProduct <= 0) {
            quantityProduct = scanner.nextInt();
        }
        quantityTotal += quantityProduct;

        sum += checkUser((product - 1), quantityProduct);
        if (quantityTotal >= 10) {
            sum -= (sum * 0.10);
            System.out.println("Discount! The number of products exceeds 10!");
        }
    }

    public static double checkUser(int numberTitle, int quantity) {
        double sum = 0;
        for (int i = 0; i < titleProduct.length; i++) {
            if (i == numberTitle) {
                sum += (priceProduct[i] * quantity);
            }
        }
        return sum;
    }
}
