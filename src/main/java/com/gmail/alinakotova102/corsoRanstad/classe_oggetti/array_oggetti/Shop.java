package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.array_oggetti;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<Product> product = new ArrayList<>();

    public void addProduct(Product product) {
        this.product.add(product);
    }

    public void displayProducts() {
        for (Product product : this.product) {
            System.out.println(product);
        }
    }
}
