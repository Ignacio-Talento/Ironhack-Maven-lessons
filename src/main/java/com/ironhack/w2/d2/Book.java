package com.ironhack.w2.d2;

import java.util.Objects;

public class Book {
    private long isbn;
    private String title;
    private String author;
    private int publishedYear;

    public Book(long isbn, String title, String author, int publishedYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && publishedYear == book.publishedYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, publishedYear);
    }

    public static Book getHarryPotter() {
        return new Book(1234, "Harry Potter", "J.K. Rowling", 1997);
    }
}
