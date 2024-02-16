package com.gmail.alinakotova102;

public class Person {
    String name;
    String lastName;
    String city;
    long phone;

    public static void main(String[] args) {
        Person willSmithUser = new Person();
        willSmithUser.name = "Will";
        willSmithUser.lastName = "Smith";
        willSmithUser.city = "New York";
        willSmithUser.phone = 2936729462846L;
        System.out.println(willSmithUser.personInfo());

        Person jackieChan = new Person();
        jackieChan.name = "Jackie";
        jackieChan.lastName = "Chan";
        jackieChan.city = "Shanghai";
        jackieChan.phone = 12312412412L;
        System.out.println(jackieChan.personInfo());

        Person sherlockHolmes = new Person();
        sherlockHolmes.name = "Sherlock";
        sherlockHolmes.lastName = "Holmes";
        sherlockHolmes.city = "London";
        sherlockHolmes.phone = 37742123513L;
        System.out.println(sherlockHolmes.personInfo());
    }

    public String personInfo() {
        return "Зателефонувати громадянину " + name + " " + lastName + " із міста " + city + " можна за номером "
                + phone + "\n";
    }
}