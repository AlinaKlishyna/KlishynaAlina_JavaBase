package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.lista_filtrata;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Lidl", "Tony Stark"));
        library.addBook(new Book("Radio", "Diddy Toki"));
        library.addBook(new Book("Takio", "Jerry Stark"));
        library.addBook(new Book("Radeo", "Tony Stark"));

        for (Book book : library.books) {
            if (book.getAuthor().equalsIgnoreCase("Tony Stark"))
                System.out.println(book);
        }
    }
}
