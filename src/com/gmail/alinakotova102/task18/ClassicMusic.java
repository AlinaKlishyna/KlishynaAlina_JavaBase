package com.gmail.alinakotova102.task18;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String group) {
        super(group);
        playMusic();
    }

    @Override
    public String playMusic() {
        return String.format("Play \"%s\"- %s music", super.getGroup(), "classic");
    }
}