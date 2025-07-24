package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.classe_contatore;

public class Main {
    public static void main(String[] args) {
        IDGenerator[] IDs = new IDGenerator[10];
        int i = 0;
        while (i < 10) {
            IDs[i] = new IDGenerator();
            i++;
        }
        for (IDGenerator id : IDs) {
            System.out.println(id.getID());
        }
    }
}
