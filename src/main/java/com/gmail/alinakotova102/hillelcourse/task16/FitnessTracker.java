package com.gmail.alinakotova102.hillelcourse.task16;

public class FitnessTracker {
    private final String name;
    private final byte dayOfBirthday;
    private final byte monthOfBirthday;
    private final short yearOfBirthday;
    private final String email;

    private final long phone;

    private int age;
    private String lastName;
    private int weight;
    private int pressure;
    private int stepsOneDay;

    public FitnessTracker(String name,
                          String lastName,
                          byte dayOfBirthday,
                          byte monthOfBirthday,
                          short yearOfBirthday,
                          String email,
                          long phone,
                          int weight,
                          int pressure,
                          int stepsOneDay) {
        this.name = name;
        this.lastName = lastName;
        this.dayOfBirthday = dayOfBirthday;
        this.monthOfBirthday = monthOfBirthday;
        this.yearOfBirthday = yearOfBirthday;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getStepsOneDay() {
        return stepsOneDay;
    }

    public void setStepsOneDay(int stepsOneDay) {
        this.stepsOneDay = stepsOneDay;
    }

    public int getAge() {
        age = 2020 - this.yearOfBirthday;
        return age;
    }

    public void printAccountInfo() {
        System.out.printf("Name: %s\nLastname: %s\nDate of Birthday: %d.%d.%d\nAge: %d\nE-mail: %s\nNumber phone: +%d" +
                        "\nWeight: %dkg\nPressure: %d\nNumber of steps per day: %d\n\n",
                name,
                lastName,
                dayOfBirthday,
                monthOfBirthday,
                yearOfBirthday,
                getAge(),
                email,
                phone,
                weight,
                pressure,
                stepsOneDay);
    }
}