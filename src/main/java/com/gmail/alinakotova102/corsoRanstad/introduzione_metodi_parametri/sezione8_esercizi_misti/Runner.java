package com.gmail.alinakotova102.corsoRanstad.introduzione_metodi_parametri.sezione8_esercizi_misti;

public class Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        System.out.println("Радар - > " + runner.èPalindroma("Радар"));
        System.out.println("Radar - > " + runner.èPalindroma("Radar"));
        System.out.println("inverti - > " + runner.inverti("panama"));
        System.out.println("Macchina - > " + runner.contaVocali("Macchina"));
    }

    public int contaVocali(String frase) {
        char[] vocali = new char[]{'a', 'e', 'i', 'o', 'u'};
        String[] lettere = frase.split("");
        int quantità = 0;
        for (int i = 0; i < lettere.length; i++) {
            for (int j = 0; j < vocali.length; j++) {
                if (lettere[i].equalsIgnoreCase(String.valueOf(vocali[j])))
                    quantità++;
            }
        }
        return quantità;
    }

    public String inverti(String parola) {
        return String.valueOf(new StringBuilder(parola).reverse());
    }

    public boolean èPalindroma(String parola) {
        return parola.equalsIgnoreCase(inverti(parola));
    }
}
