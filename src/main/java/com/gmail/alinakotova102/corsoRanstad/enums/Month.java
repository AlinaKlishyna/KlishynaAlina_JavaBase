package com.gmail.alinakotova102.corsoRanstad.enums;

import java.util.*;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public int countDay(Month month) {
        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> {
                return 31;
            }
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> {
                return 30;
            }
            case FEBRUARY -> {
                return 28;
            }
        }
        return 0;
    }

    public static Enum<Month>[] summerMonth() {
        return new Enum[]{
                JUNE,
                JULY,
                AUGUST
        };
    }

    public static Month[] sort() {
        Month[] months = Month.values();
        Arrays.sort(months, Comparator.comparing(Enum::name));
        return months;
    }
}
