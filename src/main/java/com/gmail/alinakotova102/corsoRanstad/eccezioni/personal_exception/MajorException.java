package com.gmail.alinakotova102.corsoRanstad.eccezioni.personal_exception;

public class MajorException extends RuntimeException {
    public MajorException() {
        super("Error! Is a minor!");
    }

    public MajorException(String message) {
        super(message);
    }
}
