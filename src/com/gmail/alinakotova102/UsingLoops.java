package com.gmail.alinakotova102;

import java.util.Scanner;

public class UsingLoops {
    static int initialValue;
    static int finalValue;

    public static void main(String[] args) {
        System.out.println("Enter 2 numbers (points), after which this program will count the number of integers that are divisible by the sum of their numbers.\n");
        System.out.print("Enter the point A: ");
        initialValue = enterUserInitialValue();

        System.out.print("Enter the point B: ");
        finalValue = enterUserInitialValue();

        controlNumbersSittingLimits();

        int[] rangeNumbers = rangeBetweenNumbers(initialValue, finalValue);
        calculateSumNumbersMethodFor(rangeNumbers);
        calculateSumNumbersMethodWhile(rangeNumbers);
        calculateSumNumbersMethodDoWhile(rangeNumbers);
    }

    public static void calculateSumNumbersMethodFor(int[] rangeNumbers) {
        int[] sumSeparateNumbers = new int[rangeNumbers.length];
        System.out.println("\nMethod 1: \"For\"");
        int countWholeNumbers = 0;
        for (int indexRangeInt = 0; indexRangeInt < rangeNumbers.length; indexRangeInt++) {
            for (int j = 0; j < String.valueOf(rangeNumbers[indexRangeInt]).length(); j++) {
                String textValuesPartNumbers = String.valueOf(rangeNumbers[indexRangeInt]);
                sumSeparateNumbers[indexRangeInt] += Character.getNumericValue(textValuesPartNumbers.charAt(j));
            }
            if (String.valueOf(rangeNumbers[indexRangeInt]).length() == 1) {
                sumSeparateNumbers[indexRangeInt] = 1;
            }

            String controlTypeInt;
            if (rangeNumbers[indexRangeInt] % sumSeparateNumbers[indexRangeInt] == 0) {
                controlTypeInt = "Whole!";
                countWholeNumbers++;
            } else {
                controlTypeInt = "Fraction!";
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", rangeNumbers[indexRangeInt], sumSeparateNumbers[indexRangeInt], rangeNumbers[indexRangeInt], sumSeparateNumbers[indexRangeInt], controlTypeInt);
        }
        System.out.println("Count of whole numbers - " + countWholeNumbers);
    }

    public static void calculateSumNumbersMethodWhile(int[] rangeNumbers) {
        int indexRangeInt = 0;
        int indexSymbol;
        int sumSymbolsInIndex = 0;
        int[] sumSeparateNumbers = new int[rangeNumbers.length];
        while (indexRangeInt < rangeNumbers.length) {
            indexSymbol = 0;
            while (indexSymbol < String.valueOf(rangeNumbers[indexRangeInt]).length()) {
                sumSymbolsInIndex += Character.getNumericValue(String.valueOf(rangeNumbers[indexRangeInt]).charAt(indexSymbol));
                indexSymbol++;
            }
            sumSeparateNumbers[indexRangeInt] = sumSymbolsInIndex;
            sumSymbolsInIndex = 0;
            indexRangeInt++;
        }
        indexRangeInt = 0;
        String controlTypeInt;
        System.out.println("\nMethod 2: \"While\"");
        int countWholeNumbers = 0;
        while (indexRangeInt < sumSeparateNumbers.length) {
            if (rangeNumbers[indexRangeInt] % sumSeparateNumbers[indexRangeInt] == 0) {
                controlTypeInt = "Whole!";
                countWholeNumbers++;
            } else {
                controlTypeInt = "Fraction!";
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", rangeNumbers[indexRangeInt], sumSeparateNumbers[indexRangeInt], rangeNumbers[indexRangeInt], sumSeparateNumbers[indexRangeInt], controlTypeInt);
            indexRangeInt++;
        }
        System.out.println("Count of whole numbers - " + countWholeNumbers);
    }

    public static void calculateSumNumbersMethodDoWhile(int[] rangeNumbers) {
        int indexRangeInt = 0;
        int indexSymbol = 0;
        int sumSymbolsInIndex = 0;
        int[] sumSeparateNumbers = new int[rangeNumbers.length];
        do {
            do {
                sumSymbolsInIndex += Character.getNumericValue(String.valueOf(rangeNumbers[indexRangeInt]).charAt(indexSymbol));
                indexSymbol++;
            } while (indexSymbol < String.valueOf(rangeNumbers[indexRangeInt]).length());
            sumSeparateNumbers[indexRangeInt] = sumSymbolsInIndex;
            indexSymbol = 0;
            sumSymbolsInIndex = 0;
            indexRangeInt++;
        } while (indexRangeInt < rangeNumbers.length);

        indexRangeInt = 0;
        String controlTypeInt;
        System.out.println("\nMethod 3: \"Do-While\"");
        int countWholeNumbers = 0;
        do {
            if (rangeNumbers[indexRangeInt] % sumSeparateNumbers[indexRangeInt] == 0) {
                controlTypeInt = "Whole!";
                countWholeNumbers++;
            } else {
                controlTypeInt = "Fraction!";
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", rangeNumbers[indexRangeInt], sumSeparateNumbers[indexRangeInt], rangeNumbers[indexRangeInt], sumSeparateNumbers[indexRangeInt], controlTypeInt);
            indexRangeInt++;
        } while (indexRangeInt < rangeNumbers.length);
        System.out.println("Count of whole numbers - " + countWholeNumbers);
    }


    public static int[] rangeBetweenNumbers(int initialLimit, int finalLimit) {
        int[] rangeNumbers = new int[(finalLimit - initialLimit) - 1];
        int index = 0;
        for (int j = initialLimit + 1; j < finalLimit; j++) {
            rangeNumbers[index++] = j;
        }
        System.out.print("Range between numbers: ");
        displayNumbersArrayInt(rangeNumbers);
        return rangeNumbers;
    }

    public static void controlNumbersSittingLimits() {
        while (initialValue == finalValue || Math.abs(finalValue - initialValue) == 1 || Math.abs(initialValue - finalValue) == 1) {
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

    public static void displayNumbersArrayInt(int[] arrayInt) {
        String displayRangeNumbers = "";
        for (int i = 0; i < arrayInt.length; i++) {
            displayRangeNumbers = displayRangeNumbers + arrayInt[i] + ", ";
            if (i == arrayInt.length - 1) {
                displayRangeNumbers = displayRangeNumbers.substring(0, displayRangeNumbers.length() - 2);
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

