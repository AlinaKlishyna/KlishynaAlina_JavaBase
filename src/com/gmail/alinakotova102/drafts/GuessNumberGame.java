package com.gmail.alinakotova102.drafts;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.print("The program guessed 3 numbers in the range 0-10. Try to guess it in three tries!\n");
        System.out.println("All your numbers guessed: ");
        int[] guessNumberUser = enterNumbersUserConsole();
        int[] lookupNumberPC = createLookupRandomNumber();

        System.out.print("All your guessed numbers: ");
        displayLookupNumber(guessNumberUser);

        System.out.println("\nLet's check your numbers");
        checkHavingNumbers(guessNumberUser, lookupNumberPC);
        System.out.print("I wished for such numbers: ");
        displayLookupNumber(lookupNumberPC);
    }
    public static int[] createLookupRandomNumber(){
        int[] numberRange = new int[3];
        for (int i = 0; i < numberRange.length; i++){
            numberRange[i] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return numberRange;
    }

    public static void displayLookupNumber(int[] valueRandom){
        for (int i = 0; i < valueRandom.length; i++){
            System.out.print(" " + valueRandom[i] + " ");
        }
    }

    public static int[] enterNumbersUserConsole(){
        Scanner valueGuessUser = new Scanner(System.in);
        int[] numberGuessed = new int[3];
        for (int i = 0; i < numberGuessed.length; i++){
            System.out.print("Your number №" + (i+1) + ": ");
            numberGuessed[i] = valueGuessUser.nextInt();
        }
        return numberGuessed;
    }

    public static void checkHavingNumbers(int[] numbersUser, int[] numberPC){


    }
}



