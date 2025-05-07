package com.gmail.alinakotova102.drafts.reference_method.task2;

public class Cat {
    private String name;
    private String color;

    void setColor(String color) {
        this.color = color;
    }

    void setName(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Кот\nИмя: " + name + "\nЦвет: " + color + "\n");
    }
}
