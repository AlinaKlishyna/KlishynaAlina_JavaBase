package com.gmail.alinakotova102.task17;

public interface Smartphone {
    public void call(String contact, long numberPhone);

    public void sms(String text, String contact);

    public String internet();
}