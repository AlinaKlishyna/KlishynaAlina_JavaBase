package com.gmail.alinakotova102.corsoRanstad.eccezioni.personal_exception;

public class ZeroException extends RuntimeException{
    public ZeroException() {
        super("Error! Number is zero!");
    }

    public ZeroException(String message) {
        super(message);
    }
}
