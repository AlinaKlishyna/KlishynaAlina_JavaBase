package com.gmail.alinakotova102.task18;

public class RockMusic extends MusicStyles{
    public RockMusic(String group) {
        super.group = group;
        playMusic(group);
    }

    @Override
    public String playMusic(String group) {
        return String.format("Play \"%s\"- rock music", group);
    }
}