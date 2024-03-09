package com.gmail.alinakotova102.task16;

public class TrackerRunner {
    public static void main(String[] args) {
        FitnessTracker jobCemeron = new FitnessTracker("Job", "Cemeron", (byte) 11, (byte) 6, (short) 1986, "cemeron@gmail.com", 1961234588L, 77, 120, 1090);
        jobCemeron.printAccountInfo();

        FitnessTracker raineLobowsky = new FitnessTracker("Raine", "Lobowsky", (byte) 10, (byte) 10, (short) 2005, "lobowsky2005@gmail.com", 4933458221L, 70, 130, 120);
        raineLobowsky.printAccountInfo();

        System.out.printf("Data changed for person: %s %s\n", raineLobowsky.getName(), raineLobowsky.getLastName());
        raineLobowsky.setLastName("Ribb");
        raineLobowsky.printAccountInfo();

        FitnessTracker ronRage = new FitnessTracker("Ron", "Rage", (byte) 7, (byte) 12, (short) 1999, "rage@gmail.com", 8672937462L, 83, 125, 566);
        ronRage.printAccountInfo();

        System.out.printf("Data changed for person: %s %s\n", ronRage.getName(), ronRage.getLastName());
        ronRage.setWeight(90);
        ronRage.setStepsOneDay(12000);
        ronRage.printAccountInfo();

        FitnessTracker rosaTrick = new FitnessTracker("Rosa", "Trick", (byte) 2, (byte) 2, (short) 1988, "rosa202@gmail.com", 9983435212L, 51, 95, 5493);
        rosaTrick.printAccountInfo();

        System.out.printf("Data changed for person: %s %s\n", rosaTrick.getName(), rosaTrick.getLastName());
        rosaTrick.setLastName("Blot");
        rosaTrick.setStepsOneDay(999);
        rosaTrick.setWeight(55);
        rosaTrick.setPressure(122);
        rosaTrick.printAccountInfo();
    }
}