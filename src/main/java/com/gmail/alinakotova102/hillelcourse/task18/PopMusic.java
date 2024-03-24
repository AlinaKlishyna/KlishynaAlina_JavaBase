package com.gmail.alinakotova102.hillelcourse.task18;

public class PopMusic extends MusicStyles {

    public PopMusic(String group) {
        super(group);
    }

    @Override
    public String playMusic() {
        return String.format("Play \"%s\"- pop music", super.getGroup());
    }
}