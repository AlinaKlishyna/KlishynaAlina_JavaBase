package com.gmail.alinakotova102.task15;

public class Burger {
    private String name;
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
    }

    public Burger(String meat, String sauce) {
        this();
        this.name = "Normal burger";
        this.meat = meat;
        this.countMeat = 1;
        this.sauce = sauce;
        info(name, bun, meat, countMeat, cheese, herbs, sauce);
    }

    public Burger(String meat, int countMeat, String sauce) {
        this();
        this.name = "Double meat burger";
        this.meat = meat;
        this.countMeat = countMeat;
        this.sauce = sauce;
        info(name, bun, meat, countMeat, cheese, herbs, sauce);
    }

    public Burger(String meat, int countMeat) {
        this();
        this.name = "Diet burger";
        this.meat = meat;
        this.countMeat = countMeat;
        this.sauce = null;
        info(name, bun, meat, countMeat, cheese, herbs, sauce);
    }

    public void info(String name, String bun, String meat, int countMeat, String cheese, String herbs, String sauce) {
        System.out.printf("%s\nIngredients: %s, %s(count x%d), %s, %s\n\n", name, bun, meat, countMeat,
                cheese, herbs);
    }
}