package com.ironhack.w2.d1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ironhack.w2.d1.CFU.Author;
import com.ironhack.w2.d1.CFU.Book;
import com.ironhack.w2.d1.CFU.Invoice;
import com.ironhack.w2.d1.CFU.InvoiceItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Pulp Fiction", 140);
        Movie movie2 = new Movie("Kill Bill Vol 1", 180);
        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        Director director = new Director("Quentin", "Tarantino", movieList);
        System.out.println(director);
        System.out.println(director.getDirectorName());
        System.out.println(director.getDirectedMoviesSize());

//        CFU: JSON and Maven

        // Create invoice items
        InvoiceItem cocaCola = new InvoiceItem("Coca Cola 2L", 10.0);
        InvoiceItem water = new InvoiceItem("Water", 1.5);
        InvoiceItem milk = new InvoiceItem("Milk", 2.5);

        // Create a list of invoice items
        List<InvoiceItem> items = new ArrayList<>();
        items.add(cocaCola);
        items.add(water);
        items.add(milk);

        // Create the invoice
        Invoice invoice = new Invoice("YMZ-0000001", 30.5, false, items);

        // Display invoice details
        System.out.println("Invoice ID: " + invoice.getId());
        System.out.println("Total: " + invoice.getTotal());
        System.out.println("Paid: " + invoice.isPaid());
        System.out.println("Items:");

        // Display all items
        for(InvoiceItem item :invoice.getInvoiceItems()){
            System.out.println("  - " + item.getName() + ": $" + item.getPrice());
        }

        // Create books
        Book book1 = new Book("The Great Novel", 320);
        Book book2 = new Book("Short Stories Collection", 180);
        Book book3 = new Book("Science Fiction Odyssey", 400);

        // Create author
        Author author = new Author("Jane", "Smith");

        // Add books to author´s published books
        author.addBook(book1);
        author.addBook(book2);
        author.addBook(book3);

        // Create Gson instance with pretty printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Convert author object to JSON and print
        String authorJson = gson.toJson(author);
        System.out.println(authorJson);


    }

}
