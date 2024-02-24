package com.gmail.alinakotova102.task19;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void currentCoordinates() {
        System.out.printf("Current Coordinates: [%d][%d]\n", getX(), getY());
    }

    public double distance(Point pointInit, Point pointFinal) {
        int xInit = pointInit.getX();
        int yInit = pointInit.getY();
        int xFinal = pointFinal.getX();
        int yFinal = pointFinal.getY();
        return Math.sqrt((Math.pow((xFinal - xInit), 2) + (Math.pow((yFinal - yInit), 2))));
    }
}