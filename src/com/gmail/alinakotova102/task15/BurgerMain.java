package com.gmail.alinakotova102.task15;

public class BurgerMain {
    public static void main(String[] args) {
       Burger orderFirst = new Burger(Burger.getBun(), "chicken", 1, Burger.getCheese(), Burger.getHerbs(), Burger.getMayonnaise());
       Burger orderSecond = new Burger(Burger.getBun(), "pork", 2, Burger.getCheese(), Burger.getHerbs(), Burger.getMayonnaise());
       Burger orderThird = new Burger(Burger.getBun(), "chicken", 1, Burger.getCheese(), Burger.getHerbs());
    }
}
