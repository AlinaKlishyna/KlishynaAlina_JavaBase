package com.gmail.alinakotova102.corsoRanstad.enums;

public enum TypeDocument {
    CF,
    PASSPORT,
    PATENT;

    public static void displayInfo(TypeDocument type) {
        switch (type) {
            case CF -> System.out.println(" È un codice alfanumerico di 16 caratteri che identifica in modo univoco " +
                    "le persone fisiche e giuridiche nei loro rapporti con le pubbliche amministrazioni, privati " +
                    "ed enti italiani, secondo l'Agenzia delle Entrate");
            case PATENT -> System.out.println("la patente di guida è valida come documento di riconoscimento");
            case PASSPORT -> System.out.println("il passaporto è sia un documento di viaggio che di riconoscimento");
        }
    }
}
