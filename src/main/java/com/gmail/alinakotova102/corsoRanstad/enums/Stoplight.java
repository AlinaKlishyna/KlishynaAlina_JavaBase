package com.gmail.alinakotova102.corsoRanstad.enums;

public enum Stoplight {
    GREEN,
    YELLOW,
    RED;

    public void display(Stoplight stoplight) {
        System.out.println(stoplight.name());
    }

    public static void description(Stoplight stoplight) {
        switch (stoplight) {
            case RED -> System.out.println("Stop and remain stopped until the light turns green");
            case GREEN -> System.out.println(" Proceed when safe to do so, but yield to pedestrians and other " +
                    "vehicles legally in the intersection");
            case YELLOW -> System.out.println("Prepare to stop, as the light will soon turn red");
        }
    }
}
