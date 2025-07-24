package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.tostring;

public class Book {
    private String name;
    private int year;
    private String author;

    public Book(String name, int year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }
}
