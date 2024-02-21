package com.gmail.alinakotova102.task18;

public class ClassicMusic extends MusicStyles{
    private String style;

    public String getStyle() {
        return "classic";
    }

    public ClassicMusic(String group) {
        super.group = group;
        playMusic(group);
    }

    @Override
    public String playMusic(String group) {
        return String.format("Play \"%s\"- %s music", group, getStyle());
    }
}