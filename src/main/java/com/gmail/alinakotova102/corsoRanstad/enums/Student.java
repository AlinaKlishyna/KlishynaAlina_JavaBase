package com.gmail.alinakotova102.corsoRanstad.enums;

public class Student {
    Gender gender;

    public Student(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gender=" + gender +
                '}';
    }
}
