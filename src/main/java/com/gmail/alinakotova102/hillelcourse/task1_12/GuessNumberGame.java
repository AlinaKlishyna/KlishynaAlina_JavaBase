package com.gmail.alinakotova102.hillelcourse.task1_12;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.print("The program guessed one number in the range 0-10. Try to guess it in three tries!\n");
        int lookupNumberPC = createLookupRandomNumber();

        enterNumbersUserConsole(lookupNumberPC);
    }

    public static void enterNumbersUserConsole(int valueGuessedPC) {
        Scanner valueEnteredUser = new Scanner(System.in);
        int numberUser;
        for (int i = 0; i < 3; i++) {
            System.out.print("Your number №" + (i + 1) + ": ");
            numberUser = valueEnteredUser.nextInt();
            while (numberUser > 10 || numberUser < 0) {
                System.out.println("Your number is out of range! Enter again: ");
                numberUser = Integer.parseInt(valueEnteredUser.next());
            }
            if (numberUser == valueGuessedPC) {
                System.out.println("You guessed it! This number - " + valueGuessedPC);
                break;
            } else if (i == 2) {
                System.out.println("Game over! All attempts are exhausted.\nI wished for a number - " + valueGuessedPC);
            } else {
                System.out.printf("Try again! Attempt %d/3\n", (i + 1));
            }
        }
    }

    public static int createLookupRandomNumber() {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }
}