package com.gmail.alinakotova102.corsoRanstad.netto;

public class Runner {
    public static void main(String[] args) {
        Reddito reddito = new Reddito();
        System.out.println(reddito.calculateNetIncome(12500, (byte) 2));
    }
}
