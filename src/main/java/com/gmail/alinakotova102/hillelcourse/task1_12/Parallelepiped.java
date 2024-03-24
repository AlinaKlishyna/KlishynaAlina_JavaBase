package com.gmail.alinakotova102.hillelcourse.task1_12;

public class Parallelepiped {
    public static void main(String[] args) {
        byte length = 10;
        byte width = 15;
        byte height = 20;
        byte totalEdges = 4;

        int volume = length * width * height;
        System.out.println("Volume of the parallelepiped = " + volume);

        short totalLengthSides = (short) ((totalEdges * length) + (totalEdges * width) + (totalEdges * height));
        System.out.println("The total length of the sides = " + totalLengthSides);
    }
}