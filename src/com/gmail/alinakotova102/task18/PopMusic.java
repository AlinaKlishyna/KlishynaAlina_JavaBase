package com.gmail.alinakotova102.task18;

public class PopMusic extends MusicStyles {

    public PopMusic(String group) {
        super(group);
        playMusic();
    }

    @Override
    public String playMusic() {
        return String.format("Play \"%s\"- pop music", super.getGroup());
    }
}