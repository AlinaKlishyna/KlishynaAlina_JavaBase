package com.gmail.alinakotova102.corsoRanstad.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Name {
    static HashMap<String, Integer> person = new HashMap<>();

    static {
        person.put("Luca", 18);
        person.put("Sara", 21);
        person.put("Marco", 19);
        person.put("Nicolò", 19);
    }

    public static void main(String[] args) {
        System.out.println("Stampare l’intero HashMap: " + person);

        System.out.println("\nRecuperare un valore: Sara(" + getAge("Sara") + ")");

        System.out.println("\nModificare un valore: Nicolò -> 20");
        setAge("Nicolò", 20);
        System.out.println(person);

        System.out.println("\nVerificare se un valore esiste: età -> 21? " + checkAge(21));

        System.out.println("\nRimuovere un elemento: Luca");
        remove("Luca");
        System.out.println(person);

        System.out.println("\nStampare solo le chiavi: ");
        allKeys();

        System.out.println("\nStampare solo i valori: ");
        allValues();

        System.out.println("\nStampare ogni voce con un ciclo: ");
        display();

        System.out.println("\nContare le voci: " + countItem());

        System.out.println("\nSvuotare l’HashMap");
        removeAll();
        System.out.println(person);

        System.out.println("\nVerificare se è vuoto: " + isEmpty());

        System.out.println("\nCopiare un HashMap: ");
        HashMap<String, Integer> copy = new HashMap<>();
        copy(person, copy);
        System.out.println("Copia: " + copy);

        System.out.println("\nInserire una chiave con valore null/Inserire una chiave null");
        add("Alina", null);
        add(null, 50);
        add("Exapmle1", 12);
        add("Example2", 66);
        System.out.println(person);

        System.out.println("\nSommare tutti i valori: " + sumAge());

        System.out.println("\nTrovare la chiave con il valore massimo: " + getNameMaxAge());

        System.out.println("Inizializzare un HashMap da due array: ");
        System.out.println(unite(new String[]{"Anna", "Bea", "Ciro"}, new int[]{22, 24, 19}));
    }

    public static HashMap<String, Integer> unite(String[] name, int[] age) {
        HashMap<String, Integer> union = new HashMap<>();
        if (name.length == age.length) {
            for (int i = 0; i < name.length; i++) {
                union.put(name[i], age[i]);
            }
        }
        return union;
    }

    public static Integer getNameMaxAge() {
        int max = 0;
        for (Integer value : person.values()) {
            if (value != null)
                while (value > max)
                    max = value;
        }

        return max;
    }

    public static int sumAge() {
        int sum = 0;
        for (Integer value : person.values()) {
            if (value != null)
                sum += value;
        }
        return sum;
    }

    public static void add(String name, Integer age) {
        person.put(name, age);
    }

    public static Integer getAge(String name) {
        if (!person.containsKey(name))
            return null;
        return person.get(name);
    }

    public static void setAge(String name, int newAge) {
        if (person.containsKey(name)) {
            person.put(name, newAge);
        }
    }

    public static boolean checkAge(int age) {
        return person.containsValue(age);
    }

    public static void remove(String name) {
        person.remove(name);
    }

    public static void allKeys() {
        System.out.println("Keys: ");
        for (String key : person.keySet()) {
            System.out.println(key);
        }
    }

    public static void allValues() {
        System.out.println("Values: ");
        for (int value : person.values()) {
            System.out.println(value);
        }
    }

    public static void display() {
        for (Map.Entry item : person.entrySet()) {
            System.out.println(item);
        }
    }

    public static int countItem() {
        return person.size();
    }

    public static void removeAll() {
        person.clear();
    }

    public static boolean isEmpty() {
        return person.isEmpty();
    }

    public static void copy(HashMap<String, Integer> original, HashMap<String, Integer> copy) {
        copy.putAll(original);
    }
}
