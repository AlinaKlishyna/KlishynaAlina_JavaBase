package com.gmail.alinakotova102.hillelcourse.task18;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String group) {
        super(group);
    }

    @Override
    public String playMusic() {
        return String.format("Play \"%s\"- %s music", super.getGroup(), "classic");
    }
}