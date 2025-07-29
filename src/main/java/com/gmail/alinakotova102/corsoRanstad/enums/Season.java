package com.gmail.alinakotova102.corsoRanstad.enums;

public enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    public void displayInfo(Season season) {
        switch (season) {
            case AUTUMN -> System.out.println("Autumn is a season of change and transformation");
            case SPRING -> System.out.println("The weather in spring is good, warm and sunny");
            case SUMMER -> System.out.println("It's typically characterized by warmer weather and " +
                    "longer daylight hours");
            case WINTER -> System.out.println("Winter is the coldest season of the year, following autumn and " +
                    "preceding spring");
        }
    }
}
