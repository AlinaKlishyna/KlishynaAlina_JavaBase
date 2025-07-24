package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.equals;

public class Student {
    private String name;
    private int age;

    public static int countStudents = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        countStudents++;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else if (obj instanceof Student) {
            Student other = (Student) obj;
            if (this.name==other.name) return true;
            if (this.age==other.age) return true;
        }
        return false;
    }
}
