package com.gmail.alinakotova102.corsoRanstad.eccezioni.personal_exception;

public class PasswordException extends UserException {
    public PasswordException() {
        super("Error! Password is incorrect!");
    }

    public PasswordException(String message) {
        super(message);
    }
}
