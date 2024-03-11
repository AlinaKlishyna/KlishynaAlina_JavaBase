package com.gmail.alinakotova102.task21;

import static com.gmail.alinakotova102.task21.Drinks.UNKNOWN;

public class DrinksMachine {
    private Drinks name;
    private static double price;
    private static int count;
    private static double totalPrice;

    public DrinksMachine(Drinks name) {
        if (!(name == UNKNOWN)) {
            this.name = name;
            totalPrice += getPrice(name);
            count++;
            System.out.println("Drink: " + name + " - " + price + "(" + count + ")" + "\nTotal sum: " + totalPrice);
        }
    }

    public static int getCount() {
        return count;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static double getPrice(Drinks name) {
        switch (name) {
            case COFFEE:
            case TEA:
                price = DrinksPrice.getCAFETERIA();
                break;
            case LEMONADE:
                price = DrinksPrice.getWITHOUT_ALCOHOL();
                break;
            case MOJITO:
                price = DrinksPrice.getALCOHOL();
                break;
            case MINERAL:
                price = DrinksPrice.getWATER();
                break;
            case COCA_COLA:
                price = DrinksPrice.getFLAVORED_DRINKS();
                break;
            case UNKNOWN:
                price = 0.0;
                break;
        }
        return price;
    }

    public static void composition(Drinks name) {
        System.out.print("Composition: ");
        switch (name) {
            case COFFEE:
                System.out.print("Brazilian coffee, milk");
                break;
            case TEA:
                System.out.print("Indian tea");
                break;
            case MOJITO:
                System.out.print("Mint, white rum, soda, ice");
                break;
            case MINERAL:
                System.out.print("Mineral");
                break;
            case LEMONADE:
                System.out.print("Lemon, soda, sugar");
                break;
            case COCA_COLA:
                System.out.print("Coca-cola");
                break;
            case UNKNOWN:
                System.out.print(" - ");
                break;
        }
        System.out.println("\n");
    }
}