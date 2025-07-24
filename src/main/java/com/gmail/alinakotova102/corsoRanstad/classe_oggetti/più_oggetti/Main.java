package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.più_oggetti;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Federica", "Toky"),
                new Person("Rody", "Wally"),
                new Person("Janny", "Yanderson")};

        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
}
