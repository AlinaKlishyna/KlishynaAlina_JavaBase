package com.gmail.alinakotova102.corsoRanstad.overloading.sezione2;

public class Utente {
    private String username;
    private String password;
    private String email;

    public Utente(String username) {
        this.username = username;
    }

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Utente(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
