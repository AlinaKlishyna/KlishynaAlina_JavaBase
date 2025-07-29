package com.gmail.alinakotova102.corsoRanstad.enums;

public enum PricingPlan {
    Banana(20),
    Orange(25);

    int priceMonth;

    PricingPlan(int priceMonth) {
        this.priceMonth = priceMonth;
    }
}
