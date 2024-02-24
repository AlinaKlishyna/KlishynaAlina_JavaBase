package com.gmail.alinakotova102.task19;

public class PointRunner {
    public static void main(String[] args) {
        Point pointA = new Point(3, 5);

        pointA.currentCoordinates();
        System.out.println("Point A. Get x = " + pointA.getX());

        pointA.setX(5);
        pointA.currentCoordinates();

        Point pointB = new Point(2, 6);
        System.out.println(pointA.distance(pointA, pointB));
    }
}
