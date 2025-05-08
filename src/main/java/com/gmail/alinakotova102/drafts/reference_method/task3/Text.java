package com.gmail.alinakotova102.drafts.reference_method.task3;

public class Text {
    private String message;

    void setMessage(String message) {
        this.message = message;
    }

    void display() {
        System.out.println("Message: " + message);
    }

    static void show(String text) {
        System.out.println("Text static: " + text);
    }
}
