package com.gmail.alinakotova102.task17;

public class Iphone implements Smartphone, IOS {

    public Iphone() {
    }

    @Override
    public void call(String contact, long numberPhone) {
        System.out.println("Call " + contact + " - number: +" + numberPhone);
    }

    @Override
    public void sms(String text, String contact) {
        System.out.printf("Message from %s: %s\n", contact, text);
    }

    @Override
    public String internet() {
        return "Safari";
    }

    @Override
    public void showVersion(double number) {
        System.out.println("Internet " + internet() + " version: " + number);
    }
}