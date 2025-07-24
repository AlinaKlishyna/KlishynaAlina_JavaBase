package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.array_oggetti;

public class Main {
    public static void main(String[] args) {
        Shop lidl = new Shop();
        lidl.addProduct(new Product("Banana", 15));
        lidl.displayProducts();
    }
}
