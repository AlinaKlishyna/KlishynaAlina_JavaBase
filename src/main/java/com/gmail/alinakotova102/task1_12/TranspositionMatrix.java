package com.gmail.alinakotova102.task1_12;

import java.util.Arrays;
import java.util.Scanner;

public class TranspositionMatrix {
    public static void main(String[] args) {
        System.out.print("Matrix transportation\nEnter length: ");
        int length = enterNumberUser();
        System.out.print("Enter weight: ");
        int weight = enterNumberUser();

        int[][] initialMatrix = createMatrix(length, weight);
        System.out.println("\nInitial matrix: ");
        displayMatrix(initialMatrix);

        System.out.println("\nTransported matrix: ");
        int[][] transposedMatrix = transposeMatrix(initialMatrix);
        displayMatrix(transposedMatrix);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] modMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                modMatrix[j][i] = matrix[i][j];
            }
        }
        return modMatrix;
    }

    public static int[][] createMatrix(int length, int weight) {
        int[][] matrix = new int[length][weight];
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print(Arrays.toString(row) + "\t");
            System.out.println();
        }
    }

    public static int enterNumberUser() {
        Scanner numberUser = new Scanner(System.in);
        while (true) {
            if (numberUser.hasNextInt()) {
                int number = numberUser.nextInt();
                if (number > 0 && number < 999) {
                    return number;
                } else {
                    System.out.print("Enter number in the range [1 - 999]: ");
                }
            } else {
                System.out.print("Number non valid! Enter again: ");
            }
            numberUser.nextLine();
        }
    }
}