package com.gmail.alinakotova102.corsoRanstad.esercizi_svolgere;

public class Runner {

    public static final float PI = 3.14159F;

    public static void main(String[] args) {
        System.out.println("valore asoluto: -5 -> " + valoreAssoluto(-5));
        System.out.println("stringa upper case: tavolo -> " + stringaUpperCase("tavolo"));
        System.out.println("celsius e la converta in Fahrenheit: 20 -> " + convertaFahrenheit(20));
        System.out.println("l’area di un cerchio dato il raggio: 5 -> " + areaCerchio(5));
        System.out.println("due numeri e restituisca il più piccolo: 3 e 5 -> " + piùPiccolo(3, 5));
        System.out.println("una parola e restituisca true se la parola è palindroma: Radar -> "
                + èPolindrom("Radar"));
        System.out.println("accetti un voto (da 0 a 10) e stampi un giudizio: 5 -> " + giudizioVoto(5));
        System.out.println("numero di vocali: Bottiglia -> " + contaVocali("Bottiglia"));
        System.out.println("la frase al contrario: Sono andato al negozio -> "
                + contrario("Sono andato al negozio"));
        System.out.println("true se è un numero primo 11 -> " + numeroPrimo(11));
        System.out.println("una frase di presentazione: Petro, 14 -> "
                + presentazionePersona("Petro", 14));
        System.out.println("un nome e il numero di libri letti quest’anno: " + numeroLibri("Alina", 13));
        ogniLettera("Ravioli");
        System.out.println("due booleani e restituisca il risultato dell’operazione logica AND: true e true -> "
                + operazioneLogicaAND(true, true));
        System.out.println("un numero e dica se è pari o dispari: 4 -> " + checkPari(4));
        System.out.println("calcoli la lunghezza media di tre parole: okey/frigorifero/cappuccino -> "
                + lunghezzaMedia("okey", "frigorifero", "cappuccino"));
        System.out.println("inizia con vocale: Aperol -> " + iniziaVocale("Aperol"));
        System.out.println("la distanza tra due numeri (valore assoluto della differenza): 3 e 10 -> "
                + distanza(3, 10));
        System.out.println("un numero decimale e lo arrotondi all’intero più vicino: 3.48 -> " + intero(3.48)
                + " e 3.77 -> " + intero(3.77));
        System.out.println("un intero e ritorni il suo quadrato: 3 -> " + qudrato(3));
        System.out.println("un array di 3 numeri e restituisca la loro somma: [10,25,45] -> "
                + somma(new int[]{10, 25, 45}));
        System.out.println("il nome di un mese e restituisca quanti giorni ha: Giugno -> "
                + contaGiorni("Giugno"));
        System.out.println("una frase casuale da un elenco di 3: -> "
                + getRandomFrase(new String[]{"Ciao a tutti!", "Ciao!", "Hello :("}));
        System.out.println("un colore e dica se è un colore primario: Viola -> " + colorePrimario("Viola")
                + " e Giallo -> " + colorePrimario("Giallo"));
        salutoFormale("Mara");
        System.out.println("tre numeri interi e restituisca il massimo: 3, 8, 1 -> "
                + maxValore(3, 8, 1));
        System.out.println("un numero casuale tra 1 e 6 (simulazione dado) -> " + numeroDado());
        System.out.println("una temperatura in Fahrenheit e la converta in Celsius: 68 -> "
                + convertaCelsius(68));
        System.out.println("un prezzo e uno sconto in percentuale e restituisca il prezzo scontato  70 e sconto 20% -> "
                + prezzoScontato(70, 20));
    }

    // un prezzo e uno sconto in percentuale e restituisca il prezzo scontato
    public static double prezzoScontato(int prezzo, int sconto) {
        return prezzo - ((double) (sconto * prezzo) / 100);
    }

    // converta in Celsius
    public static double convertaCelsius(int fahrenheit) {
        return (double) (fahrenheit - 32) * ((double) 5 / 9);
    }

    // un numero casuale tra 1 e 6 (simulazione dado)
    public static int numeroDado() {
        return (int) ((Math.random() * (6 - 1)) + 1);
    }

    // tre numeri interi e restituisca il massimo
    public static int maxValore(int primo, int secondo, int terzo) {
        return Integer.max(primo, Integer.max(secondo, terzo));
    }

    //un saluto formale
    public static void salutoFormale(String name) {
        System.out.println("Buongiorno, " + name + "!");
    }

    // un colore e dica se è un colore primario
    public static boolean colorePrimario(String colore) {
        return colore.equalsIgnoreCase("blu") || colore.equalsIgnoreCase("giallo")
                || colore.equalsIgnoreCase("rosso");
    }

    // una frase casuale da un elenco di 3
    public static String getRandomFrase(String[] frase) {
        return frase[(int) (Math.random() * frase.length)];
    }

    // quanti giorni ha
    public static int contaGiorni(String mese) {
        int giorni = 0;
        switch (mese.toLowerCase()) {
            case "gennaio", "marzo", "maggio", "luglio", "agosto", "ottobre", "dicembre":
                giorni = 31;
                break;
            case "aprile", "giugno", "settembre", "novembre":
                giorni = 30;
                break;
            case "febbraio":
                giorni = 28;
                break;
        }
        return giorni;
    }

    // un array di 3 numeri e restituisca la loro somma
    public static int somma(int[] numeri) {
        int somma = 0;
        for (int numero : numeri) {
            somma += numero;
        }
        return somma;
    }

    // un intero e ritorni il suo quadrato
    public static int qudrato(int numero) {
        return (int) Math.pow(numero, 2);
    }

    // un numero decimale e lo arrotondi all’intero più vicino
    public static int intero(double numero) {
        return (int) Math.round(numero);
    }

    // la distanza tra due numeri (valore assoluto della differenza)
    public static int distanza(int primo, int secondo) {
        return primo > secondo ? Math.abs(primo - secondo) : Math.abs(secondo - primo);
    }

    // una parola e restituisca true se inizia con vocale
    public static boolean iniziaVocale(String parole) {
        String[] lettere = parole.split("");
        String[] vocali = {"a", "i", "u", "o", "e"};
        for (String vocale : vocali) {
            if (lettere[0].equalsIgnoreCase(vocale))
                return true;
        }
        return false;
    }

    // calcoli la lunghezza media di tre parole
    public static double lunghezzaMedia(String primo, String secondo, String terzo) {
        return (double) (primo.length() + secondo.length() + terzo.length()) / 3;
    }

    // un numero e dica se è pari o dispari
    public static String checkPari(int numero) {
        return numero % 2 == 0 ? "pari" : "dispari";
    }

    // due booleani e restituisca il risultato dell’operazione logica AND
    public static String operazioneLogicaAND(boolean primo, boolean secondo) {
        return primo == secondo ? "AND" : "false";
    }

    // una parola e stampi ogni lettera su una riga diversa
    public static void ogniLettera(String stringa) {
        System.out.println("Ogni lettera su una riga diversa: " + stringa);
        for (String lettera : stringa.split("")) {
            System.out.println(lettera);
        }
    }

    // un nome e il numero di libri letti quest’anno, e restituisca una frase come “Luca ha letto 12 libri quest’anno”
    public static String numeroLibri(String name, int numero) {
        return name + " ha letto " + numero + " libri quest’anno";
    }

    // il nome e l’età di una persona e stampi una frase di presentazione
    public static String presentazionePersona(String nome, int èta) {
        return "\nPersona ->\nnome: " + nome + "\nèta: " + èta;
    }

    // accetti un numero intero e ritorni true se è un numero primo
    public static boolean numeroPrimo(int numero) {
        if (numero < 2) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    // accetti una frase e restituisca la frase al contrario
    public static String contrario(String stringa) {
        // return new StringBuilder(stringa).reverse(); - prima modo
        String[] lettere = stringa.split("");  // - secondo modo
        String contrario = "";
        for (int i = lettere.length - 1; i >= 0; i--) {
            contrario += lettere[i];
        }
        return contrario;
    }

    // accetti una stringa e restituisca il numero di vocali
    public static int contaVocali(String stringa) {
        String[] vocali = {"a", "i", "u", "o", "e"};
        String[] lettere = stringa.trim().split("");
        int conta = 0;
        for (int i = 0; i < lettere.length; i++) {
            for (int j = 0; j < vocali.length; j++) {
                if (lettere[i].equalsIgnoreCase(vocali[j])) {
                    conta++;
                }
            }
        }
        return conta;
    }

    //  accetti un voto (da 0 a 10) e stampi un giudizio
    public static String giudizioVoto(int voto) {
        if (voto < 4) {
            return "Insufficiente";
        } else if (voto < 7) {
            return "Buono";
        } else if (voto <= 10) {
            return "Ottimo";
        }
        return "il valore è impostato in modo errato!";
    }

    // una parola e restituisca true se la parola è palindroma
    public static boolean èPolindrom(String stringa) {
        return stringa.equalsIgnoreCase(String.valueOf(new StringBuilder(stringa).reverse()));
    }

    // accetti due numeri e restituisca il più piccolo
    public static int piùPiccolo(int a, int b) {
        return Integer.min(a, b);
    }

    // calcoli l’area di un cerchio dato il raggio
    public static double areaCerchio(int raggio) {
        return PI * Math.pow(raggio, 2);
    }

    // accetti una temperatura in Celsius e la converta in Fahrenheit
    public static double convertaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // accetti una stringa e restituisca la stessa stringa in maiuscolo
    public static String stringaUpperCase(String stringa) {
        return stringa.toUpperCase();
    }

    // accetti un intero e ritorni il suo valore assoluto
    public static int valoreAssoluto(int valore) {
        return Math.abs(valore);
    }
}
