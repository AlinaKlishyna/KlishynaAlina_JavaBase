package com.gmail.alinakotova102.task19;

public class PointRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point pointA = new Point(3, 5);
        pointA.currentCoordinates("A");
        System.out.println("Point A. Get x = " + pointA.getX());

        Point pointB = new Point(12, 5);
        pointB.currentCoordinates("B");

        System.out.println("\nDistance: ");
        System.out.println(pointA.getDistance(pointB));
        Point another = new Point(0,0);
        System.out.println(pointA.getDistance(another, pointB));

        System.out.println("\nCompare: ");
        System.out.println("Point A == Point B: " + pointA.equals(pointB));
        System.out.println("Point B == Point A: " + pointB.equals(pointA));
        pointA.setX(12);
        System.out.println("Point A == Point B: " + pointA.equals(pointB));
        System.out.println("Point A == null: " + pointA.equals(null));

        System.out.println("A " + pointA.toString());

        Point pointC = pointA.clone();
        System.out.println("C " + pointC.toString());
        System.out.println("Point A == Point C: " + pointA.equals(pointC));
    }
}