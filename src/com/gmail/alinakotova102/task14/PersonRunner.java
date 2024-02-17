package com.gmail.alinakotova102.task14;

public class PersonRunner {
    public static void main(String[] args) {
        Person willSmithUser = new Person();
        System.out.println(willSmithUser.personInfo("Will", "Smith", "New York", 2936729462846L));

        Person jackieChan = new Person();
        System.out.println(jackieChan.personInfo("Jackie", "Chan", "Shanghai", 12312412412L));

        Person sherlockHolmes = new Person();
        System.out.println(sherlockHolmes.personInfo("Sherlock", "Holmes", "London", 37742123513L));
    }
}
