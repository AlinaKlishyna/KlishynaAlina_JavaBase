package com.gmail.alinakotova102.pattern.singleton;

public class StoreConfig {
    private String name = "Amazon";
    private double vatRate = 0.22;
    private static final StoreConfig INSTANCE = new StoreConfig();

    private StoreConfig() {
    }
    public static StoreConfig getInstance() {
        return INSTANCE;
    }
    public double calculatePriceWithVat(double basePrise) {
        return basePrise * (1 + vatRate);
    }
}
