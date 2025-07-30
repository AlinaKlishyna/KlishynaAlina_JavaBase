package com.gmail.alinakotova102.corsoRanstad.OOP.sezione4_static_utilityclass_contatori;

public class MathUtils {

    public static double celsiusToFahrenheit(int celsius) {
        return (celsius * ((double) 9 / 5)) + 32;
    }

    public static double fahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit - 32) * ((double) 9 / 5);
    }

    public static int fattoriale(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPari(int number) {
        return number % 2 == 0;
    }

    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                i = 0;
            }
        }
        return min;
    }
}

class Runner {
    public static void main(String[] args) {
        System.out.println("factorial 5! = " + MathUtils.fattoriale(5));
        System.out.println("is Pari 5 = " + MathUtils.isPari(5));
        System.out.println("min --> 3, 5, 7, 2, 6, -1, 10 --> " + MathUtils.min(new int[]{3, 5, 7, 2, 6, -1, 10}));
    }
}