package com.gmail.alinakotova102.corsoRanstad.OOP.sezione3_logiche_collezioni_static;

import java.util.HashMap;
import java.util.Map;

public class Oggetto {
    private int ID;

    public static final Map<Integer, Oggetto> OGGETTO_MAP = new HashMap<>();

    public Oggetto(int ID) {
        this.ID = ID;

        OGGETTO_MAP.put(this.ID, this);
    }

    public long getID() {
        return ID;
    }

    public static Oggetto cerca(int ID) {
        Oggetto oggetto = null;
        for (Map.Entry<Integer, Oggetto> map : OGGETTO_MAP.entrySet()) {
           if (map.getKey().equals(ID)) {
               oggetto = map.getValue();
           }
        }
        return oggetto;
    }

    @Override
    public String toString() {
        return "Oggetto{" +
                "ID=" + ID +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Oggetto[] oggetti = {
                new Oggetto(3252),
                new Oggetto(4233),
                new Oggetto(1444),
                new Oggetto(2451),
                new Oggetto(5255),
        };

        System.out.println(Oggetto.cerca(1444));;
    }
}