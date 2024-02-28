package com.gmail.alinakotova102.task19;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this(point.x, point.y);
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
        System.out.printf("Point %s - current Coordinates: [%d][%d]\n", name, x, y);
    }

    public double getDistance(Point end) {
        Point init = new Point(x,y);
        return getDistance(init, end);
    }

    public double getDistance(Point init, Point end) {
        if (init == null || end == null){
            System.out.println("One of the points is null!");
            return 0.0;
        }
        return Math.sqrt((Math.pow((end.x - init.x), 2) + (Math.pow((end.y - init.y), 2))));
    }

    @Override
    public String toString() {
        return String.format("(%d; %d)", x, y);
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not possible");
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        return x == ((Point) o).x && y == ((Point) o).y;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result + x;
        result = result + y;
        return result;
    }
}