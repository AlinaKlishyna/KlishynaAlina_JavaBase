package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.equals;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Anatoliy", 23);
        Student student2 = new Student("Anatoliy", 23);
        System.out.println(student.equals(student2));

        System.out.println(student.countStudents);
    }
}
