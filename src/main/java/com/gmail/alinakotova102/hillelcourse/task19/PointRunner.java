package com.gmail.alinakotova102.hillelcourse.task19;

import static com.gmail.alinakotova102.hillelcourse.task19.Point.getDistance;

public class PointRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point start = new Point(3, 5);
        start.currentCoordinates("start");
        System.out.println("Point start. Get x = " + start.getX());

        Point middle = new Point(12, 5);
        middle.currentCoordinates("middle");

        System.out.println("\nDistance: ");
        System.out.println(start.getDistance(middle));
        Point another = new Point(0, 0);
        System.out.println(getDistance(another, middle));

        System.out.println("\nCompare: ");
        System.out.println("start " + start.toString());
        System.out.println("middle " + middle.toString());
        System.out.println("Point start == Point middle: " + start.equals(middle));
        System.out.println("Point middle == Point start: " + middle.equals(start));
        start.setX(12);
        System.out.println("start " + start.toString());
        System.out.println("Point start == Point middle: " + start.equals(middle));
        System.out.println("Point start == null: " + start.equals(null));

        Point end = start.clone();
        System.out.println("end " + end.toString());
        System.out.println("Point start == Point end: " + start.equals(end));
        System.out.println("\nHash code start: " + start.hashCode() + "\nHash code middle: " + middle.hashCode() +
                "\nHash code end: " + end.hashCode());
    }
}