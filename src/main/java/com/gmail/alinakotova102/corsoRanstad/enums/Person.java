package com.gmail.alinakotova102.corsoRanstad.enums;

public class Person {
    BloodGroup bloodGroup;
    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Person{" +
                "bloodGroup=" + bloodGroup +
                '}';
    }
}
