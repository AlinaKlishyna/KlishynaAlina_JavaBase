package com.gmail.alinakotova102.task1_12;

import java.util.concurrent.ThreadLocalRandom;

public class RugbyFootball {
    static int minAge = 18;
    static int maxAge = 40;
    static int countPlayers = 25;

    public static void main(String[] args) {
        int[] teamFirst = createTeam(countPlayers);
        int[] teamSecond = createTeam(countPlayers);

        displayStatisticsConsole("First", teamFirst);
        displayStatisticsConsole("Second", teamSecond);

        double averageAgeFirstTeam = averageAge(teamFirst);
        double averageAgeSecondTeam = averageAge(teamSecond);

        displayAverageAgeTeams("First", averageAgeFirstTeam);
        displayAverageAgeTeams("Second", averageAgeSecondTeam);
    }

    public static int[] createTeam(int countAllPlayers) {
        int[] teamPlayers = new int[countAllPlayers];
        for (int element = 0; element < teamPlayers.length; element++) {
            teamPlayers[element] = ThreadLocalRandom.current().nextInt(minAge, maxAge);
        }
        return teamPlayers;
    }

    public static double averageAge(int[] team) {
        double sum = 0;
        for (int element : team) {
            sum += element;
        }
        return sum / countPlayers;
    }

    public static void displayStatisticsConsole(String nameTeam, int[] team) {
        int numberUser = 1;
        for (int element : team) {
            System.out.printf("№%d - %d(Team \"%s\") ", numberUser, element, nameTeam);
            numberUser++;
        }
        System.out.println();
    }

    public static void displayAverageAgeTeams(String nameTeam, double averageAge){
        System.out.printf("Team \"%s\": %.3f\n", nameTeam, averageAge);
    }
}