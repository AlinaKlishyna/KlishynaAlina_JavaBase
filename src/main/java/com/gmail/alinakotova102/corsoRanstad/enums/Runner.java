package com.gmail.alinakotova102.corsoRanstad.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.print(day);
            System.out.println(" - " + day.isWeekend(day));
        }
        nextStation();

        for (Month month : Month.values()) {
            System.out.println(month + " - " + month.countDay(month) + " days");
        }
        nextStation();

        for (Season season : Season.values()) {
            System.out.print(season + " - ");
            season.displayInfo(season);
        }
        nextStation();

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.print(day + " - ");
            System.out.println(day.numberOfWeek);
        }
        nextStation();

        for (Stoplight stoplight : Stoplight.values()) {
            stoplight.display(stoplight);
        }
        nextStation();

        System.out.println(new Person(BloodGroup.AB));
        nextStation();

        for (Currency currency : Currency.values()) {
            System.out.println(currency + " - " + currency.getSymbol());
        }
        nextStation();

        try {
            BloodGroup ABNegative = Enum.valueOf(BloodGroup.class, "ABNEGATIVE");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        nextStation();

        for (UserRole role : UserRole.values()) {
            System.out.println(role + " - " + role.getMessage());
        }
        nextStation();

        for (Enum<Month> monthSummer : Month.summerMonth()) {
            System.out.println(monthSummer);
        }
        nextStation();

        System.out.println(Arrays.toString(Month.sort()));
        nextStation();

        for (Month month : Month.values()) {
            System.out.println(month + " - " + month.ordinal());
        }
        nextStation();

        Scanner scanner = new Scanner(System.in);
        try {
            //DayOfWeek day = DayOfWeek.valueOf(scanner.nextLine().toUpperCase());
            //System.out.println(day + " - " + DayOfWeek.isWeekend(day));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        nextStation();

        Stoplight.description(Stoplight.RED);
        nextStation();

        System.out.println(new Student(Gender.FEMALE));
        nextStation();

        HashMap<DayOfWeek, String> days = new HashMap<>();

        Example example = new Example();
        //example.example1();

        System.out.println(PricingPlan.Banana);
        nextStation();

        System.out.println(State.ON + " - " + State.ON.getTransition());
        nextStation();

        TypeDocument.displayInfo(TypeDocument.PASSPORT);
    }

    public static void nextStation() {
        System.out.println("--------------------------");
    }
}
