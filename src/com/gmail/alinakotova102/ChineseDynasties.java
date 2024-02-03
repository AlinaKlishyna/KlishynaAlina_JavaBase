package com.gmail.alinakotova102;

public class ChineseDynasties {
    public static void main(String[] args) {
        byte warriorLee = 13;
        byte archerLee = 24;
        byte topmanLee = 46;

        byte warriorMinh = 9;
        byte archerMinh = 35;
        byte topmanMinh = 12;

        System.out.println("Total attack of the army dynasties Lee: " + calculateTotalAttackDynasty(warriorLee, archerLee, topmanLee, 860));
        System.out.println("Total attack of the army dynasties Minh: " + calculateTotalAttackDynasty(warriorMinh, archerMinh, topmanMinh, (int) (860 * 1.5)));
    }

    public static int calculateTotalAttackDynasty(int warrior, int archer, int topman, int eachTypeWarriors) {
        int totalAttack = eachTypeWarriors * (warrior + archer + topman);
        return totalAttack;
    }
}
