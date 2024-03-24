package com.gmail.alinakotova102.hillelcourse.task14;

public class PersonRunner {
    public static void main(String[] args) {
        Person willSmithUser = new Person("Will", "Smith", "New York", 2936729462846L);
        System.out.println(willSmithUser.personInfo());

        Person jackieChan = new Person("Jackie", "Chan", "Shanghai", 12312412412L);
        System.out.println(jackieChan.personInfo());

        Person sherlockHolmes = new Person("Sherlock", "Holmes", "London", 37742123513L);
        System.out.println(sherlockHolmes.personInfo());
    }
}