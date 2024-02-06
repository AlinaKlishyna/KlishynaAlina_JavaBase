package com.gmail.alinakotova102.drafts;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        int[] team1 = createTeam();
        int[] team2 = createTeam();

       // System.out.println(statistics(createTeam(), createTeam()));
    }

    public static int[] createTeam(){
        int []killUserGame = new int[5];
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter new name of team: ");
        String nameTeam = scanner.next();


        for (int i = 0; i < killUserGame.length; i++){
            System.out.print("Enter kills for user № " + (i+1) + ": ");
            killUserGame[i] = scanner.nextInt();

        }

        System.out.println("Created team \"" + nameTeam + "\"");
        for (int i = 0; i < killUserGame.length; i++){
            System.out.println("User №" + (i+1) + "-> Killed: " + killUserGame[i]);
        }

        return killUserGame;
    }

    public static void statistics(int[] team1, int[] team2){
        for (int i = 0; i < team1.length; i++){
            for (int j = 0; j < team2.length; i++){
                System.out.println("User №" + (i + 1) + team1[i] + "   " + team2[j]);
            }
        }
    }
}
