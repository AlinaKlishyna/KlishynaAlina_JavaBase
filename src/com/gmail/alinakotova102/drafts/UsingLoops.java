package com.gmail.alinakotova102.drafts;

import java.util.Scanner;

public class UsingLoops {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i <10){
            while (j<10){
                //System.out.println(i*j);
                j++;
                i++;
            }
        }
        int [] test = new int[]{11,12,13,14};
        calculateSumNumbersMethodWhile(test);
    }

    public static void calculateSumNumbersMethodWhile(int[] rangeNumbers) {
        int i =0;
        int j =0;
        int sum = 0;
        int[] sumSeparateNumbers = new int[rangeNumbers.length];
        while (i < rangeNumbers.length) {
            j = 0;
            while (j < String.valueOf(rangeNumbers[i]).length()) {
                sum += Character.getNumericValue(String.valueOf(rangeNumbers[i]).charAt(j));
                j++;

            }
            sumSeparateNumbers[i] = sum;
            sum =0;
            i++;
        }
        int t = 0;
        while (t < sumSeparateNumbers.length) {
            System.out.println(sumSeparateNumbers[t]);
            t++;
        }

    }

    public static void calculateSumTheirNumberMethodWhile(int numberUsingConsole){
        int countNumber = String.valueOf(numberUsingConsole).length();
        int [] partNumbers = new int[countNumber];
        for (int i = 0; i < partNumbers.length; i++){
            partNumbers[i] = Character.getNumericValue(String.valueOf(numberUsingConsole).charAt(i));
        }
        int sumNumbers = sumAllNumbersArrayInt(partNumbers);
        System.out.println(sumNumbers);

    }

    public static int sumAllNumbersArrayInt(int[] arrayInt){
        int sumAllNumbers = 0;
        for (int i = 0; i < arrayInt.length; i++){
            sumAllNumbers += arrayInt[i];
        }
        return sumAllNumbers;
    }

    public static int enterNumberUser(){
        Scanner wholeNumber = new Scanner(System.in);
        while (!wholeNumber.hasNextInt()){
            System.out.print("Error! Non valid number! Try again.\nEnter number: ");
            wholeNumber.next();
        }
        return wholeNumber.nextInt();
    }

    public static void calculateSumNumbersMethodFor(int initialLimit, int finalLimit){
        int [] rangeNumbers = new int[(finalLimit - initialLimit)-1];
        int index = 0;
        for (int j = initialLimit+1; j < finalLimit; j++){
            rangeNumbers[index++] = j;
        }

        System.out.print("Range between numbers: ");
        //displayNumbersArrayInt(rangeNumbers);
        String controlTypeInt;
        int []finalPart = new int[rangeNumbers.length];
        int []startPart = new int[rangeNumbers.length];
        int []sumSeparateNumbers = new int[rangeNumbers.length];
        for (int i = 0; i < rangeNumbers.length; i++){
            finalPart[i]= rangeNumbers[i] % 10;
            startPart[i] =rangeNumbers[i] /10;
            sumSeparateNumbers[i] = startPart[i] + finalPart[i];
            if (rangeNumbers[i]%sumSeparateNumbers[i] == 0){
                controlTypeInt = "Whole!";
            }else {
                controlTypeInt = "Fraction!";
            }
            System.out.printf("Number - %d | Sum of numbers - %d | Type %d/%d - %s\n", rangeNumbers[i], sumSeparateNumbers[i], rangeNumbers[i], sumSeparateNumbers[i], controlTypeInt);
        }
    }
}