package com.gmail.alinakotova102.corsoRanstad.enums;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    final int numberOfWeek;

    DayOfWeek(int numberOfWeek) {
        this.numberOfWeek = numberOfWeek;
    }

    public int getNumberOfWeek() {
        return numberOfWeek;
    }

    public static boolean isWeekend(DayOfWeek day) {
        return day.equals(SUNDAY) || day.equals(SATURDAY);
    }
}
