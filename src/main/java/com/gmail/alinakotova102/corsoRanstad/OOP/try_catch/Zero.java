package com.gmail.alinakotova102.corsoRanstad.OOP.try_catch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Zero {
    public double divisione(int a, int b) {
        try {
            return (double) a/b;
        } catch (ArithmeticException e) {
            System.out.println("Divisione per 0! Error!");
            return Double.NaN;  //non a number
        }
    }

    public boolean isNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = Integer.parseInt(scanner.nextLine());
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            return false;
        }
    }

    String[] strings = new String[5];
    public void addElement(int index, String text) {
        try {
            strings[index] = text;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! Index " + index + " out of bounds for length " + strings.length);
        }

    }

    public void leggiFile(String nome) {
        try {
            FileReader file = new FileReader(nome);
            System.out.println("Posso leggere!");
        } catch (FileNotFoundException e) {
            System.out.println("Non found!");
        }
    }

    public double erroriArithmetic(String first, String second) {
        try {
            int a = Integer.parseInt(first);
            int b = Integer.parseInt(second);
            return (double) a + b;
        } catch (NumberFormatException e) {
            System.out.println("Error! Not a number");
            return Double.NaN;
        } catch (NullPointerException e) {
            System.out.println("Error! Is empty");
            return Double.NaN;
        }
    }
}

class Runner {
    public static void main(String[] args) {
        Zero zero = new Zero();
        System.err.println(zero.divisione(2, 0));

        //zero.isNumber();
        zero.addElement(6, "Fifty");
        zero.leggiFile("file.txt");
        zero.leggiFile("/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com" +
                "/gmail/alinakotova102/corsoRanstad/OOP/try_catch/file.txt");

        zero.erroriArithmetic("2",null);
        zero.erroriArithmetic("2","null");
    }
}
