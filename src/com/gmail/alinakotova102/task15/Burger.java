package com.gmail.alinakotova102.task15;

public class Burger {
    private String bun;
    private String meat;
    private int countMeat;
    private String cheese;
    private String herbs;
    private String sauce;

    public Burger() {
        this.bun = "bun";
        this.cheese = "cheese";
        this.herbs = "herbs";
        this.sauce = "mayonnaise";
    }

    public Burger(String meat, int countMeat, String sauce) {
        this();
        this.meat = meat;
        this.countMeat = countMeat;
        this.sauce = sauce;
        info(bun, meat, countMeat, cheese, herbs, sauce);
    }

    public Burger(String meat, int countMeat) {
        this();
        this.meat = meat;
        this.countMeat = countMeat;
        info(bun, meat, countMeat, cheese, herbs);
    }

    public void info(String bun, String meat, int countMeat, String cheese, String herbs, String sauce) {
        if (countMeat == 1) {
            System.out.printf("Normal burger\nIngredients: %s, %s(count x%d), %s, %s, %s\n\n", bun, meat, countMeat,
                    cheese, herbs, sauce);
        } else {
            System.out.printf("Normal burger with double meat\nIngredients: %s, %s(count x%d), %s, %s, %s\n\n", bun,
                    meat, countMeat, cheese, herbs, sauce);
        }
    }

    public void info(String bun, String meat, int countMeat, String cheese, String herbs) {
        System.out.printf("Diet burger\nIngredients: %s, %s(count x%d), %s, %s\n\n", bun, meat, countMeat,
                cheese, herbs);
    }
}