package com.gmail.alinakotova102.task18;

public class MusicRunner {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = {
                new ClassicMusic("Mozart"),
                new PopMusic("BTS"),
                new RockMusic("Led Zeppelin")};

        for (MusicStyles objects : musicStyles) {
            System.out.println(objects.playMusic());
        }
    }
}