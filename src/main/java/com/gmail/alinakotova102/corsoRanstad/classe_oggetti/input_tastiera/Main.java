package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.input_tastiera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title of the book: ");
        String title = scanner.nextLine();

        System.out.println("Enter the author's name: ");
        String author = scanner.nextLine();

        Book book = new Book(title, author);
        System.out.println(book);
    }
}
