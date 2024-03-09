package com.gmail.alinakotova102.task1_12;

import java.util.Scanner;

public class UsingLoops {
    static int initialValue;
    static int finalValue;

    public static void main(String[] args) {
        System.out.println("Enter 2 numbers (points), after which this program will count the number of integers " +
                "that are divisible by the sum of their numbers.\n");
        System.out.print("Enter the point A: ");
        initialValue = enterUserInitialValue();

        System.out.print("Enter the point B: ");
        finalValue = enterUserInitialValue();

        controlNumbersSittingLimits();

        int[] rangeNumbers = rangeGenerate(initialValue, finalValue);
        display(rangeNumbers);
        calculateSumNumbersMethodFor(rangeNumbers);
        calculateSumNumbersMethodWhile(rangeNumbers);
        calculateSumNumbersMethodDoWhile(rangeNumbers);
    }

    public static void calculateSumNumbersMethodFor(int[] rangeNumbers) {
        int[] sumSeparateDigits = new int[rangeNumbers.length];
        System.out.println("\nMethod 1: \"For\"");
        int countWholeNumbers = 0;
        for (int indexRange = 0; indexRange < rangeNumbers.length; indexRange++) {
            int number = rangeNumbers[indexRange];
            for (int indexSymbol = 0; indexSymbol < String.valueOf(number).length(); indexSymbol++) {
                sumSeparateDigits[indexRange] += Character.getNumericValue(String.valueOf(number).
                        replace("-", "0").charAt(indexSymbol));
            }
            String count;
            if (sumSeparateDigits[indexRange] == 0 || number == 0) {
                count = "By zero!";
                sumSeparateDigits[indexRange] = 0;
            } else {
                if (number % sumSeparateDigits[indexRange] == 0) {
                    count = "Whole!";
                    countWholeNumbers++;
                } else {
                    count = "Fraction!";
                }
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", number,
                    sumSeparateDigits[indexRange], number, sumSeparateDigits[indexRange], count);
        }
        System.out.println("Count of whole numbers - " + countWholeNumbers);
    }

    public static void calculateSumNumbersMethodWhile(int[] rangeNumbers) {
        int indexRange = 0;
        int indexSymbol;
        int[] sumSeparateDigits = new int[rangeNumbers.length];
        int count = 0;
        System.out.println("\nMethod 2: \"While\"");
        while (indexRange < rangeNumbers.length) {
            int number = rangeNumbers[indexRange];
            indexSymbol = 0;
            while (indexSymbol < String.valueOf(number).length()) {
                sumSeparateDigits[indexRange] += Character.getNumericValue(String.valueOf(number).charAt(indexSymbol));
                indexSymbol++;
            }
            if (number <= 0) {
                sumSeparateDigits[indexRange]++;
            }
            String controlType;
            if (sumSeparateDigits[indexRange] == 0 || number == 0) {
                controlType = "By zero!";
                sumSeparateDigits[indexRange] = 0;
            } else {
                if (number % sumSeparateDigits[indexRange] == 0) {
                    controlType = "Whole!";
                    count++;
                } else {
                    controlType = "Fraction!";
                }
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", number,
                    sumSeparateDigits[indexRange], number, sumSeparateDigits[indexRange], controlType);
            indexRange++;
        }
        System.out.println("Count of whole numbers - " + count);
    }

    public static void calculateSumNumbersMethodDoWhile(int[] rangeNumbers) {
        int indexRange = 0;
        int indexSymbol = 0;
        int sumSymbolsInIndex = 0;
        int[] sumSeparateDigits = new int[rangeNumbers.length];
        int count = 0;
        System.out.println("\nMethod 3: \"Do-While\"");
        do {
            int number = rangeNumbers[indexRange];
            do {
                sumSymbolsInIndex += Character.getNumericValue(String.valueOf(number).charAt(indexSymbol));
                indexSymbol++;
            } while (indexSymbol < String.valueOf(number).length());
            sumSeparateDigits[indexRange] = sumSymbolsInIndex;
            indexSymbol = 0;
            sumSymbolsInIndex = 0;
            if (number <= 0) {
                sumSeparateDigits[indexRange]++;
            }
            String controlType;
            if (sumSeparateDigits[indexRange] == 0 || number == 0) {
                controlType = "By zero!";
                sumSeparateDigits[indexRange] = 0;
            } else {
                if (number % sumSeparateDigits[indexRange] == 0) {
                    controlType = "Whole!";
                    count++;
                } else {
                    controlType = "Fraction!";
                }
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", number,
                    sumSeparateDigits[indexRange], number, sumSeparateDigits[indexRange], controlType);

            indexRange++;
        } while (indexRange < rangeNumbers.length);
        System.out.println("Count of whole numbers - " + count);
    }


    public static int[] rangeGenerate(int initialLimit, int finalLimit) {
        int[] rangeNumbers = new int[(finalLimit - initialLimit) - 1];
        int index = 0;
        for (int i = initialLimit + 1; i < finalLimit; i++) {
            rangeNumbers[index++] = i;
        }
        System.out.print("Range between numbers: ");
        return rangeNumbers;
    }

    public static void controlNumbersSittingLimits() {
        while (Math.abs(finalValue - initialValue) <= 1) {
            System.out.print("There is no range of numbers between numbers!\n");
            if (finalValue > initialValue) {
                System.out.printf("Enter the larger value of %s(%d): ", "Point B", finalValue);
                finalValue = enterUserInitialValue();
            } else {
                System.out.printf("Enter the larger value of  %s(%d): ", "Point A", initialValue);
                initialValue = enterUserInitialValue();
            }
        }
        int preservingValue;
        if (finalValue < initialValue) {
            preservingValue = finalValue;
            finalValue = initialValue;
            initialValue = preservingValue;
            System.out.println("\nLimits swapped!");
        }
        System.out.printf("\n   Range:\nPoint A(%d) >->->->-> Point B(%d)\n", initialValue, finalValue);

    }

    public static void display(int[] array) {
        String displayRangeNumbers = "";
        for (int i = 0; i < array.length; i++) {
            displayRangeNumbers = displayRangeNumbers + array[i];
            if (i < array.length - 1) {
                displayRangeNumbers += ", ";
            }
        }
        System.out.println(displayRangeNumbers);
    }

    public static int enterUserInitialValue() {
        Scanner pointLimit = new Scanner(System.in);
        while (!pointLimit.hasNextInt()) {
            System.out.print("Entered value is not a number. Enter again: ");
            pointLimit.next();
        }
        return pointLimit.nextInt();
    }
}