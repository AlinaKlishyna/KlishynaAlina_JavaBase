package com.gmail.alinakotova102.task14;

public class Person {
    private String name;
    private String lastName;
    private String city;
    private long phone;

    public Person(String name, String lastName, String city, long phone) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public long getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String personInfo() {
        return "Зателефонувати громадянину " + this.name + " " + this.lastName + " із міста " + this.city +
                " можна за номером " + this.phone + "\n";
    }
}