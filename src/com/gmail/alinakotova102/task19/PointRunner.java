package com.gmail.alinakotova102.task19;

public class PointRunner {
    public static void main(String[] args) {
        Point pointA = new Point(3, 5);

        pointA.currentCoordinates("A");
        System.out.println("Point A. Get x = " + pointA.getX());

        pointA.setX(5);
        pointA.currentCoordinates("B");

        Point pointB = new Point(2, 6);

        System.out.println("\nDistance: ");
        System.out.println(pointA.getDistance(pointB));
        System.out.println(pointA.getDistance(pointA, pointB));
    }
}