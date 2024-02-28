package com.gmail.alinakotova102.drafts.ovveridetests;

public class Book {
    private String title;

    public Book(String title){
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        return this.title.equals(((Book) o).title);
    }
}