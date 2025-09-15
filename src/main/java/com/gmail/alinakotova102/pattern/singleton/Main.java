package com.gmail.alinakotova102.pattern.singleton;

public class Main {
    public static void main(String[] args) {
        StoreConfig storeConfig = StoreConfig.getInstance();
        StoreConfig storeConfig2 = StoreConfig.getInstance();
        StoreConfig storeConfig3 = StoreConfig.getInstance();
        StoreConfig storeConfig4 = StoreConfig.getInstance();

        System.out.println(storeConfig.calculatePriceWithVat(100.0));

        System.out.println(storeConfig4);
    }
}
