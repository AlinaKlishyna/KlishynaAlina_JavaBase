package com.gmail.alinakotova102.task16;

public class FitnessTracker {
    private final String name;
    private final byte dayOfBirthday;
    private final byte monthOfBirthday;
    private final short yearOfBirthday;
    private final String email;

    private final long phone;
    private final int age;

    private String lastname;
    private int weight;
    private int pressure;
    private int stepsOneDay;

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setStepsOneDay(int stepsOneDay) {
        this.stepsOneDay = stepsOneDay;
    }

    public String getName() {
        return name;
    }

    public byte getDayOfBirthday() {
        return dayOfBirthday;
    }

    public byte getMonthOfBirthday() {
        return monthOfBirthday;
    }

    public short getYearOfBirthday() {
        return yearOfBirthday;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public String getLastname() {
        return lastname;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getStepsOneDay() {
        return stepsOneDay;
    }

    public int getAge() {
        return age;
    }

    public FitnessTracker(String name, String lastname, byte dayOfBirthday, byte monthOfBirthday, short yearOfBirthday,
                          String email, long phone, int weight, int pressure, int stepsOneDay) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirthday = dayOfBirthday;
        this.monthOfBirthday = monthOfBirthday;
        this.yearOfBirthday = yearOfBirthday;
        this.age = 2020 - yearOfBirthday;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsOneDay = stepsOneDay;
    }

    public void printAccountInfo() {
        System.out.printf("Name: %s\nLastname: %s\nDate of Birthday: %d.%d.%d\nAge: %d\nE-mail: %s\nNumber phone: +%d" +
                        "\nWeight: %dkg\nPressure: %d\nNumber of steps per day: %d\n\n", name, lastname, dayOfBirthday,
                monthOfBirthday, yearOfBirthday, age, email, phone, weight, pressure, stepsOneDay);
    }
}