package com.gmail.alinakotova102.corsoRanstad.eccezioni.personal_exception;

public class UserException extends RuntimeException {
    public UserException() {
        super("Error!");
    }

    public UserException(String message) {
        super(message);
    }
}
