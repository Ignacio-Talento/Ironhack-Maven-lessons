package com.ironhack.w2.d1.CFU;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String lastName;
    private List<Book> publishedBooks;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.publishedBooks = new ArrayList<>();
    }

    public void addBook(Book book){
        this.publishedBooks.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }
}
