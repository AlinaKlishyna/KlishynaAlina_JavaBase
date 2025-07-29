package com.gmail.alinakotova102.corsoRanstad.polimorfismo.overloade.sezione3;

public class Prodotto {
    private String nome;
    private double prezzo;

    public static int totaleVendite;

    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        totaleVendite+=prezzo;
    }
}
