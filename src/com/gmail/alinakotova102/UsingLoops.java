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
            for (int indexSymbol = 0; indexSymbol < String.valueOf(rangeNumbers[indexRange]).length(); indexSymbol++) {
                String textValuesPartNumbers = String.valueOf(rangeNumbers[indexRange]);
                if (!(String.valueOf(Math.abs(rangeNumbers[indexRange])).length() == 1)) {
                    sumSeparateDigits[indexRange] += Character.getNumericValue(textValuesPartNumbers.charAt(indexSymbol));
                } else {
                    sumSeparateDigits[indexRange] = 1;
                }
            }
            if (rangeNumbers[indexRange] <= 0 && !(String.valueOf(Math.abs(rangeNumbers[indexRange])).length() == 1)) {
                sumSeparateDigits[indexRange]++;
            }
            String count;
            if (sumSeparateDigits[indexRange] == 0 || rangeNumbers[indexRange] == 0) {
                count = "By zero!";
                sumSeparateDigits[indexRange] = 0;
            } else {
                if (rangeNumbers[indexRange] % sumSeparateDigits[indexRange] == 0) {
                    count = "Whole!";
                    countWholeNumbers++;
                } else {
                    count = "Fraction!";
                }
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", rangeNumbers[indexRange],
                    sumSeparateDigits[indexRange], rangeNumbers[indexRange], sumSeparateDigits[indexRange], count);
        }
        System.out.println("Count of whole numbers - " + countWholeNumbers);
    }

    public static void calculateSumNumbersMethodWhile(int[] rangeNumbers) {
        int indexRange = 0;
        int indexSymbol;
        int sumSymbolsInIndex = 0;
        int[] sumSeparateDigits = new int[rangeNumbers.length];
        while (indexRange < rangeNumbers.length) {
            indexSymbol = 0;
            while (indexSymbol < String.valueOf(rangeNumbers[indexRange]).length()) {
                sumSymbolsInIndex += Character.getNumericValue(String.valueOf(rangeNumbers[indexRange]).charAt(indexSymbol));
                indexSymbol++;
            }
            sumSeparateDigits[indexRange] = sumSymbolsInIndex;
            if (String.valueOf(Math.abs(rangeNumbers[indexRange])).length() == 1) {
                sumSeparateDigits[indexRange] = 1;
            }
            sumSymbolsInIndex = 0;
            indexRange++;
        }
        indexRange = 0;
        String controlType;
        System.out.println("\nMethod 2: \"While\"");
        int count = 0;
        while (indexRange < sumSeparateDigits.length) {
            if (rangeNumbers[indexRange] <= 0 && !(String.valueOf(Math.abs(rangeNumbers[indexRange])).length() == 1)) {
                sumSeparateDigits[indexRange]++;
            }
            if (sumSeparateDigits[indexRange] == 0 || rangeNumbers[indexRange] == 0) {
                controlType = "By zero!";
                sumSeparateDigits[indexRange] = 0;
            } else {
                if (rangeNumbers[indexRange] % sumSeparateDigits[indexRange] == 0) {
                    controlType = "Whole!";
                    count++;
                } else {
                    controlType = "Fraction!";
                }
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", rangeNumbers[indexRange], sumSeparateDigits[indexRange], rangeNumbers[indexRange], sumSeparateDigits[indexRange], controlType);
            indexRange++;
        }
        System.out.println("Count of whole numbers - " + count);
    }

    public static void calculateSumNumbersMethodDoWhile(int[] rangeNumbers) {
        int indexRange = 0;
        int indexSymbol = 0;
        int sumSymbolsInIndex = 0;
        int[] sumSeparateDigits = new int[rangeNumbers.length];
        do {
            do {
                sumSymbolsInIndex += Character.getNumericValue(String.valueOf(rangeNumbers[indexRange]).charAt(indexSymbol));
                indexSymbol++;
            } while (indexSymbol < String.valueOf(rangeNumbers[indexRange]).length());
            sumSeparateDigits[indexRange] = sumSymbolsInIndex;
            if (String.valueOf(Math.abs(rangeNumbers[indexRange])).length() == 1) {
                sumSeparateDigits[indexRange] = 1;
            }
            indexSymbol = 0;
            sumSymbolsInIndex = 0;
            indexRange++;
        } while (indexRange < rangeNumbers.length);

        indexRange = 0;
        String controlType;
        System.out.println("\nMethod 3: \"Do-While\"");
        int count = 0;
        do {
            if (rangeNumbers[indexRange] <= 0 && !(String.valueOf(Math.abs(rangeNumbers[indexRange])).length() == 1)) {
                sumSeparateDigits[indexRange]++;
            }
            if (sumSeparateDigits[indexRange] == 0 || rangeNumbers[indexRange] == 0) {
                controlType = "By zero!";
                sumSeparateDigits[indexRange] = 0;
            } else {
                if (rangeNumbers[indexRange] % sumSeparateDigits[indexRange] == 0) {
                    controlType = "Whole!";
                    count++;
                } else {
                    controlType = "Fraction!";
                }
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", rangeNumbers[indexRange], sumSeparateDigits[indexRange], rangeNumbers[indexRange], sumSeparateDigits[indexRange], controlType);
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

    public static void display(int[] arrayInt) {
        String displayRangeNumbers = "";
        for (int i = 0; i < arrayInt.length; i++) {
            displayRangeNumbers = displayRangeNumbers + arrayInt[i];
            if (i < arrayInt.length - 1) {
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

