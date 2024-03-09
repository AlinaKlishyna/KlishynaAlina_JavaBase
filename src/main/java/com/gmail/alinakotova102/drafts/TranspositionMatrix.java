package com.gmail.alinakotova102.drafts;

public class TranspositionMatrix {
    public static void main(String[] args) {
        int[][] initialMatrix = createMatrix(5, 5);
        System.out.println("Initial matrix: ");
        displayMatrix(initialMatrix);
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }
    }
}