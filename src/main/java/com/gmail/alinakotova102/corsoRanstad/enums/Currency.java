package com.gmail.alinakotova102.corsoRanstad.enums;

public enum Currency {
    EURO("€"),
    DOLLAR("$"),
    YEN("¥");

    private final String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}