package com.gmail.alinakotova102;

import java.util.Scanner;

public class CounterStrike {
    public static Scanner userInputConsole = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter name for new Police team: ");
        String policeTeam = createNameTeam();

        System.out.print("Enter name for new Terrorists team: ");
        String terroristsTeam = createNameTeam();

        System.out.printf("Enter the number of killings for 5 players of Police team \"%s\":\n", policeTeam);
        int oneUserPoliceKilled = enterCountKills();
        int twoUserPoliceKilled = enterCountKills();
        int threeUserPoliceKilled = enterCountKills();
        int fourUserPoliceKilled = enterCountKills();
        int fiveUserPoliceKilled = enterCountKills();
        displayStatisticTeam(policeTeam, oneUserPoliceKilled, twoUserPoliceKilled, threeUserPoliceKilled,
                fourUserPoliceKilled, fiveUserPoliceKilled);

        System.out.printf("Enter the number of killings for 5 players of Terrorists team \"%s\":\n", terroristsTeam);
        int oneUserTerroristKilled = enterCountKills();
        int twoUserTerroristKilled = enterCountKills();
        int threeUserTerroristKilled = enterCountKills();
        int fourUserTerroristKilled = enterCountKills();
        int fiveUserTerroristKilled = enterCountKills();
        displayStatisticTeam(terroristsTeam, oneUserTerroristKilled, twoUserTerroristKilled,
                threeUserTerroristKilled, fourUserTerroristKilled, fiveUserTerroristKilled);

        double averageAllKillsPoliceTeam = calculateTotalCountKills(oneUserPoliceKilled, twoUserPoliceKilled,
                threeUserPoliceKilled, fourUserPoliceKilled, fiveUserPoliceKilled);
        double averageAllKillsTerroristsTeam = calculateTotalCountKills(oneUserTerroristKilled, twoUserTerroristKilled,
                threeUserTerroristKilled, fourUserTerroristKilled, fiveUserTerroristKilled);

        displayMessageTeamWinter(policeTeam, averageAllKillsPoliceTeam, terroristsTeam, averageAllKillsTerroristsTeam);
    }

    public static String createNameTeam() {
        return userInputConsole.next();
    }

    public static int enterCountKills() {
        while (!userInputConsole.hasNextInt()) {
            System.out.println("Non valid value! Enter number again");
            userInputConsole.next();
        }
        return Integer.parseInt(userInputConsole.next());
    }

    public static void displayStatisticTeam(String nameTeam, int userOneKilled, int userTwoKilled, int userThreeKilled,
                                            int userFourKilled, int userFiveKilled) {
        System.out.printf("Team: %s\nUser №1 = %d\nUser №2 = %d\nUser №3 = %d\nUser №4 = %d\nUser №5 = %d\n", nameTeam,
                userOneKilled, userTwoKilled, userThreeKilled, userFourKilled, userFiveKilled);
    }

    public static double calculateTotalCountKills(int userOneKilled, int userTwoKilled, int userThreeKilled,
                                                  int userFourKilled, int userFiveKilled) {
        return (double) (userOneKilled + userTwoKilled + userThreeKilled + userFourKilled + userFiveKilled) / 5;
    }

    public static void displayMessageTeamWinter(String namePoliceTeam, double totalCountAllKilledPoliceTeam,
                                                String nameTerroristsTeam, double totalCountAllKilledTerroristsTeam) {
        System.out.printf("\nThe average number of all killings\nTeam police \"%s\" = %.3f\nTeam terrorists \"%s\" " +
                        "= %.3f\n",
                namePoliceTeam, totalCountAllKilledPoliceTeam, nameTerroristsTeam, totalCountAllKilledTerroristsTeam);

        double precision = 0.00001;
        if (Math.abs(totalCountAllKilledTerroristsTeam - totalCountAllKilledPoliceTeam) < precision) {
            System.out.print("\nThe team of the winner - Draw! (The same number of points %.3f)");
        } else {
            if (totalCountAllKilledPoliceTeam > totalCountAllKilledTerroristsTeam) {
                System.out.printf("\nThe police team of the winner \"%s\" with the count of points - %.3f",
                        namePoliceTeam, totalCountAllKilledPoliceTeam);
            } else {
                System.out.printf("\nThe terrorists team of the winner \"%s\" with the count of points - %.3f",
                        nameTerroristsTeam, totalCountAllKilledTerroristsTeam);
            }
        }
    }
}