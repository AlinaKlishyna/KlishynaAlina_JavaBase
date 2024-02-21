package com.gmail.alinakotova102.task18;

public class MusicRunner {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = new MusicStyles[3];
        musicStyles[0] = new ClassicMusic("Mozart");
        musicStyles[1] = new PopMusic("BTS");
        musicStyles[2] = new RockMusic("Led Zeppelin");

        for (MusicStyles element : musicStyles) {
            System.out.println(element.playMusic(element.group));
        }
    }
}