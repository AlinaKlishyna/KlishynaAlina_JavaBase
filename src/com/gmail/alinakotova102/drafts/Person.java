package com.gmail.alinakotova102.drafts;

public class Person {
    String name;
    String lastname;
    String city;
    long phone;

    public static void main(String[] args) {
        Person willSmithUser = new Person();
        willSmithUser.name = "Will";
        willSmithUser.lastname = "Smith";
        willSmithUser.city = "New York";
        willSmithUser.phone = 2936729462846L;
        System.out.println(willSmithUser.personInfo());

        Person jackieChan = new Person();
        jackieChan.name = "Jackie";
        jackieChan.lastname = "Chan";
        jackieChan.city = "Shanghai";
        jackieChan.phone = 12312412412L;
        System.out.println(jackieChan.personInfo());

        Person sherlockHolmes = new Person();
        sherlockHolmes.name = "Sherlock";
        sherlockHolmes.lastname = "Holmes";
        sherlockHolmes.city = "London";
        sherlockHolmes.phone = 37742123513L;
        System.out.println(sherlockHolmes.personInfo());
    }
    public String personInfo(){
        return "Зателефонувати громадянину " + name +" " + lastname + " із міста " + city + " можна за номером "
                + phone +"\n";
    }
}