package com.gmail.alinakotova102.task15;

public class Burger {
    private static String bun = "bun";
    private String meat;
    private int countMeat;
    private static String cheese = "cheese";
    private static String herbs = "herbs";
    private static String mayonnaise = "mayonnaise";

    public static String getBun() {
        return bun;
    }

    public static String getCheese() {
        return cheese;
    }

    public static String getHerbs() {
        return herbs;
    }

    public static String getMayonnaise() {
        return mayonnaise;
    }

    public Burger(String bun, String meat, int countMeat, String cheese, String herbs, String mayonnaise) {
        Burger.bun = bun;
        this.meat = meat;
        this.countMeat = countMeat;
        Burger.cheese = cheese;
        Burger.herbs = herbs;
        Burger.mayonnaise = mayonnaise;
        info(bun, meat, countMeat, cheese, herbs, mayonnaise);
    }

    public Burger(String bun, String meat, int countMeat, String cheese, String herbs) {
        Burger.bun = bun;
        this.meat = meat;
        this.countMeat = countMeat;
        Burger.cheese = cheese;
        Burger.herbs = herbs;
        info(bun, meat, countMeat, cheese, herbs);
    }

    public void info(String bun, String meat, int countMeat, String cheese, String herbs, String mayonnaise) {
        if (countMeat == 1) {
            System.out.printf("Normal burger\nIngredients: %s, %s(count x%d), %s, %s, %s\n\n", bun, meat, countMeat,
                    cheese, herbs, mayonnaise);
        } else {
            System.out.printf("Normal burger with double meat\nIngredients: %s, %s(count x%d), %s, %s, %s\n\n", bun,
                    meat, countMeat, cheese, herbs, mayonnaise);
        }
    }

    public void info(String bun, String meat, int countMeat, String cheese, String herbs) {
        System.out.printf("Diet burger\nIngredients: %s, %s(count x%d), %s, %s\n\n", bun, meat, countMeat,
                cheese, herbs);
    }
}