package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.classe_contatore;

public class IDGenerator {
    private int ID;

    public IDGenerator() {
        ID = createID();
    }

    public int getID() {
        return ID;
    }

    public int createID() {
        return (int) ((Math.random() * (9999 - 1000)) + 1000);
    }
}
