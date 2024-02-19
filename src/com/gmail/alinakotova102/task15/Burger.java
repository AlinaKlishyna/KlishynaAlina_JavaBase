package com.gmail.alinakotova102.task15;

public class Burger {
    private String nameBurger;
    private String bun;
    private String meat;
    private int countMeat;
    private String cheese;
    private String herbs;
    private String sauce;

    public Burger() {
        this.nameBurger = "Normal burger";
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

    public void info(String bun, String meat, int countMeat, String cheese, String herbs, String sauce) {
        if (sauce == null){
            this.nameBurger = "Diet burger";
            System.out.printf("%s\nIngredients: %s, %s(count x%d), %s, %s\n\n", nameBurger, bun, meat, countMeat,
                    cheese, herbs);
        }else {
            if (countMeat == 1) {
                System.out.printf("%s\nIngredients: %s, %s(count x%d), %s, %s, %s\n\n", nameBurger, bun, meat, countMeat,
                        cheese, herbs, sauce);
            } else {
                this.nameBurger += " with double meat";
                System.out.printf("%s\nIngredients: %s, %s(count x%d), %s, %s, %s\n\n", nameBurger, bun,
                        meat, countMeat, cheese, herbs, sauce);
            }
        }
    }
}