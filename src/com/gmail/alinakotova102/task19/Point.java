package com.gmail.alinakotova102.task19;

public class Point extends Object{
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

    public void currentCoordinates(String name) {
        System.out.printf("Point %s - current Coordinates: [%d][%d]\n", name, getX(), getY());
    }

    public double getDistance(Point point) {
        return getDistance(getX(), getY(), point.getX(), point.getY());
    }

    public double getDistance(Point pointInit, Point pointFinal) {
        return getDistance(pointInit.getX(), pointInit.getY(), pointFinal.getX(), pointFinal.getY());
    }

    public double getDistance(int xA, int yA, int xB, int yB) {
        return Math.sqrt((Math.pow((xB - xA), 2) + (Math.pow((yB - yA), 2))));
    }

    @Override
    public boolean equals(Object o){
        if (o == null & this == null || getClass() != o.getClass() || !(o instanceof Point)){
            return false;
        }
        if (this == o){
            return true;
        }
        Point other = (Point) o;
        return other.getX() == this.getX() & other.getY() == this.getY();
    }
}