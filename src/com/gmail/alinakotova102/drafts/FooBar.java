package com.gmail.alinakotova102.drafts;

import java.util.Scanner;

public class FooBar {
    /**
     * називається FooBar. користувач вводить два числа (вказує проміжок). потрібно вивести всі числа з цього проміжку. але при цьому
     * 1) якщо число ділиться на 3, то замість числа надрукувати Foo
     * 2) якщо число ділиться на 5, то надрукувати Bar
     * 3) інакше надрукувати саме число
     * врахуй що число можен одночасно ділитись і на 3 і на 5
     */

    public static void main(String[] args) {
        System.out.print("Enter point A: ");
        int pointA = createPoint();

        System.out.print("Enter point B: ");
        int pointB = createPoint();

        if (pointA > pointB) {
            int c = pointA;
            pointA = pointB;
            pointB = c;
        }
        int[] rangeNumbers = createRange(pointA, pointB);
        displayArray(rangeNumbers);
        modifiedNumbers(rangeNumbers);
    }

    public static void modifiedNumbers(int[] numbers) {
        System.out.print("Modified numbers: ");
        for (int index : numbers) {
            if (index % 3 == 0 & index % 5 == 0) {
                if (index == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print("FooBar ");
                }
            } else if (index % 5 == 0) {
                System.out.print("Bar ");
            } else if (index % 3 == 0) {
                System.out.print("Foo ");
            } else {
                System.out.print(index + " ");
            }
        }
    }

    public static int[] createRange(int pointA, int pointB) {
        int[] rangeNumbers = new int[(pointB - 1) - pointA];
        for (int i = 0; i < rangeNumbers.length; i++) {
            rangeNumbers[i] = (pointA + 1);
            pointA++;
        }
        return rangeNumbers;
    }

    public static int createPoint() {
        Scanner number = new Scanner(System.in);
        while (!number.hasNextInt()) {
            System.out.println("Non valid! Enter again: ");
            number.next();
        }
        return number.nextInt();
    }

    public static void displayArray(int[] array) {
        System.out.print("Numbers in range: ");
        for (int index : array) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
