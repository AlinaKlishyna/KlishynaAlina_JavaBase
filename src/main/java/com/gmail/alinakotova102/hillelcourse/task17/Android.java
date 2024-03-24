package com.gmail.alinakotova102.hillelcourse.task17;

public class Android implements Smartphone, LinuxOS {

    public Android() {

    }

    @Override
    public void call(String contact, long numberPhone) {
        System.out.printf("Call from %s(+%d)\n", contact, numberPhone);
    }

    @Override
    public void sms(String text, String contact) {
        System.out.printf("Contact \"%s\" wrote you a message: %s\n", contact, text);
    }

    @Override
    public String internet() {
        return "Google Chrome";
    }

    @Override
    public void show() {
        System.out.println("Internet: " + internet());
    }
}