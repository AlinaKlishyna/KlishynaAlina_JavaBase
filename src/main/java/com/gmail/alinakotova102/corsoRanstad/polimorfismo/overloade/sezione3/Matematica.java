package com.gmail.alinakotova102.corsoRanstad.polimorfismo.overloade.sezione3;

public class Matematica {
    public static int a;
    public static int b;
    public static final String VERSION = "1.0";

    static {
        int[] numbers = {1, 2, 3, 4, 5};
    }

    public Matematica() {
    }

    public static double calculateFahrenheit(int celsius) {
        return ((double) celsius * ((double) 9 / 5)) + 32;
    }

    public static double average(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public static int randomNumber(int da, int fino) {
        return (int) (Math.random() * (fino - da)) * da;
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static int dividi(int a, int b) {
        return a / b;
    }

    public static int factorial(int n) {
        int result = n;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }
}
