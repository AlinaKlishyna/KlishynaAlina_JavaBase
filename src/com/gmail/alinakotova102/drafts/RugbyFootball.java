package com.gmail.alinakotova102.drafts;

import java.util.concurrent.ThreadLocalRandom;

public class RugbyFootball {
    static int minAge = 18;
    static int maxAge = 40;
    static int countPlayers = 25;

    public static void main(String[] args) {
        int[] teamFirst = createTeam(randomNumber());
        int[] teamSecond = createTeam(randomNumber());

        displayStatisticsConsole("First", teamFirst);
        displayStatisticsConsole("Second", teamSecond);

        averageAge("First", teamFirst);
        averageAge("Second", teamSecond);
    }

    public static int[] createTeam(int age) {
        int[] teamPlayers = new int[countPlayers];
        int index = 0;
        for (int element : teamPlayers) {
            teamPlayers[index] = age;
            index++;
        }
        return teamPlayers;
    }

    public static void averageAge(String nameTeam, int[] team) {
        int sum = 0;
        for (int element : team) {
            sum += element;
        }
        int average = sum / countPlayers;
        System.out.printf("Team \"%s\": %d\n", nameTeam, average);
    }

    public static void displayStatisticsConsole(String nameTeam, int[] team) {
        int numberUser = 1;
        for (int element : team) {
            System.out.printf("№%d - %d(Team \"%s\") ", numberUser, element, nameTeam);
            numberUser++;
        }
        System.out.println();
    }

    public static int randomNumber() {
        return ThreadLocalRandom.current().nextInt(minAge, maxAge);
    }
}
