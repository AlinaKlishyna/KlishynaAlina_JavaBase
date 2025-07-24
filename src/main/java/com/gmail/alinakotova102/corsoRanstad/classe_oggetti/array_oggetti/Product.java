package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.array_oggetti;
public class Product {
    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
