package com.gmail.alinakotova102.task18;

public class RockMusic extends MusicStyles {
    public RockMusic(String group) {
        super(group);
        playMusic();
    }


    @Override
    public String playMusic() {
        return String.format("Play \"%s\"- rock music", super.getGroup());
    }
}