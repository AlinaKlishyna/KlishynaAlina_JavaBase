package com.gmail.alinakotova102.corsoRanstad.altro;

public class FizzBazz {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + " - FizzBazz");
            else if (i % 3 == 0)
                System.out.println(i + " - Fizz");
            else if (i % 5 == 0)
                System.out.println(i + " - Bazz");
            else {
                System.out.println(i);
            }
            i++;
        }
    }
}
