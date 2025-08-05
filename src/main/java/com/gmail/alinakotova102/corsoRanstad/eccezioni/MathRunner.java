package com.gmail.alinakotova102.corsoRanstad.eccezioni;

import com.gmail.alinakotova102.corsoRanstad.eccezioni.personal_exception.MajorException;
import com.gmail.alinakotova102.corsoRanstad.eccezioni.personal_exception.ZeroException;

public class MathRunner {
    public static void main(String[] args) {
        System.out.println(division(3, 0));

        isNegative(5);
        isEmpty(2);
        System.out.println(divisionCheck(3, 3));
        System.out.println(isMajor(18));
        System.out.println(isNumeric("1d2"));
    }

    public static Integer isNumeric(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("Don't number!");
            return null;
        }
    }

    public static boolean isMajor(int age) {
        if (age < 18 && age > 0) {
            throw new MajorException();
        }
        return true;
    }

    public static double divisionCheck(int a, int b) {
        if (a / b == 0 || b / a == 0) {
            throw new ZeroException();
        }
        return (double) a / b;
    }


    public static void isEmpty(Integer num) {
        if (num == null) {
            throw new IllegalArgumentException();
        }
    }

    public static int division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public static boolean isNegative(int num) {
        if (num > 0) {
            System.out.println("Is positive number!");
            return true;
        } else {
            throw new IllegalArgumentException("Num is negative!");
        }
    }
}
