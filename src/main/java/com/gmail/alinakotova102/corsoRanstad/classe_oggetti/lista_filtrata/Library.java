package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.lista_filtrata;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book!=null)
            books.add(book);
    }
}
