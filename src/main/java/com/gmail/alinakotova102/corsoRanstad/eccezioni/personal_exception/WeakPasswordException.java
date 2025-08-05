package com.gmail.alinakotova102.corsoRanstad.eccezioni.personal_exception;

public class WeakPasswordException extends PasswordException{
    public WeakPasswordException() {
        super("The password is too weak: it must be no shorter than 10 characters");
    }
}
