package com.gmail.alinakotova102.task18;

public abstract class MusicStyles {
    private String group;

    public MusicStyles(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public abstract String playMusic();
}