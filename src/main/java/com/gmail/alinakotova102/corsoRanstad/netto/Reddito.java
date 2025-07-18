package com.gmail.alinakotova102.corsoRanstad.netto;

public class Reddito {
    /*
    Scrivi un programma che calcoli il reddito netto di un utente dopo le tasse. Il programma deve: Chiedere all'utente di inserire il proprio reddito lordo annuale. Chiedere all'utente di inserire il numero di figli a carico.
Calcolare le tasse da pagare in base al reddito lordo: Reddito fino a 15,000 Euro: 10% Reddito da 15,001 a 30,000 Euro: 15% Reddito oltre 30,000 Euro: 20% Applicare uno sconto sulle tasse di 500 Euro per ogni figlio a carico. Stampare il reddito netto dopo le tasse.
     */
    private byte countKids;
    private int income; // reddito

    public byte getCountKids() {
        return countKids;
    }

    public void setCountKids(byte countKids) {
        this.countKids = countKids;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public double calculateNetIncome(int income, byte countKids) {
        double result = 0;
        if (income < 15000) {
            result = income * 0.10;
        } else if (income > 15000 && income < 30000) {
            result = 15000 * 0.10 + (income - 15000) * 0.15;
        } else if (income > 30000) {
            result = 15000 * 0.10 + (15000 * 0.15) + (income-30000) * 0.20;
        }
        result -= calculateTaxKids(countKids);
        return result < 0 ? 0 : result;
    }

    public int calculateTaxKids(int countKids) {
        return countKids * 500;
    }
}
