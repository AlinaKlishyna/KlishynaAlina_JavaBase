package com.gmail.alinakotova102.corsoRanstad.enums;

public enum State {
    OFF,
    ON,
    PAUSE;

    private int transition;

    State() {
        this.transition = transition(this);
    }

    public int getTransition() {
        return transition;
    }

    private int transition(State state) {
        return switch (state) {
            case OFF -> -1;
            case ON -> 1;
            case PAUSE -> 0;
        };
    }
}
