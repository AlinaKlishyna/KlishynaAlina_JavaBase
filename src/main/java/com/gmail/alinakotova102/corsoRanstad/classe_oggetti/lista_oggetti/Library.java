package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.lista_oggetti;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book!=null)
            books.add(book);
    }

    public Book findBook(String title) {
        Book findBook = null;
        for (Book book : books) {
            if (title.equalsIgnoreCase(book.getTitle()))
                findBook = book;
        }
        return findBook;
    }
}
