package com.gmail.alinakotova102.corsoRanstad.introduzione_metodi_parametri.sezione3_parametri_multipli_tipi_diversi;

public class Runner {
    public static void main(String[] args) {
        System.out.println(descriviPersona("Nicolo", 30));
        System.out.println("età => 18 - " + èMaggiorenne(19));
        salutaPersonaLingua("Alina", "Ucraino");
        System.out.printf("èPari: %d -> %b, %d -> %b\n", 2, èPari(2), 3, èPari(3));
        descriviAnimale("Il gatto domestico", "Felis silvestris catus", 2);
    }

    public static void descriviAnimale(String tipo, String nome, int età) {
        System.out.printf("\nAnimale -> \nnome: %s\ntipo: %s\nèta: %d\n", nome, tipo, età);
    }

    public static boolean èPari(int numero) {
        return numero % 2 == 0;
    }

    public static void salutaPersonaLingua(String nome, String lingua) {
        StringBuilder saluta = new StringBuilder();
        switch (lingua) {
            case "Inglese":
                saluta.append("Hello");
                break;
            case "Italiano":
                saluta.append("Ciao");
                break;
            case "Ucraino":
                saluta.append("Привiт");
                break;
        }
        saluta
                .append(", ")
                .append(nome)
                .append("!");
        System.out.println(saluta);
    }

    public static boolean èMaggiorenne(int età) {
        return età >= 18;
    }

    public static String descriviPersona(String nome, int età) {
        return "Persona: " + nome + ", " + età + ";";
    }
}
