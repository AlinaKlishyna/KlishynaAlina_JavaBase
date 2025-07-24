package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.lista_oggetti;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Marry Christmas!", 2002));
        library.addBook(new Book("Giochi per bambini", 2017));
        library.addBook(new Book("Africa", 2025));

        System.out.println(library.findBook("Africa"));
    }
}
