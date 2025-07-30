package com.gmail.alinakotova102.corsoRanstad.OOP.sezione3_logiche_collezioni_static;

import java.util.HashMap;
import java.util.Map;

public class Contatto {
    private String name;
    private String lastname;
    private long phone;

    public static final Map<String, Contatto> CONTATTO_MAP = new HashMap<>();

    public Contatto(String name, String lastname, long phone) {
        if (!name.isEmpty() && !lastname.isEmpty()) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;

            aggiungi(name, lastname, this);
        }
    }

    public void aggiungi(String name, String lastname, Contatto contatto) {
        CONTATTO_MAP.put(name + " " + lastname, contatto);
    }

    public static Contatto cerca(String name) {
        for (Map.Entry<String, Contatto> keyValue : CONTATTO_MAP.entrySet()) {
            String key = keyValue.getKey();
            String nameMap = key.substring(0, key.indexOf(" "));
            if (name.equalsIgnoreCase(nameMap)) {
                return keyValue.getValue();
            }
        }
        return null;
    }

    public static void remove(Contatto contatto) {
        String key = "";
        if (CONTATTO_MAP.containsValue(contatto)) {
            for (Map.Entry<String, Contatto> map : CONTATTO_MAP.entrySet()) {
                if (map.getValue().equals(contatto)) {
                    key = map.getKey();
                    break;
                }
            }
        }

        CONTATTO_MAP.remove(key, contatto);
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone=" + phone +
                '}';
    }
}

class Runner {
    public static void main(String[] args) {
        Contatto[] contatti = {
                new Contatto("Nicolo", "Noco", 8536665),
                new Contatto("Giuseppe", "Brachetti", 8534439),
                new Contatto("Alina", "Klishyna", 6544439),
                new Contatto("Bax", "Bunny", 8534779),
                new Contatto("Gloria", "Bekket", 3654439)
        };

        int count = 1;
        for (Contatto contatto : Contatto.CONTATTO_MAP.values()) {
            System.out.println(count + " - " + contatto);
            count++;
        }

        System.out.println("Cerchiamo.. " + Contatto.cerca("Bax"));

        Contatto.remove(Contatto.cerca("Bax"));

        count = 1;
        for (Contatto contatto : Contatto.CONTATTO_MAP.values()) {
            System.out.println(count + " - " + contatto);
            count++;
        }
    }
}