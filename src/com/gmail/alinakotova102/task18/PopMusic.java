package com.gmail.alinakotova102.task18;

public class PopMusic extends MusicStyles{

    public PopMusic(String group) {
        super.group = group;
        playMusic(group);
    }

    @Override
    public String playMusic(String group) {
        return String.format("Play \"%s\"- pop music", group);
    }
}