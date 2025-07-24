package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.metodo_usa_this;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean major() {
        return this.age>=18;
    }
}
